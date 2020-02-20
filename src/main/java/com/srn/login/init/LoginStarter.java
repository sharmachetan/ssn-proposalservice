package com.srn.login.init;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@RestController
@EnableFeignClients
@ComponentScan(basePackages ="com.srn" )
public class LoginStarter{
    //private static final Logger logger = LoggerFactory.getLogger(LoginStarter.class);

//    @RequestMapping("/")
//    public String home() {
//        return "Hello World";
//    }

    public static void main(String[] args){
       // SpringApplicationBuilder(LoginStarter.class).web(true).run(args);\
        SpringApplication.run(LoginStarter.class, args);
       // logger.info(WELCOME_MESSAGE);


    }


//    @RestController
//    class ServiceInstanceRestController {
//
//        @Autowired
//        private DiscoveryClient discoveryClient;
//
//        @RequestMapping("/service-instances/{applicationName}")
//        public List<ServiceInstance> serviceInstancesByApplicationName(
//                @PathVariable String applicationName) {
//            return this.discoveryClient.getInstances(applicationName);
//        }
//    }


//    private void init(){
//
//        LoginInit loginInit = new LoginInit();
//    }




}
