package com.srn.Actions;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "proposal",url="/proposalAction")
public interface ProposalAction
{

@RequestMapping(name = "findProposal",method = RequestMethod.GET,consumes = "application/json",produces = "application/json",value = "/findProposal/{docId}")
public Object findProposalDoc(@PathVariable (value = "docId") String docId);

@RequestMapping(name="newProposal",method = RequestMethod.POST, value="/createNewProposal",produces = "application/json" )
public Object createNewProposalDoc(@RequestBody Object object);

@RequestMapping(name="updateProposal",method = RequestMethod.POST,value = "/updateProposal")
public Object updateProposal(@RequestBody Object object);

@RequestMapping(name="deleteProposal",method=RequestMethod.GET,value="/delete/{propId}")
public String deletePropsal(@PathVariable(value = "propId") String propId);

@RequestMapping(name="updatePropStatus",value="/updateStatus",method = RequestMethod.POST,consumes = "application/json",produces = "application/json")
public String UpdateProposalStatus(@RequestBody Object object);

}
