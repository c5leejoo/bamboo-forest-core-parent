package com.bamboo.pojo;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;
import com.bamboo.constants.MongoDBConstants;

@Document(collection = MongoDBConstants.POSTINGS_COLLECTION)
public class Post {
	String _id;
	String title;
	String university;
	String content;
	Date postCreatedDate;
	int numLikes;
	int numDislikes;
	String commentId;

	public void setId(String id) {
		this._id = id;
	}

	public String getId() {
		return this._id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPostCreatedDate() {
		return postCreatedDate;
	}

	public void setPostCreatedDate(Date postCreatedDate) {
		this.postCreatedDate = postCreatedDate;
	}

	public int getNumLikes() {
		return numLikes;
	}

	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}

	public int getNumDislikes() {
		return numDislikes;
	}

	public void setNumDislikes(int numDislikes) {
		this.numDislikes = numDislikes;
	}

	public String getCommentId() {
		return commentId;
	}

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getUniversity() {
		return this.university;
	}
}
