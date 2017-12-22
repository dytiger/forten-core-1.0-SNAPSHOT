/*
 * Copyright 2012 ITC Tsinghua University. All Rights Reserved.
 */
package org.forten.utils.security;

import org.apache.log4j.Logger;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Base 64编解码工具类
 * 
 * @author <a href="mailto:du_yi@bbn.cn">Duyi</a>
 * 
 * @since 2012-5-8
 */
public final class Base64Util {
	private static Logger log = Logger.getLogger(Base64Util.class);

	private Base64Util() {

	}

	/**
	 * 对原始文本进行Base 64编码的方法，如果原始文本为空或空字符串则直接返回一个空字符串
	 * 
	 * @param origin
	 *            原始文本
	 * @param charset
	 *            编码使用的字符集
	 * @return Base 64编码文本
	 */
	public static String encode(String origin, String charset) {
		String s = null;
		try {
			s = Base64.getEncoder().encodeToString(origin.getBytes(charset));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s;
	}

	/**
	 * 对编码文本进行Base 64解码的方法，如果编码文本为空或空字符串则直接返回一个空字符串
	 * 
	 * @param code
	 *            Base 64编码文本
	 * @param charset
	 *            解码使用的字符集
	 * @return Base 64原始文本
	 */
	public static String decode(String code, String charset) {
		byte[] asBytes = Base64.getDecoder().decode(code);
		String s = null;
		try {
			s = new String(asBytes,charset);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return s;
	}

	/**
	 * 使用UTF-8字符集对原始文本进行Base 64编码的方法，如果原始文本为空或空字符串则直接返回一个空字符串
	 * 
	 * @param origin
	 *            原始文本
	 * @return Base 64编码文本
	 */
	public static String encode(String origin) {
		return encode(origin, "UTF-8");
	}

	/**
	 * 使用UTF-8字符集对Base 64编码文本进行解码的方法，如果编码文本为空或空字符串则直接返回一个空字符串
	 * 
	 * @param code
	 *            Base 64编码文本
	 * @return Base 64解码后的原始文本
	 */
	public static String decode(String code) {
		return decode(code, "UTF-8");
	}
}
