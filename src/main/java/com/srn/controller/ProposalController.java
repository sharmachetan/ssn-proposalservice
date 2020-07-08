package com.srn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srn.Actions.ProposalAction;
import com.srn.common.bp.MongoDbClient;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

@RestController
@ComponentScan(basePackages = "com.srn")
@Slf4j
public class ProposalController implements ProposalAction {

    @Autowired
    MongoDbClient mongoDbClient;

    @Override
    public Object findProposalDoc(String docId) {
        return new Object();
    }

    @Override
    public Object createNewProposalDoc(String object) {
        log.info( " Request Payload : " + object.toString() );

        JSONObject jsonObject = new JSONObject(object.toString());
        log.info("Request in json format " + jsonObject.toString());

        mongoDbClient.createProposal(jsonObject);

        return null;
    }


    @Override
    public Object updateProposal(Object object) {
        return null;
    }

    @Override
    public String deletePropsal(String propId) {
        return null;
    }

    @Override
    public String UpdateProposalStatus(Object object) {
        return null;
    }


}
