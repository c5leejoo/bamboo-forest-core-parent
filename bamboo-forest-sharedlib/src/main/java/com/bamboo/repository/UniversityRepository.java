package com.bamboo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bamboo.model.University;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Repository
public interface UniversityRepository extends MongoRepository<University, String> {
}
