package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.beans.MongoDBData;
import com.better.knowledgepooling.beans.MongoDBDataList;
import com.better.knowledgepooling.domain.NdcDataEntity;
import com.better.knowledgepooling.handlers.MongoDBHelper;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import net.sf.json.JSONObject;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class MongoDBController {

    @Resource
    private MongoDBHelper helper;
    @Resource
    private MongoTemplate mongoTemplate;

    @PostMapping(value ="/insert/json", produces = "application/json")
    public void insertData(@RequestBody MongoDBDataList dataList){
        SimpleDateFormat cdf = new SimpleDateFormat("yyyyMMdd");
        String collectionTime = cdf.format(new Date());
        String collectionName = "INOUT" + collectionTime;
        MongoDatabase database = helper.getMongoDataBase();
        MongoCollection<DBObject> collection = database.getCollection(collectionName, DBObject.class);
        for (JSONObject jsonData:dataList.getDatas()){
            jsonData.put("timestamp","2018-12-05");
            jsonData.discard("_id");
            String json =jsonData.toString();
            System.out.println(json);
            DBObject bson = (DBObject) JSON.parse(json);
            collection.insertOne(bson);
        }
    }

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
}
