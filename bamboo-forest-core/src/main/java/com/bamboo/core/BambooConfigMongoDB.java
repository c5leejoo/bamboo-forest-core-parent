package com.bamboo.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
@Configuration
@PropertySources({ @PropertySource("classpath:application.properties")})
public class BambooConfigMongoDB {

	// DO NOT FORGET TO RUN mongod COMMAND ON TERMINAL TO FIRE THE LOCAL MONGODB SERVER
    @Value("${mongoUri}")
    String mongoUri;

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        MongoClientOptions.Builder options = MongoClientOptions.builder();

        MongoClientURI mongoClientURI = new MongoClientURI(mongoUri, options);

        MongoClient mongoClient = new MongoClient(mongoClientURI);

        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(
                mongoClient, "bamboo");

        return simpleMongoDbFactory;
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}