package com.bamboo.constants;

/**
 * @author joowon.lee
 * @date August 25, 2018
 * 
 */
public class MongoDBConstants {

	// Collections
	public static final String POSTS_COLLECTION = "posts";

	public static final String UNIVERSITIES_COLLECTION = "universities";

	public static final String USERS_COLLECTION = "users";

	public static final String COMMENTS_COLLECTION = "comments";

	// Operators
	public static final String LOGICAL_OPERATOR_AND = "$and";

	public static final String LOGICAL_OPERATOR_OR = "$or";

	public static final String QUERY_OPERATOR_IN = "$in";

	public static final String QUERY_OPERATOR_LTE = "$lte";

	public static final String QUERY_OPERATOR_SET = "$set";

	public static final String QUERY_OPERATOR_PUSH = "$push";

	public static final String QUERY_OPERATOR_EACH = "$each";

	public static final String QUERY_OPERATOR_INC = "$inc";

	public static final String QUERY_OPERATOR_NE = "$ne";
}
