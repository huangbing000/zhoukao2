/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 上午10:12:25 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.huangbing.common.utils.StreamUtil;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 上午10:12:25  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.huangbing.common.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 */
	@Test
	public void testCloseAll() {
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new FileInputStream("E:/test.txt"));
		System.out.println(string);
		
	}

	/**
	 * Test method for {@link com.huangbing.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new File("E:/test.txt"));
		System.out.println(string);
	}

}
