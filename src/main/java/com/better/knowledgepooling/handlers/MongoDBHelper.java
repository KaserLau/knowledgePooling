package com.better.knowledgepooling.handlers;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MongoDBHelper {

    @Value("${app.mongoClient.uri}")
    private String mongoClientUri;

    @Value("${app.dbName}")
    private String databaseName;


    private static MongoClient mongoClient = null;

    public MongoDBHelper() {
    }

    @Bean
    public MongoClient getMongoClient() {
        if (mongoClient == null) {
            MongoClientURI uri = new MongoClientURI(mongoClientUri);
            mongoClient = new MongoClient(uri);
        }
        return mongoClient;
    }

    public MongoDatabase getMongoDataBase() {
        MongoDatabase database = getMongoClient().getDatabase(databaseName);
        return database;
    }
}
