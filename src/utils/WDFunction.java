package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WDFunction {
	public static WebDriver driver;
	public static Logger Application_Logs = Logger.getLogger ("devpinoyLogger");
	//account
	public void clickById (String locator){
		driver.findElement(By.id(locator)).click();

	}
	//create an account
	public void clickByaccid(String locator){
		driver.findElement(By.id(locator)).click();

	}
	//firstname
	public void typeByfirstname (String locator, String values){
		try{
		
		driver.findElement(By.cssSelector(locator)).clear();
		driver.findElement (By.cssSelector(locator)).sendKeys (values);

	}
		catch(Exception e){
		}
		}
	//lastname
	public void typeBylastname (String locator, String values){
		
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement (By.xpath(locator)).sendKeys (values);
		}
		
	//email
	public void typeByemail (String locator, String values){
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement (By.xpath(locator)).sendKeys (values);

	}  
	//password
	public void typeBypassword(String locator, String values){
		driver.findElement(By.xpath(locator)).clear();
		driver.findElement (By.xpath(locator)).sendKeys (values);

	}
	//cilck on sign up button
	//public void typeBybuttonId (String locator){
		//driver.findElement (By.id(locator)).click();

	//}
	//public void maxPage (){
			
			//driver.manage().window().maximize();
			
		}

//}
