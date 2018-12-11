package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.beans.MongoDBData;
import com.better.knowledgepooling.domain.NdcDataEntity;
import com.mongodb.DBObject;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
}
