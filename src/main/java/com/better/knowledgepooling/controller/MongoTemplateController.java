package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.beans.MongoDBData;
import com.better.knowledgepooling.domain.NdcDataEntity;
import com.mongodb.*;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Accumulators.sum;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Filters.eq;

@RestController
public class MongoTemplateController {

    @Resource
    private MongoTemplate mongoTemplate;

    @PostMapping(value ="/call/message", produces = "application/json")
    public List<MongoDBData> changeFormat(@RequestBody List<NdcDataEntity> ndcDataEntitys, String timestamp) {
        List<MongoDBData> mongoDBDatas = new ArrayList<>();
        MongoDBData mongoDBData = new MongoDBData();
        for(NdcDataEntity ndcDataEntity : ndcDataEntitys) {
            mongoDBData.setMessageversion(ndcDataEntity.getMessageversion());
            mongoDBData.setInOutId(ndcDataEntity.getInOutId());
            mongoDBData.setMessageid(ndcDataEntity.getMessageid());
            mongoDBData.setXmlmessage(ndcDataEntity.getXmlmessage());
            mongoDBData.setSubpartnerid(ndcDataEntity.getSubpartnerid());
            mongoDBData.setPartnerid(ndcDataEntity.getPartnerid());
            mongoDBData.setTimestamp(timestamp);
            mongoDBData.setPartnerusername(ndcDataEntity.getPartnerusername());
            mongoDBDatas.add(mongoDBData);
        }
        return mongoDBDatas;
    }

    @GetMapping(value ="/get/mongodb/data", produces = "application/json")
    public List<DBObject> getData(String fromCollectionName){
        List<DBObject> ndcDataEntitys = mongoTemplate.findAll(DBObject.class,fromCollectionName);
        return ndcDataEntitys;
    }

    @GetMapping(value ="/get/mongodb/query", produces = "application/json")
    public void testQuery(String fromCollectionName){
        MongoClient mongoClient = new MongoClient("cxndc:cxndc2018@ndcms-t0-dsv3a.mongodb.net", 27017);
        MongoDatabase db = mongoClient.getDatabase("ndcMsgJson_t0");
        MongoCollection<Document> collection = db.getCollection("INOUT20181227");
        BasicDBObject _match = new BasicDBObject();
        _match.put("messageid","ordercreate");
        _match.put("inouttype","In");
        BasicDBObject match = new BasicDBObject("$match", _match);
        BasicDBObject _group = new BasicDBObject();
        _group.put("partnerid","$partnerid");
        _group.put("subpartnerid","$subpartnerid");
        _group.put("messageid","$messageid");
        _group.put("AgencyID","$Body.OrderCreateRQ.Party.Sender.TravelAgency.AgencyID");
        BasicDBObject groupFields = new BasicDBObject("_id", _group);
        groupFields.put("count", new BasicDBObject("$sum", 1));
        BasicDBObject group = new BasicDBObject("$group", groupFields);
        AggregateIterable<Document> iterable = collection.aggregate(
                Arrays.asList(
                        match(eq("messageid", "ordercreate")
                        ),
                        group("$author", sum("totalWords", "$words"))));
        System.out.println("Hello,It's me!");
    }
}
