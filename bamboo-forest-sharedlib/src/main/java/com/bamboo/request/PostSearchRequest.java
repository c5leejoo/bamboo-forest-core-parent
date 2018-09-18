package com.bamboo.request;

import com.bamboo.pojo.Post;
import com.bamboo.pojo.University;
import com.bamboo.pojo.User;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
public class PostSearchRequest {
	private University university;
	private Post post;
	private User user;

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

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

}
