package com.w2a.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.w2a.base.BasePage;

public class NewCarPage extends BasePage
{
	WebDriver driver;
	public NewCarPage(WebDriver driver) 
	{
		super(driver);
	}
	
	
	public void gotoMarutiSuzuki()
	{
		driver.findElement(By.xpath("//img[contains(@title,'Maruti Suzuki')]")).click();
	}
	
	public void gotoHyundai()
	{
		driver.findElement(By.xpath("//div[@class='o-cpNAVm o-byFsZJ o-eemiLE o-fzpihx' and text()='Hyundai']")).click();
	}
	
	public void gotoTata()
	{
		driver.findElement(By.xpath("//img[@title='Tata']")).click();
	}

	public void gotoMahindra()
	{
		driver.findElement(By.xpath("//img[@title='Mahindra']")).click();
	}
	
	public void gotoKia()
	{
		driver.findElement(By.xpath("//img[@title='Kia']")).click();
	}
	
	public void gotoVolkswagen()
	{
		driver.findElement(By.xpath("//img[@title='Volkswagen']")).click();
	}
	
	public void gotoMercedesBenz()
	{
		driver.findElement(By.xpath("//div[text()='Mercedes-Benz']")).click();
	}
	
	public void gotoHonda()
	{
		driver.findElement(By.xpath("//div[text()='Honda']")).click();
	}
	
	public void gotoSkoda()
	{
		driver.findElement(By.xpath("//div[text()='Skoda']")).click();
	}
	
	public void gotoBMW()
	{
		driver.findElement(By.xpath("//div[text()='BMW']")).click();
	}
	
	public void gotToMG()
	{
		driver.findElement(By.xpath("//img[@alt='MG']")).click();
	}
	

}
