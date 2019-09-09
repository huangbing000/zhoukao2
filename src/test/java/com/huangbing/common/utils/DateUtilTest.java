/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月7日 下午4:36:05 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.huangbing.common.utils.DateUtil;

/**
 * @ClassName: DateUtilTest
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月7日 下午4:36:05
 */
public class DateUtilTest extends DateUtil {

	/**
	 * Test method for
	 * {@link com.huangbing.common.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {

		Date date = DateUtil.getDateByInitMonth(new Date());

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(df.format(date));

	}

	/**
	 * Test method for
	 * {@link com.huangbing.common.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		/**
		 * 测试2月
		 */
		Calendar c = Calendar.getInstance();
		c.set(2000, 1, 12);

		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		System.out.println(df.format(date));

	}

	/***
	 * String sql = "select * from t_order where create_time>='{1}' and
	 * create_time<='{2}' "; 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。 最后打印出正确拼接的SQL字符串。
	 * 
	 * @Title: test1
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void test1() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String sql2 = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
		System.out.println(sql2);

	}
}
