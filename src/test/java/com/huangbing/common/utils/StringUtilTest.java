/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 下午3:25:57 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.huangbing.common.utils.StringUtil;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 下午3:25:57  
 */
public class StringUtilTest {

	/**
	 * 测试toHtml工具类
	 */
	@Test
	public void testToHtml() {
		String str = "测试HTML工具类"+"\r\n"+"周四胃口圣诞节";
		String html = StringUtil.toHtml(str);
		System.out.println(html);
	}
	/**
	 * 测试是否是手机号
	 */
	@Test
	public void testIsPhoneNumber() {
		boolean b = StringUtil.isPhoneNumber("17835693564");
		System.out.println(b);
	}
	/**
	 * 测试是否是邮箱
	 * 
	 */
	@Test
	public void testIsEmail() {
		boolean b = StringUtil.isEmail("qww2619252@qq.com");
		System.out.println(b);
	}
	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		/*
		 * for (int i = 0; i < 10; i++) {
		 * System.out.print(StringUtil.randomChineseString()+",");
		 * 
		 * }
		 */
		
		System.out.println(StringUtil.randomChineseString(100));
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StringUtil#generateChineseName()}.
	 */
	@Test
	public void testGenerateChineseName() {
		 for (int i = 0; i < 10; i++) {
			 System.out.println(StringUtil.generateChineseName());
			 }
	}

}
