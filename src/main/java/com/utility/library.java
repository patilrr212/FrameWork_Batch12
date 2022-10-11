package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class library {
	
	public static void custom_sendkeys(WebElement element,String value) {
		
		try {
		element.sendKeys(value);;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void custom_click(WebElement element) {
	
		try {
			element.click();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
			
		}
	
	
		public static void custom_handledropdown(WebElement element,String text) {
			try {
			Select select = new Select(element);
			select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}


public static void custom_handleMouseover_click(WebDriver driver,WebElement element) {
	try {
		Actions act = new Actions(driver);
act.moveToElement(element);
}catch(Exception e) {
	System.out.println(e.getMessage())
}
}
}

