package com.srn.common.config;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.stereotype.Component;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

@Slf4j
@Component
@ComponentScan(basePackages = "com.srn")
@Scope("singleton")
public class MongoConfig {


    private ConnectionString connectionString ;

    public MongoConfig(){

     connectionString = new ConnectionString("mongodb://127.0.0.1:27017");
    }


    public MongoClient getMongoClientInstance() {
        MongoClient mongoClient = null;
      //  connectionString = new ConnectionString("mongodb://127.0.0.1:27017");
        try {
//            activatePojoCrud();

            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
            CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                    pojoCodecRegistry);

            MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(new ConnectionString("mongodb://127.0.0.1:27017"))
                    .codecRegistry(codecRegistry)
                    .build();

            mongoClient = MongoClients.create(clientSettings);

        } catch (Exception e) {

            log.info(" [ Exception ] at " + MongoConfig.class.getSimpleName().toString() + "while establishing connection with MongoDb");

        }
        return mongoClient;
    }

    private void activatePojoCrud() {
    }

    CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
    CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
            pojoCodecRegistry);

    MongoClientSettings clientSettings = MongoClientSettings.builder()
            .codecRegistry(codecRegistry)
            .build();


}
