/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Person.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 下午3:46:16 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import java.util.Date;

/** 
 * @ClassName: Person 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 下午3:46:16  
 */
public class Person {
	private String name;
	private Integer age;
	private String about;
	private Date created;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the about
	 */
	public String getAbout() {
		return about;
	}
	/**
	 * @param about the about to set
	 */
	public void setAbout(String about) {
		this.about = about;
	}
	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	/** 
	 * @Title:Person
	 * @Description:TODO 
	 * @param name
	 * @param age
	 * @param about
	 * @param date 
	 */
	public Person(String name, Integer age, String about, Date date) {
		super();
		this.name = name;
		this.age = age;
		this.about = about;
		this.created = date;
	}
	/** 
	 * @Title:Person
	 * @Description:TODO  
	 */
	public Person() {
		super();
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", about=" + about + ", created=" + created + "]";
	}
	
	
	

}
