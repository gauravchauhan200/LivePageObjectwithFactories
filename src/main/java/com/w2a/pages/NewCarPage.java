package com.w2a.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.w2a.base.BasePage;

public class NewCarPage extends BasePage
{

	public NewCarPage(WebDriver driver) 
	{
		super(driver);
	}

	
	@FindBy(xpath="//img[contains(@title,'Maruti Suzuki')]")
	public WebElement marutiSuzuki;
	
	@FindBy(xpath="//div[text()='Hyundai']")
	public WebElement hyundai;
	
	@FindBy(xpath="//img[@title='Tata']")
	public WebElement tata;
	
	@FindBy(xpath="//img[@title='Mahindra']")
	public WebElement mahindra;
	
	@FindBy(xpath="//img[@title='Kia']")
	public WebElement kia;
	
	@FindBy(xpath="//img[@title='Volkswagen']")
	public WebElement volkswagen;
	
	@FindBy(xpath="//div[text()='Mercedes-Benz']")
	public WebElement mercedesBenz;
	
	@FindBy(xpath="//div[text()='Honda']")
	public WebElement honda;
	
	@FindBy(xpath="//div[text()='Skoda']")
	public WebElement skoda;
	
	@FindBy(xpath="//div[text()='BMW']")
	public WebElement bmw;
	
	@FindBy(xpath="//img[@alt='MG']")
	public WebElement mg;
	
	
	
	public MarutiSuzukiCarPAge gotoMarutiSuzuki()
	{
		marutiSuzuki.click();
		return new MarutiSuzukiCarPAge(driver);
	}
	
	public HyundaiCarPage gotoHyundai()
	{
		hyundai.click();
		return new HyundaiCarPage(driver);
	}
	
	public TataCarPAge gotoTata()
	{
		tata.click();
		return new TataCarPAge(driver);
	}

	public MahindraCarPage gotoMahindra()
	{
		mahindra.click();
		return new MahindraCarPage(driver);
	}
	
	public KiaCarPage gotoKia()
	{
		kia.click();
		return new KiaCarPage(driver);
	}
	
	public VolkswagonCarPage gotoVolkswagen()
	{
		volkswagen.click();
		return new VolkswagonCarPage(driver);
	}
	
	public MercedesBenzCarPage gotoMercedesBenz()
	{
		mercedesBenz.click();
		return new MercedesBenzCarPage(driver);
	}
	
	public HondaCarPage gotoHonda()
	{
		honda.click();
		return new HondaCarPage(driver);
	}
	
	public SkodaCarPage gotoSkoda()
	{
		skoda.click();
		return new SkodaCarPage(driver);
	}
	
	public BMWCarPage gotoBMW()
	{
		bmw.click();
		return new BMWCarPage(driver);
	}
	
	public MGCarPage gotToMG()
	{
		mg.click();
		return new MGCarPage(driver); 
	}
	

}
