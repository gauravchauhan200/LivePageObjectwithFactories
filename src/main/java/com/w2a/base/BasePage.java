package com.w2a.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class BasePage 
{
	public static WebDriver driver;  
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;	
		PageFactory.initElements(driver,this);
	}
		
	
}



/*	we made WebDriver static because we need it in
 *  ExtentManagerclass and if we make BaseTest driver static,
 * 	our testcase might not run in parallel
 */