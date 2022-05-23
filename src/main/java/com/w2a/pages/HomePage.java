package com.w2a.pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import com.w2a.base.BasePage;

public class HomePage extends BasePage
{
// Because of parameterized constructor we are providing constructor here
	public HomePage(WebDriver driver)
	{
	 	super(driver);
	}

	
	@FindBy(xpath="//div[text()='NEW CARS']")
	public WebElement newCarsMenu;
	
	@FindBy(xpath="//ul[@class='o-cpnuEd o-XylGE JP2Cxm']/a/div/div")
	public List <WebElement> newCarOptions;
	
	@FindBy(xpath="//input[@type='text' and @class='o-dqBOwT o-cKuOoN o-eZCpVk o-bfyaNx o-eZTujG o-jjpuv o-fzptVd o-fzptYr o-fEEqXL o-eKWNKE o-bIMsfE o-ItVGT  o-fznJFI DcJpYI bAREi7 mX5y3k  DcJpYI  ']")
	public WebElement searchNewCar;
	
	@FindBy(xpath="//*[@id='root']/div[3]/div[1]/div[2]/div/div[1]/div/button")
	public WebElement pressSearch;
	
	
	public NewCarPage findNewCar() throws InterruptedException  
	{
		Actions action=new Actions(driver);
		action.moveToElement(newCarsMenu).perform();
	
			for(WebElement option:newCarOptions)
			{
				if(option.getText().equalsIgnoreCase("Find New Cars"))
				{
					option.click();
					break;
				}
			}
		return new NewCarPage(driver);
	}

	
	
	public void searchNewCar(String carname)
	{
		searchNewCar.sendKeys(carname);
		pressSearch.click();
	}

	
	public void searchUsedCar(String city)
	{
		driver.findElement(By.xpath("//span[@data-unique-key='new']")).click();
		driver.findElement(By.xpath("//span[@data-unique-key='used']")).click();
		driver.findElement(By.xpath("//input[@placeholder='City, eg: Mumbai']")).sendKeys(city);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}


}
