package com.bamboo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.bamboo.constants.MongoDBConstants;

/**
 * @author joowon.lee
 * @date September 17, 2018
 * 
 */
@Document(collection = MongoDBConstants.POSTS_COLLECTION)
public class Post {
	@Id
	String _id;
	String title;
	String contents;
	String university;
	Date postCreatedDate;
	Date lastUpdatedDate;
	List<Comment> comments;
	int numLikes;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public Date getPostCreatedDate() {
		return postCreatedDate;
	}

	public void setPostCreatedDate(Date postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public int getNumLikes() {
		return numLikes;
	}

	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}

}
