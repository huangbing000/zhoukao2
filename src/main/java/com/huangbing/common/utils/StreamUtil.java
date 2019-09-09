/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtil.java 
 * @Prject: huangbing-common
 * @Package: com.huangbing.common.utils 
 * @Description: TODO
 * @author: charles   
 * @date: 2019年8月8日 上午9:56:46 
 * @version: V1.0   
 */
package com.huangbing.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

/** 
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2019年8月8日 上午9:56:46  
 */
public class StreamUtil {
	
	/**
	 * 读取文件
	 * @Title: readFile 
	 * @Description: TODO
	 * @param in
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readFile(InputStream in) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(in));

		List<String> list = new ArrayList<>();
		String lineText = null;
		try {
			while ((lineText = reader.readLine()) != null) {

				list.add(lineText);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;

	}
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseable){
		if(null!=autoCloseable) {
			
//			/遍历.批量关闭
			for (AutoCloseable autoCloseable2 : autoCloseable) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		

	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，
	* 要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		
		
		byte[] b = new byte[1024];
		String str="";
		int x;
		while((x =src.read(b))!=-1) {
		 str+= new String(b,"utf-8");
		}
		//关闭流
		closeAll(src);
		
		return str;
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		
	   return 	readTextFile(new FileInputStream(txtFile));
		
	}
}
