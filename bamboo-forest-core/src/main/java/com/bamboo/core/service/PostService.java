package com.bamboo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.repository.PostRepository;
import com.bamboo.request.PostRequest;
import com.bamboo.response.PostResponse;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;

	/**
	 * @author joowon.lee
	 * @date August 25, 2018
	 * 
	 */
	public PostResponse createPost(PostRequest requestBody) {
		// TODO Auto-generated method stub
		
		postRepository.save(requestBody.getPost());
		return null;
	}

	/**
	 * @author joowon.lee
	 * @date September 13, 2018
	 * 
	 */
	public PostResponse deletePost(PostRequest requestBody) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @author joowon.lee
	 * @date September 16, 2018
	 * 
	 */
	public PostResponse updatePost(PostRequest requestBody) {
		// TODO Auto-generated method stub
		return null;
	}

}
