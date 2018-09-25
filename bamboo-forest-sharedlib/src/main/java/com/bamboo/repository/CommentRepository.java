package com.bamboo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bamboo.model.Comment;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

	@Query("{ '_id' :?0 }")
	List<Comment> findByUserId(String id);
	
}
