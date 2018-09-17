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

import com.bamboo.core.service.UserService;
import com.bamboo.request.UserRequest;
import com.bamboo.response.UserResponse;

/**
 * @author joowon.lee
 * @date September 16, 2018
 * 
 */
@RestController
@RequestMapping(value = { "/user" })
public class UserController {
	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	/**
	 * 
	 * @author joowon.lee
	 * @date September 16, 2018
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest requestBody) throws Exception {
		logger.debug("User Controller - Create User");

		UserResponse response = userService.createUser(requestBody);

		return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
	}

	/**
	 * 
	 * @author joowon.lee
	 * @date September 16, 2018
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UserResponse> deleteUser(@RequestBody UserRequest requestBody) throws Exception {
		logger.debug("User Controller - Delte User");

		UserResponse response = userService.deleteUser(requestBody);

		return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
	}
}
