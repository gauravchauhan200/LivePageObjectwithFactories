package com.w2a.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class NewCarPage 
{
	WebDriver driver;
	
	public NewCarPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public MarutiSuzukiCarPAge gotoMarutiSuzuki()
	{
		driver.findElement(By.xpath("//img[contains(@title,'Maruti Suzuki')]")).click();
		return new MarutiSuzukiCarPAge(driver);
	}
	
	public HyundaiCarPage gotoHyundai()
	{
		driver.findElement(By.xpath("//div[text()='Hyundai']")).click();
		return new HyundaiCarPage(driver);
	}
	
	public TataCarPAge gotoTata()
	{
		driver.findElement(By.xpath("//img[@title='Tata']")).click();
		return new TataCarPAge(driver);
	}

	public MahindraCarPage gotoMahindra()
	{
		driver.findElement(By.xpath("//img[@title='Mahindra']")).click();
		return new MahindraCarPage(driver);
	}
	
	public KiaCarPage gotoKia()
	{
		driver.findElement(By.xpath("//img[@title='Kia']")).click();
		return new KiaCarPage(driver);
	}
	
	public VolkswagonCarPage gotoVolkswagen()
	{
		driver.findElement(By.xpath("//img[@title='Volkswagen']")).click();
		return new VolkswagonCarPage(driver);
	}
	
	public MercedesBenzCarPage gotoMercedesBenz()
	{
		driver.findElement(By.xpath("//div[text()='Mercedes-Benz']")).click();
		return new MercedesBenzCarPage(driver);
	}
	
	public HondaCarPage gotoHonda()
	{
		driver.findElement(By.xpath("//div[text()='Honda']")).click();
		return new HondaCarPage(driver);
	}
	
	public SkodaCarPage gotoSkoda()
	{
		driver.findElement(By.xpath("//div[text()='Skoda']")).click();
		return new SkodaCarPage(driver);
	}
	
	public BMWCarPage gotoBMW()
	{
		driver.findElement(By.xpath("//div[text()='BMW']")).click();
		return new BMWCarPage(driver);
	}
	
	public void gotToMG()
	{
		driver.findElement(By.xpath("//img[@alt='MG']")).click();
	}
	

}
