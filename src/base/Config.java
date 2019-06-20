package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utils.WDFunction;

public class Config extends WDFunction {
	
	@Parameters({"url", "browser"})// this annotation is used to insert browser parameter from TestNG xml
	@BeforeMethod
	public  void browserInitialize(String url, String browser){
		Application_Logs.info("browser Strated");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
		"//Driver//chromedriver.exe");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		System.out.println("new changes");
		System.out.println("new changes a"); 
		System.out.println("new changes B");
		System.out.println("new changes in develop");
		System.out.println("new changes in develop branch");
}
	@AfterMethod

public void afterTest (){
Application_Logs.info("close the browser");
System.out.println("new changes develop");
		

//driver.close();
}
		
	}


