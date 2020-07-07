package com.srn;

public class ProposalInit {

    private static ProposalInit proposalInit = null;

    ProposalInit(){
        init();
    }

    private void init(){

      //  LoginBP loginBp = new LoginBP();
      //  loginBp.run();
    }

    public ProposalInit getInstance (){
        if(proposalInit == null){
            ProposalInit proposalInit = new ProposalInit();
        }
        return proposalInit;

    }
}
