package com.bamboo.request;

import com.bamboo.model.Comment;
import com.bamboo.model.Post;
import com.bamboo.model.User;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
public class CommentRequest {

	private User user;
	private Comment comment;
	private Post post;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

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
