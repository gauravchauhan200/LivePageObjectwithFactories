package com.w2a.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MercedesBenzCarPage
{
	WebDriver driver;
	public MercedesBenzCarPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	

	
}
