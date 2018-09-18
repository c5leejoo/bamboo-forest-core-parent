package com.bamboo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.model.Comment;
import com.bamboo.repository.CommentRepository;
import com.bamboo.request.CommentRequest;
import com.bamboo.response.CommentResponse;

@Service
public class CommentService {

	@Autowired
	private CommentRepository commentRepository;

	public CommentResponse createComment(CommentRequest requestBody) {
		Comment comment = commentRepository.save(requestBody.getComment());
		CommentResponse response = new CommentResponse();
		response.setComment(comment);
		return response;
	}
}
