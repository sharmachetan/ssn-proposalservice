package com.srn.common.config;

import com.srn.common.Actions.LoginAction;
import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoginConfiguration {

private LoginAction loginAction;

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }



}


