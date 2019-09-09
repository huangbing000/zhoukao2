/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PeronTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 下午3:47:34 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.huangbing.common.utils.DateUtil;
import com.huangbing.common.utils.RandomUtil;
import com.huangbing.common.utils.StringUtil;

/** 
 * @ClassName: PeronTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 下午3:47:34  
 */
public class PeronTest {
	
	/**
	 * 姓名属性值调用StringUtil.generateChineseName()创建（4分）
年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
批量生成1万个，并在控制台输出（4分）
	 * @Title: test1 
	 * @Description: TODO
	 * @return: void
	 * @throws ParseException 
	 */
	@Test
	public void test1() throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String startDate ="2010-01-01";
		for(int i=0 ;i<100 ;i++) {
			String name =StringUtil.generateChineseName();
			Integer age=RandomUtil.random(1,120);
			
			String about =StringUtil.randomChineseString(140);
			
			Date date = DateUtil.getRandom(df.parse(startDate), new Date());
			Person person = new Person(name,age,about,date);
			System.out.println(person);
			
		}
		
	}

}
