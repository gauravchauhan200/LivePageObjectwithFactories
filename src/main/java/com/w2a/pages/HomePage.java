package com.w2a.pages;

import java.util.List;

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

	
	public void findNewCar() throws Exception 
	{
		WebElement newCars= driver.findElement(By.xpath("//div[text()='NEW CARS']"));
		Actions action=new Actions(driver);
		action.moveToElement(newCars).perform();
	
		List<WebElement> newCarOptions = driver.findElements(By.xpath("//ul[@class='o-cpnuEd o-XylGE JP2Cxm']/a/div/div"));
			for(WebElement option:newCarOptions)
			{
				if(option.getText().equalsIgnoreCase("New Launches"))
				{
					option.click();
					break;
				}
			}
			Thread.sleep(3000);
	}

	
	
	public void searchNewCar(String carname)
	{
		driver.findElement(By.xpath("//input[@type='text' and @class='o-dqBOwT o-cKuOoN o-eZCpVk o-bfyaNx o-eZTujG o-jjpuv o-fzptVd o-fzptYr o-fEEqXL o-eKWNKE o-bIMsfE o-ItVGT  o-fznJFI DcJpYI bAREi7 mX5y3k  DcJpYI  ']")).sendKeys(carname);
		driver.findElement(By.xpath("//*[@id='root']/div[3]/div[1]/div[2]/div/div[1]/div/button")).click();
	}

	
	public void searchUsedCar(String city)
	{
		driver.findElement(By.xpath("//span[@data-unique-key='new']")).click();
		driver.findElement(By.xpath("//span[@data-unique-key='used']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys(city);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}


}
