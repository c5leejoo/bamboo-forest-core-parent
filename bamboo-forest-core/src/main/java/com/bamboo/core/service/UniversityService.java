package com.bamboo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.repository.UniversityRepository;
import com.bamboo.request.UniversityRequest;
import com.bamboo.response.UniversityResponse;

/**
 * @author joowon.lee
 * @date September 25, 2018
 */
@Service
public class UniversityService {

	@Autowired
	CommonService commonService;

	@Autowired
	UniversityRepository universityRepository;

	public UniversityResponse saveUniversity(UniversityRequest universityReq) {
		UniversityResponse response = new UniversityResponse();
		universityReq.getUniversity().setId(String.valueOf(commonService.getNextUniversityNumber()));
		universityRepository.save(universityReq.getUniversity());
		response.setUniversity(universityReq.getUniversity());

		return response;
	}
}
