package com.bamboo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.bamboo.constants.MongoDBConstants;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Document(collection = MongoDBConstants.USERS_COLLECTION)
public class User {
	@Id
	String _id;
	String username;
	String password;
	List<String> userLikes; // contains post id that user liked
	List<String> userComments; // contains comment id that user commented
	List<String> userPosts; // contains post id that user posted

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getUserLikes() {
		return userLikes;
	}

	public void setUserLikes(List<String> userLikes) {
		this.userLikes = userLikes;
	}

	public List<String> getUserComments() {
		return userComments;
	}

	public void setUserComments(List<String> userComments) {
		this.userComments = userComments;
	}

	public List<String> getUserPosts() {
		return userPosts;
	}

	public void setUserPosts(List<String> userPosts) {
		this.userPosts = userPosts;
	}

}
