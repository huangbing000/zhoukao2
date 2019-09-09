/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: PatternUtil.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月10日 上午10:20:34 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

/** 
 * @ClassName: PatternUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月10日 上午10:20:34  
 */
public class PatternUtil {
	
	/**
	 * 
	 * @Title: getLastNumFormUrl 
	 * @Description:从url中获取最后的数字
	 * @return
	 * @return: Integer
	 */

	public static Integer getLastNumFormUrl(String url) {
	    String[] split = url.split("\\D+");
	    
	     String num = split[split.length-1];
		
	     return Integer.parseInt(num);
		
	}
	
	/**
	 * 
	 * @Title: getFirstNumFormUrl 
	 * @Description: 获取第一个数字
	 * @param url
	 * @return
	 * @return: Integer
	 */
	public static String getFirstNumFormUrl(String url) {
	    String[] split = url.split("\\D+");
	    
		
	     return split[1];
		
	}
	
	
	
	
	
	@Test
	public void   getLastNumFormUrl2() {
		String url ="http://news.cnstock.com/news,yw-201905-1413224.htm";
		//定义规则
	//	String regex ="[0-9]+(?=[^0-9]*$)";
		String regex ="(\\d+)";
	    //编译规则
		Pattern c = Pattern.compile(regex);
		//匹配
		Matcher m = c.matcher(url);
		if(m.find()) {
			System.out.println(m.group());
		}
		
	}

}
