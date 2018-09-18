package com.bamboo.request;

import com.bamboo.model.Post;
import com.bamboo.model.User;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
public class PostRequest {

	private User user;
	private Post post;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

}
