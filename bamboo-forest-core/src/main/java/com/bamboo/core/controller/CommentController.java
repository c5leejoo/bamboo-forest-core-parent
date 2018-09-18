package com.bamboo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bamboo.core.service.CommentService;

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
	
	
}
