package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
public static WebDriver driver;
public static configdataprovider config;
public static exceldataprovider excel;
@BeforeSuite
public void BS() throws Exception {
	 config = new configdataprovider();
	 excel = new exceldataprovider();

}

@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(config.get_BaseUrl_QA2());
		
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod
	public void tear_down() {
		driver.close();
	}
}
