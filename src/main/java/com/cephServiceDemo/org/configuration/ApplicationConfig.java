package com.cephServiceDemo.org.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Protocol;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import com.mongodb.MongoClient;


@Configuration
@ComponentScan(basePackages = "com.cephServiceDemo.org")
public class ApplicationConfig {
 
	@Value("${spring.data.mongodb.database}")
	private String database;
	
	@Value("${spring.data.mongodb.port}")
	private int port;
	
	@Value("${spring.data.mongodb.host}")
	private String host;
		
	@Value("${spring.data.mongodb.username}")
	private String userName;
	
	@Value("${spring.data.mongodb.password}")
	private String password;
	
    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
	MongoClientURI uri = new MongoClientURI("mongodb://"+userName+":"+password+"@"+host+":"+port+"/"+database);
	return new SimpleMongoDbFactory(uri);
    }
 
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
}
