package com.w2a.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import com.w2a.utilities.DbManager;
import com.w2a.utilities.ExcelReader;
import com.w2a.utilities.MonitoringMail;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public 	WebDriver driver;
	public  Properties config = new Properties();
	public  Properties OR = new Properties();
	public  FileInputStream fis;
	public  ExcelReader excel =  new ExcelReader(".//src//test//resources//excel//testdata3.xlsx");
	public  Logger log = Logger.getLogger(BaseTest.class);
	public 	MonitoringMail mail = new MonitoringMail();
	public	WebDriverWait wait;
	
	
	public void setUp(String browser)
	{
		// loading the log file
			PropertyConfigurator.configure("./src/test/resources/properties/log4j.properties");

		// loading the OR and Config properties
		try {
			fis = new FileInputStream("./src/test/resources/properties/config.properties");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		try {
			config.load(fis);
			log.info("Config properties loaded !!!");
			} catch (IOException e) {
			e.printStackTrace();
			}

		try {
			fis = new FileInputStream("./src/test/resources/properties/OR.properties");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		try {
			OR.load(fis);
			log.info("OR properties loaded !!!");
			} catch (IOException e) {
			e.printStackTrace();
			}

		if (browser.equals("chrome")) {
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			log.info("Launching Chrome !!!");

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			log.info("Launching Firefox !!!");
		}

		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigated to : " + config.getProperty("testsiteurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,Integer.parseInt(config.getProperty("explicit.wait")));
	
		try {
			DbManager.setMysqlDbConnection();
			log.info("DB Connection established !!!");
			} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			} 
		catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
		log.info("Test Execution completed !!!");
	}
	
	
	
		
}


/*	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(config.getProperty("implicit.wait")))); 
wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(config.getProperty("explicit.wait"))));	*/
