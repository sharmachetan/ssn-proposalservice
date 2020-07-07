package com.srn.common.config;

import com.srn.Actions.ProposalAction;
import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class LoginConfiguration {

private ProposalAction loginAction;

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }


}


