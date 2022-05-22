package com.w2a.testcases;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.w2a.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindNewCarTest
{
	public static void main (String[] args) throws Exception
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver= new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		
/*	//	HomePage home = PageFactory.initElements(driver, HomePage.class);  else use it in construcor once
		
		HomePage home = new HomePage(driver);		
		NewCarPage carpage = home.findNewCar();
		carpage.gotoMercedesBenz();
*/	
	//	All can be written in one single line
	
		new HomePage(driver).findNewCar().gotoBMW();
		
			
		Thread.sleep(3000);
		driver.quit();
	}

}
