package com.bamboo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bamboo.model.User;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}