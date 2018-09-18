package com.bamboo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bamboo.model.Post;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	@Query("{ 'title' :?0 }")
	Post findByTitle(String title);

	@Query("{ '_id' :?0 }")
	List<Post> findByUserId(String id);
}
