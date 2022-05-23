package com.w2a.testcases;
import org.testng.annotations.Test;

import com.w2a.base.BaseTest;
import com.w2a.pages.HomePage;
import com.w2a.pages.NewCarPage;


public class FindNewCarTest extends BaseTest
{
	@Test
	public void findNewCar() throws InterruptedException
	{	
		setUp("chrome");
		HomePage home = new HomePage(driver);
		NewCarPage carPage = home.findNewCar();
		carPage.gotoBMW();
						
		//new HomePage(driver).findNewCar().gotoBMW();	
	}

}












/*
	HomePage home = PageFactory.initElements(driver, HomePage.class); 
	else use it in every page constructor or in BaseClass once and extends 
	Below code can be written in one single line

	HomePage home = new HomePage(driver);
	home.findNewCar();
	NewCarPage carPage = new NewCarPage(driver);
	carPage.gotoBMW();
				

*/