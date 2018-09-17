package com.bamboo.pojo;

public class Comment {

	private String _id;
	private String comment;
	private String username;
	private String password;

	public void setId(String id) {
		this._id = id;
	}

	public String getId() {
		return this._id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
}
