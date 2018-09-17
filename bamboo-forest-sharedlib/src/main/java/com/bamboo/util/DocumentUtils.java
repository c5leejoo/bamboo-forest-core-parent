package com.bamboo.util;

import org.bson.Document;

/**
 * @author joowon.lee
 * @date September 4, 2018
 */
public class DocumentUtils {

	/**
	 * @author joowon.lee
	 * @date September 4, 2018
	 */
	public static Document parse(String json) {
		return Document.parse(json);
	}
}