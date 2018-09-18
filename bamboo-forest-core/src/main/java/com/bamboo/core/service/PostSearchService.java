package com.bamboo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.repository.PostRepository;
import com.bamboo.request.PostSearchRequest;
import com.bamboo.response.PostSearchResponse;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
@Service
public class PostSearchService {

	@Autowired
	private PostRepository postRepository;
	
	public PostSearchResponse searchPost(PostSearchRequest searchReq) {

		return null;
	}

}
