package com.srn.common.Actions;


import com.srn.common.config.LoginConfiguration;
import com.srn.common.res.LoginResponse;
import com.srn.login.pojo.UserLoginDetailPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(value = "login")
public interface LoginAction {


    @RequestMapping(value = "/signUp",method = RequestMethod.POST,consumes = "application/json")
    String generateUser();


    @GetMapping(value = "/basicLogin")
    LoginResponse authenticateUser();

    @PostMapping(value="forgetPass")
    LoginResponse forgotLoginPassword();





}
