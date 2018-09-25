package com.bamboo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bamboo.constants.MongoDBConstants;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Document(collection = MongoDBConstants.UNIVERSITIES_COLLECTION)
public class University {

	@Id
	private String _id;
	private String name;

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
