package com.srn.common.dao;

import com.mongodb.MongoClient;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.WriteConcern;
import com.mongodb.client.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.CreateViewOptions;
import com.srn.common.config.MongoConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class MongoImplClient implements MongoActionInterface{

    private MongoConfig mongoConfig;



    @Override
    public void createCollection(String collectionName) {

        try {
            mongoConfig = MongoConfig.getInstance();
            MongoClient mongoClient = mongoConfig.getMongoClient();
            MongoDatabase mongoDatabase = mongoClient.getDatabase("postgrad");
            mongoDatabase.createCollection(collectionName);
            log.info(" Trying to create Collection : " + collectionName);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void createDocument() {

    }

    @Override
    public void insertValue() {

    }
}
