package com.bamboo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bamboo.core.service.CommentService;
import com.bamboo.request.CommentRequest;
import com.bamboo.response.CommentResponse;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@RestController
@RequestMapping(value = { "/comment" })
public class CommentController {

	@Autowired
	CommentService commentService;
	
	/**
	 * 
	 * 
	 * @param requestBody
	 * 
	 * @author joowon.lee
	 * @date September 2, 2018
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<CommentResponse> savePost(@RequestBody CommentRequest requestBody) throws Exception {

		CommentResponse response = commentService.createComment(requestBody);

		return new ResponseEntity<CommentResponse>(response, HttpStatus.OK);
	}
}
