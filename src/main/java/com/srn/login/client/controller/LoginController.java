package com.srn.login.client.controller;

import com.srn.common.Actions.LoginAction;
import com.srn.login.client.LoginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private LoginAction loginAction;

//    @GetMapping("/store")
//    public String getStores(){
//        return loginAction.getStores();
//    }

//    @RequestMapping("/ff")
//    public String home() {
//        return "fuck World";
//    }

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
