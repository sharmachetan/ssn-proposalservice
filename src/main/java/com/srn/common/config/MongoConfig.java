package com.srn.common.config;



import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.srn")
@Scope("singleton")
public class MongoConfig {


    //  private  static MongoConfig mongoConfig = new MongoConfig();
//    private String connectionIp="mongodb://localhost";
//    private String connectionPort="27017";
//    private String user="";
//    private String pass="";
//    private MongoClient mongoClient;
//    private MongoConfig(){
//
//        createInstance();
//    }
//
///**
// * Create instance of MongoDb Client
// */
//
//    private void createInstance(){
//
//        mongoClient = MongoClients.create("mongodb://127.0.0.1:27017");
//    }
//
///**
//* Public method to return the instance for MongoClient
//* */
//    public MongoClient getMongoClient(){
//        return this.mongoClient;
//    }
//
//    /**
//    * Create Singleton instance for the class MongoConfig.java
//    * */
// public static MongoConfig getInstance() {
//
//    return mongoConfig;
//}

}
