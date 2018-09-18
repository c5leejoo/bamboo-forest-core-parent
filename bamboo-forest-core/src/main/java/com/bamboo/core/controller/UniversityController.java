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

import com.bamboo.core.service.UniversitySearchService;
import com.bamboo.request.UniversitySearchRequest;
import com.bamboo.response.UniversitySearchResponse;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@RestController
@RequestMapping(value = { "/bamboo" })
public class UniversityController {

	private final static Logger logger = LoggerFactory.getLogger(UniversityController.class);

	@Autowired
	UniversitySearchService bambooSearchService;

	/**
	 * @param searchReq
	 * @return ResponseEntity
	 * @author joowon.lee
	 * @date September 17, 2018
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UniversitySearchResponse> searchPost(@RequestBody UniversitySearchRequest searchReq) throws Exception {

		logger.debug("Bamboo Controller - Search Bamboo");

		UniversitySearchResponse searchResponse = bambooSearchService.searchBamboo(searchReq);

		return new ResponseEntity<UniversitySearchResponse>(searchResponse, HttpStatus.OK);
	}

}
