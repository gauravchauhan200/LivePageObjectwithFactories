package com.w2a.testcases;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.BasePage;
import com.w2a.base.BaseTest;
import com.w2a.pages.HomePage;
import com.w2a.pages.NewCarPage;
import com.w2a.utilities.DataUtil;



public class FindNewCarTest extends BaseTest
{
	@Test(dataProviderClass=DataUtil.class,dataProvider="dp1")
	public void findNewCar(String browserName,String carBrand,String carTitle,String runMode) throws InterruptedException
	{	
		if(runMode.equals("N"))
		{
			throw new SkipException("Skipping the Test as the runmode is set to NO");
		}
		
		
		setUp(browserName);
		HomePage home = new HomePage(driver);
		NewCarPage carPage = home.findNewCar();
		
		
		if(carBrand.equals("Maruti Suzuki"))
		{
			carPage.gotoMarutiSuzuki();
		}
		else if(carBrand.equals("Hyundai"))
		{
			carPage.gotoHyundai();
		}
		else if(carBrand.equals("Tata"))
		{
			carPage.gotoTata();
		}
		else if(carBrand.equals("Mahindra"))
		{
			carPage.gotoMahindra();
		}
		else if(carBrand.equals("Kia"))
		{
			carPage.gotoKia();
		}
		else if(carBrand.equals("Toyota"))
		{
			carPage.gotoToyota();
		}
		else if(carBrand.equals("Mercedes-Benz"))
		{
			carPage.gotoMercedesBenz();
		}
		else if(carBrand.equals("Honda"))
		{
			carPage.gotoHonda();
		}
		else if(carBrand.equals("Skoda"))
		{
			carPage.gotoSkoda();
		}
		else if(carBrand.equals("BMW"))
		{
			carPage.gotoBMW();
		}
		else if(carBrand.equals("MG"))
		{
			carPage.gotToMG();
		}
		
		
		
		
		
		String title = BasePage.carBase.getCarTitle();
		System.out.println("Car Title is : "+title);
		Assert.assertEquals(title, carTitle);
		
		
	}

}








//carPage.gotoBMW().getCarTitle();				
		//new HomePage(driver).findNewCar().gotoBMW();	



/*
	HomePage home = PageFactory.initElements(driver, HomePage.class); 
	else use it in every page constructor or in BaseClass once and extends 
	Below code can be written in one single line

	HomePage home = new HomePage(driver);
	home.findNewCar();
	NewCarPage carPage = new NewCarPage(driver);
	carPage.gotoBMW();
				

*/