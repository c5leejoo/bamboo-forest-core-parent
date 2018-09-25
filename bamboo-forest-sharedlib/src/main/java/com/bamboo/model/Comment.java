package com.bamboo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bamboo.constants.MongoDBConstants;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Document(collection = MongoDBConstants.COMMENTS_COLLECTION)
public class Comment {

	@Id
	private String _id;
	private String contents;

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
