package com.bamboo.core.service;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.bamboo.constants.JSONConstants;
import com.bamboo.constants.MongoDBConstants;
import com.mongodb.BasicDBObject;

/**
 * 
 * @author joowon.lee
 * @date September 25, 2018
 */
@Service
public class CommonService {

	@Autowired
	MongoTemplate mongoTemplate;

	/**
	 * Increase the university number by one in the database and return the updated value
	 *
	 * @author joowon.lee
	 * @date September 25, 2018
	 */
	public int getNextUniversityNumber() {
		Integer number = getNextNumber(JSONConstants.Sequence.UNIVERSITIES);
		return number;
	}

	/**
	 * Increase the post number by one in the database and return the updated value
	 *
	 * @author joowon.lee
	 * @date September 25, 2018
	 */
	public int getNextPostNumber() {
		Integer number = getNextNumber(JSONConstants.Sequence.POSTS);
		return number;
	}

	/**
	 * Increase the comment number by one in the database and return the updated value
	 *
	 * @author joowon.lee
	 * @date September 25, 2018
	 */
	public int getNextCommentNumber() {
		Integer number = getNextNumber(JSONConstants.Sequence.COMMENTS);
		return number;
	}

	/**
	 * Increase the user number by one in the database and return the updated value
	 *
	 * @author joowon.lee
	 * @date September 25, 2018
	 */
	public int getNextUserNumber() {
		Integer number = getNextNumber(JSONConstants.Sequence.USERS);
		return number;
	}

	private Integer getNextNumber(String numberType) {
		BasicDBObject find = new BasicDBObject(JSONConstants.Common._ID, numberType);
		BasicDBObject update = new BasicDBObject(MongoDBConstants.QUERY_OPERATOR_INC,
				new BasicDBObject(JSONConstants.Sequence.COUNT, 1));
		Document response = mongoTemplate.getCollection(MongoDBConstants.SEQUENCE_COLLECTION).findOneAndUpdate(find,
				update);

		return response.getInteger(JSONConstants.Sequence.COUNT);
	}
}
