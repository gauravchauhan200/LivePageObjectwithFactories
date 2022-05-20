package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage 
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void findNewCar()
	{
		WebElement newCars= driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div/nav/ul/li[1]/div"));
		new Actions(driver).moveToElement(newCars).perform();
		driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div/nav/ul/li[1]/div[2]/div[1]/ul/a[1]/div/div")).click();
	}
	
	public void searchNewCar(String carname)
	{
		driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/div/div/div[1]/div/input")).sendKeys(carname);
		driver.findElement(By.xpath("//*[@id='root']/div[2]/div[1]/div[2]/div/div[1]/div/button")).click();
	}
	
	public void searchUsedCar(String city)
	{
		driver.findElement(By.xpath("//span[@data-unique-key='new']")).click();
		driver.findElement(By.xpath("//span[@data-unique-key='used']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys(city);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}
	
	
}
