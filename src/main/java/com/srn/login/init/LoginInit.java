package com.srn.login.init;

public class LoginInit {

    private static LoginInit loginInit = null;

    LoginInit(){
        init();
    }

    private void init(){

      //  LoginBP loginBp = new LoginBP();
      //  loginBp.run();
    }

    public LoginInit getInstance (){
        if(loginInit == null){
            LoginInit loginInit = new LoginInit();
        }
        return loginInit;

    }
}
