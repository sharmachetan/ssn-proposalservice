package com.srn.login.client;

import com.srn.common.Actions.LoginAction;
import com.srn.common.res.LoginResponse;
import com.srn.login.pojo.UserLoginDetailPojo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@ComponentScan
public class LoginClient implements LoginAction {

    private LoginResponse loginResponse;

    @Override
    public String generateUser() {

        return "userGenerated";
    }

    @Override
    public LoginResponse authenticateUser() {


        return loginResponse;
    }

    @Override
    public LoginResponse forgotLoginPassword() {
        return loginResponse;
    }
}
