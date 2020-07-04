package com.srn.controller;

import com.srn.Actions.ProposalAction;
import com.srn.common.bp.MongoDbClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.core.Response;

@RestController
@ComponentScan(basePackages = "com.srn")
public class ProposalController implements ProposalAction {

    @Autowired
    MongoDbClient mongoDbClient;

    @Override
    public Object findProposalDoc(String docId) {
        return new Object();
    }

    @Override
    public Object createNewProposalDoc(Object object) {
        mongoDbClient.createProposal((String) object);

        return null;
    }
//
//    @Override
//    public Object createNewProposalDoc() {
//
//        return null;
//    }

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

//    @Override
//    public String UpdateProposalStatus() {
//        return null;
//    }
//

}
