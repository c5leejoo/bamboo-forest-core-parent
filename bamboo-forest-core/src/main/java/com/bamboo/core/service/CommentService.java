package com.bamboo.core.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.core.controller.PostController;
import com.bamboo.model.Comment;
import com.bamboo.repository.CommentRepository;
import com.bamboo.request.CommentRequest;
import com.bamboo.response.CommentResponse;

/**
 * 
 * @author joowon.lee
 * @date September 26, 2018
 */
@Service
public class CommentService {

	private final static Logger logger = LoggerFactory.getLogger(CommentService.class);
	
	@Autowired
	private CommentRepository commentRepository;

	@Autowired
	UserService userService;
	
	@Autowired
	CommonService commonService;
	
	
	/**
	 * @author joowon.lee
	 * @date September 26, 2018
	 */
	public CommentResponse createComment(CommentRequest requestBody) {
		// 1. save comment
		// 2. get userId from the requestBody and then update the user object in the database
		// --> add the commentId to the comment list of the user object in the database
		// 3. get the postId from the requestBody and then update the commentId list of the 
		// post object in the database
		logger.debug("Comment Service - Create Comment");
		
		requestBody.getComment().setId(String.valueOf(commonService.getNextCommentNumber()));
		Comment comment = commentRepository.save(requestBody.getComment());
		CommentResponse response = new CommentResponse();
		response.setComment(comment);
		return response;
	}

	/**
	 * 
	 * @author joowon.lee
	 * @date September 26, 2018
	 */
	public CommentResponse edit(CommentRequest requestBody) {
		return null;
	}

	/**
	 * 
	 * @author joowon.lee
	 * @date September 26, 2018
	 */
	public CommentResponse delete(CommentRequest requestBody) {
		return null;
	}
}
