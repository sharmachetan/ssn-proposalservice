package com.srn.common.bp;

import com.srn.common.dao.MongoImplClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MongoDbClient {

    @Autowired
    MongoImplClient mongoImplClient;
    public  void createProposal(String proposalName){
        mongoImplClient.createCollection(proposalName);
        log.info( " Trying to create New Proposal ::" + proposalName);

    }
}
