package com.bamboo.request;

import com.bamboo.model.Comment;
import com.bamboo.model.User;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
public class CommentRequest {
	private User user;
	private Comment comment;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

}
