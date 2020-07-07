package com.srn.common.dao;


import com.mongodb.client.*;
import com.srn.common.config.MongoConfig;
import com.srn.common.db.models.DocDescription;
import com.srn.common.db.repository.ProposalDescRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * This is the dao class interactoing with the database mongo db.
 *
 * */
@Slf4j
@Component
@ComponentScan(basePackages = "com.srn")
public class MongoImplClient implements MongoActionInterface{


    @Autowired
    ProposalDescRepository proposalDescRepository;




    @Override
    public void createCollection(String collectionName) {


       MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
       MongoDatabase mongoDatabase = mongoClient.getDatabase("postgrad");
       mongoDatabase.createCollection(collectionName);

       DocDescription docDescription = new DocDescription();
       docDescription.setContent("This is test");
       docDescription.setId("124");
        proposalDescRepository.save(docDescription);

        try {

    }catch (Exception e ){
        e.printStackTrace();}
    }

    @Override
    public void createDocument() {

    }

    @Override
    public void insertValue() {

    }
}
