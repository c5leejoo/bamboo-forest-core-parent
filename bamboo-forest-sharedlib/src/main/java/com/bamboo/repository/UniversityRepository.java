package com.bamboo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bamboo.pojo.University;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Repository
public interface UniversityRepository extends MongoRepository<University, String> {
	
	@Query("{'name:?0'}")
	University findByName(String name);
	
}
