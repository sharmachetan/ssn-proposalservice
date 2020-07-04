package com.srn.common.config;

import com.mongodb.MongoClient;
import org.springframework.stereotype.Component;

@Component
public class MongoConfig {

  private  static MongoConfig mongoConfig = new MongoConfig();
    private String connectionIp="localhost";
    private String connectionPort="27017";
    private String user="";
    private String pass="";
    private MongoClient mongoClient;
    private MongoConfig(){

        createInstance();
    }

/**
 * Create instance of MongoDb Client
 */

    private void createInstance(){
    mongoClient = new MongoClient(connectionIp,Integer.parseInt(connectionPort));
    this.mongoClient = mongoClient;
    }

/**
* Public method to return the instance for MongoClient
* */
    public MongoClient getMongoClient(){
        return mongoClient;
    }

    /**
    * Create Singleton instance for the class MongoConfig.java
    * */
 public static MongoConfig getInstance() {

    return mongoConfig;
}

}
