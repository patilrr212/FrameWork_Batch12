package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configdataprovider {
	Properties pro;
	public configdataprovider() throws Exception {
		
		String path = "C:\\Users\\Rohit\\eclipse-workspace\\Batch12_Framework3\\config\\config.properties";
		FileInputStream fis = new FileInputStream(path);
		 pro = new Properties();
		pro.load(fis);
		
	}
	
	public String get_BaseUrl_QA1(){
	return pro.getProperty("BaseUrl QA1");
	
	}
	
	public String get_BaseUrl_QA2() {
		return pro.getProperty(get_BaseUrl_QA2());
	}
}
