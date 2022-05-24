package com.w2a.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarBase 
{
	WebDriver driver;
	public CarBase(WebDriver driver)
	{
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	//common method getCartitle for all carPages

	@FindBy(xpath="//h1[@class='o-dOKno o-bNCMFw o-fzoTzs o-dKUdmM']")
	public WebElement carTitle;
	
	public String getCarTitle()
	{
		return carTitle.getText();
	}
	
	
}
