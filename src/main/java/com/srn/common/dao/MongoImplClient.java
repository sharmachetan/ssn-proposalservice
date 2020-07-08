package com.srn.common.dao;



import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.*;
import com.srn.common.config.MongoConfig;
import com.srn.common.db.repository.ProposalDescRepository;
import com.srn.common.pojo.ProposalInfoPojo;
import com.srn.common.vo.NewPropposalVO;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


/**
 * This is the dao class interactoing with the database mongo db.
 */
@Slf4j
@Component
@ComponentScan(basePackages = "com.srn")
public class MongoImplClient implements MongoActionInterface {
    @Value("${database}")
    private String database;

    @Autowired
    ProposalDescRepository proposalDescRepository;

    @Autowired
    MongoConfig mongoConfig;


    @Override
    public void createCollection(JSONObject collectionInfo) {
        NewPropposalVO newPropposalVO=null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
             newPropposalVO = objectMapper.readValue(collectionInfo.toString(), NewPropposalVO.class);
        } catch (Exception e) {
            e.printStackTrace();
        }


        log.info(" ValueOfPojo" + newPropposalVO.getTitle());


//       MongoClient mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
        MongoClient mongoClient = mongoConfig.getMongoClientInstance();


        MongoDatabase mongoDatabase = mongoClient.getDatabase(database);

        // Collection name will be the title for proposal
        mongoDatabase.createCollection(newPropposalVO.getTitle());

        // Set values to Database Pojo
        ProposalInfoPojo proposalInfoPojo = new ProposalInfoPojo();
        proposalInfoPojo.setProposalTitle(newPropposalVO.getTitle());
        proposalInfoPojo.setOwner(newPropposalVO.getOwner());
        proposalInfoPojo.setDocType(newPropposalVO.getDocType());
        proposalInfoPojo.setContributors(newPropposalVO.getContributors());
        proposalInfoPojo.setVersions(newPropposalVO.getVersions());

        MongoCollection<ProposalInfoPojo> mongoCollection = mongoDatabase.getCollection(newPropposalVO.getTitle(), ProposalInfoPojo.class);
        mongoCollection.insertOne(proposalInfoPojo);



        try {

        } catch (Exception e) {
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
