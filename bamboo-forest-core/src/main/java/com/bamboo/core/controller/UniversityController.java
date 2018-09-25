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
import com.bamboo.core.service.UniversityService;
import com.bamboo.request.UniversityRequest;
import com.bamboo.request.UniversitySearchRequest;
import com.bamboo.response.UniversityResponse;
import com.bamboo.response.UniversitySearchResponse;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@RestController
@RequestMapping(value = { "/university" })
public class UniversityController {

	private final static Logger logger = LoggerFactory.getLogger(UniversityController.class);

	@Autowired
	UniversitySearchService universitySearchService;

	@Autowired
	UniversityService universityService;

	/**
	 * @param searchReq
	 * @return ResponseEntity
	 * @author joowon.lee
	 * @date September 17, 2018
	 */
	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UniversitySearchResponse> searchUniversity(@RequestBody UniversitySearchRequest searchReq)
			throws Exception {

		logger.debug("University Controller - Search University");

		UniversitySearchResponse searchResponse = universitySearchService.searchBamboo(searchReq);

		return new ResponseEntity<UniversitySearchResponse>(searchResponse, HttpStatus.OK);
	}

	/**
	 * @param searchReq
	 * @return ResponseEntity
	 * @author joowon.lee
	 * @date September 17, 2018
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<UniversityResponse> saveUniversity(@RequestBody UniversityRequest universityReq)
			throws Exception {

		logger.debug("University Controller - Save University");

		UniversityResponse response = universityService.saveBamboo(universityReq);

		return new ResponseEntity<UniversityResponse>(response, HttpStatus.OK);
	}

}
