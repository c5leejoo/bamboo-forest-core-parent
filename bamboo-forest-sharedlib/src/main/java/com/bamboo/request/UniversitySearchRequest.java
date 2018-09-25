package com.bamboo.request;

import com.bamboo.model.University;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
public class UniversitySearchRequest {
	
	@JsonInclude(content=Include.ALWAYS)
	private University university;

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
}
