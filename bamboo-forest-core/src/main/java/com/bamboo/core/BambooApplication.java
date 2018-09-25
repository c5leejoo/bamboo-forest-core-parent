package com.bamboo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.bamboo.repository.CommentRepository;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 *       Main class to launch the application
 */
@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.bamboo.repository")
public class BambooApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BambooApplication.class);
	}

	@Bean
	ObjectMapper customObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_ABSENT);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.setDefaultSetterInfo(JsonSetter.Value.forValueNulls(Nulls.SKIP));
		mapper.setDefaultPropertyInclusion(JsonInclude.Include.NON_EMPTY);
		return mapper;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BambooApplication.class, args);
	}
}
