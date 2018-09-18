package com.bamboo.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bamboo.core.service.PostSearchService;
import com.bamboo.core.service.PostService;
import com.bamboo.request.PostRequest;
import com.bamboo.request.PostSearchRequest;
import com.bamboo.response.PostResponse;
import com.bamboo.response.PostSearchResponse;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
@RestController
@RequestMapping(value = { "/post" })
public class PostController {

	private final static Logger logger = LoggerFactory.getLogger(PostController.class);

	@Autowired
	PostSearchService postSearchService;

	@Autowired
	PostService postService;

	/**
	 * @param searchReq
	 * @return ResponseEntity
	 * @author joowon.lee
	 * @date September 2, 2018
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PostSearchResponse> searchPost(@RequestBody PostSearchRequest searchReq)
			throws Exception {
		
		logger.debug("Post Controller - Search Post");

		PostSearchResponse mediaResponse = postSearchService.searchPost(searchReq);

		return new ResponseEntity<PostSearchResponse>(mediaResponse, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @param requestBody
	 * 
	 * @author joowon.lee
	 * @date September 2, 2018
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PostResponse> savePost(@RequestBody PostRequest requestBody) throws Exception {
		logger.debug("Post Controller - Create Post");

		PostResponse response = postService.createPost(requestBody);

		return new ResponseEntity<PostResponse>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @param requestBody
	 * 
	 * @author joowon.lee
	 * @date September 2, 2018
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<PostResponse> deletePost(@RequestBody PostRequest requestBody) throws Exception {
		logger.debug("Post Controller - Delte Post");

		PostResponse response = postService.deletePost(requestBody);
		
		return new ResponseEntity<PostResponse>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * 
	 * @param requestBody
	 * 
	 * @author joowon.lee
	 * @date September 2, 2018
	 */
	@RequestMapping(value = "/update", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<PostResponse> updatePost(@RequestBody PostRequest requestBody) throws Exception {
		logger.debug("Post Controller - Update Post");

		PostResponse response = postService.updatePost(requestBody);

		return new ResponseEntity<PostResponse>(response, HttpStatus.OK);
	}
}
