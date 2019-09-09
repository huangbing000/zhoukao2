/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: zhangsan-common
 * @Package: com.zhangsan.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月7日 下午4:22:36 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月7日 下午4:22:36
 */
public class DateUtil {
	// 获取一个18-70 岁之间的随机日期
	public static Date getRandomDate(int minAge, int maxAge) {
		Calendar c1 = Calendar.getInstance();
		c1.add(Calendar.YEAR, -minAge);// 年龄最小的

		Calendar c2 = Calendar.getInstance();
		c2.add(Calendar.YEAR, -maxAge);// 年龄最大的

		return getRandom(c2.getTime(), c1.getTime());

	}

	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < 100; i++) {
			Date date = DateUtil.getRandomDate(17, 70);
			System.out.println(df.format(date));
		}
	}

	// 示例:方法5：求过去日期离今天过去的天数
	public static int getDaysByDeparted(Date departed) {
		// 未来时间
		long d = departed.getTime();
		// 当前时间
		long n = new Date().getTime();

		if (d > n)
			throw new RuntimeException("不是过去日期");
		return (int) (Math.floor((n - d) / 24.0 / 60 / 60 / 1000));

	}

	// 示例:方法4：求未来日期离今天还剩的天数
	public static int getDaysByFuture(Date future) {
		// 未来时间
		long f = future.getTime();
		// 当前时间
		long n = new Date().getTime();

		if (f < n)
			throw new RuntimeException("不是未来日期");
		return (int) Math.ceil((f - n) / 24.0 / 60 / 60 / 1000);

	}

	/**
	 * 
	 * @Title: getAge
	 * @Description: 根据传入的日期获取你那里
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday) {
		// 获取当前系统的日历类
		Calendar c = Calendar.getInstance();
		// 获取当前年月日
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		// 用生日初始化日历类
		c.setTime(birthday);
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);

		// 年龄 1990-02-10 2019-02-08
		int age = yearNow - yearBirth;
		// 出生月份大于前月份 年龄减少1
		if (monthBirth > monthNow) {
			age--;
		}
		// 如果月份一致并且 日期大于当前日期 年龄减少1
		if (monthBirth == monthNow && dateBirth > dateNow) {
			age--;
		}

		return age;

	}

	/**
	 * 产生在指定时间范围的随机日期
	 * 
	 * @Title: getRandom
	 * @Description: TODO
	 * @param start
	 * @param end
	 * @return
	 * @return: Date
	 */
	public static Date getRandom(Date start, Date end) {

		long timeStart = start.getTime();
		long endStart = end.getTime();

		long x = (long) (Math.random() * (endStart - timeStart + 1) + timeStart);

		return new Date(x);

	}

	/*
	 * 方法1：(5分) 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	 * 则返回的结果为2019-05-01 00:00:00
	 */
	public static Date getDateByInitMonth(Date src) {
		// 获取默认的日历类
		Calendar c = Calendar.getInstance();

		// 用传入的日期初始化日历类
		c.setTime(src);
		// 设置日历类 月的第一天
		c.set(Calendar.DAY_OF_MONTH, 1);
		// 设置日历类 天的第0个小时
		c.set(Calendar.HOUR_OF_DAY, 0);
		// 设置日历类 天的第0分钟
		c.set(Calendar.MINUTE, 0);
		// 设置日历类 天的第0秒
		c.set(Calendar.SECOND, 0);
		return c.getTime();

	}

	/*
	 * 方法2：(5分) 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	 * 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	 * 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	 */
	public static Date getDateByFullMonth(Date src) {
		// 获取默认的日历类

		Date date = getDateByInitMonth(src);

		// 获取默认的日历类
		Calendar c = Calendar.getInstance();

		// 用传入的日期初始化日历类
		c.setTime(date);
		// 让月加1
		c.add(Calendar.MONTH, 1);
		// 让秒减一
		c.add(Calendar.SECOND, -1);

		return c.getTime();
	}

}
