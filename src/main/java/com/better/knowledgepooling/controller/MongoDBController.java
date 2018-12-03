package com.better.knowledgepooling.controller;

import com.better.knowledgepooling.beans.MongoDBDataList;
import com.better.knowledgepooling.handlers.MongoDBHelper;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MongoDBController {

    @Resource
    private MongoDBHelper helper;

    @PostMapping(value ="/insert/json", produces = "application/json")
    public void insertData(@RequestBody MongoDBDataList dataList){
        SimpleDateFormat cdf = new SimpleDateFormat("yyyyMMdd");
        String collectionTime = cdf.format(new Date());
        String collectionName = "INOUT" + collectionTime;
        MongoDatabase database = helper.getMongoDataBase();
        MongoCollection<DBObject> collection = database.getCollection(collectionName, DBObject.class);
        for (JSONObject jsonData:dataList.getDatas()){
            String json =jsonData.toString();
            System.out.println(json);
            DBObject bson = (DBObject) JSON.parse(json);
            collection.insertOne(bson);
        }
    }
}
