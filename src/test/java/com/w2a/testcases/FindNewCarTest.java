package com.w2a.testcases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.w2a.pages.HomePage;


public class FindNewCarTest 
{

	public static void main (String[] args)
	{

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		HomePage home = new HomePage(driver);
		home.findNewCar();
	
	
		
		
		driver.quit();
	}
	
}
