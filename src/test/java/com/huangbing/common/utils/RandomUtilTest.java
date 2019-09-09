/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 上午10:34:56 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import com.huangbing.common.utils.RandomUtil;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 上午10:34:56  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.huangbing.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		
		for(int i =0;i<10;i++) {
		int j = RandomUtil.random(3, 5);
		System.out.println(j);
		}
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		
		int[] js = RandomUtil.subRandom(1, 10, 5);
		for (int i : js) {
			System.out.println(i);
		}
    		
		
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		

		for(int i =0;i<10;i++) {
		  char c = RandomUtil.randomCharacter();
		System.out.println(c);
		}
		
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		for(int i =0;i<10;i++) {
		String str = RandomUtil.randomString(4);
		System.out.println(str);
		}
	}

}
