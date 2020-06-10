package com.test.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.test.utils.CommonMethods;
import com.test.utils.ConfigsReader;
import com.test.utils.Constans;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static  WebDriver driver;
	
	
	
	
  
	  
	 public static WebDriver setUp() {
		 
		 ConfigsReader.readProperties(Constans.CONFIGURATIONS_FILEPATH);
		 
		 System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
		 
		 switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		 
		 case "chrome":
			WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
			    break;
			    
		 case "firefox":
			 WebDriverManager.firefoxdriver().setup();
			 
		
			 driver=new FirefoxDriver();
			 break;
			 default:
				 throw new RuntimeException("Browser is not supported");
			   
			   
		 
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Constans.IMPLISIT_WAIT_TIME, TimeUnit.SECONDS);
		 driver.get(ConfigsReader.getProperty("url"));
		 //initialize all page objects as part of setup
		 PageInitializer.initialize();
		 return driver;
		 
	 }
	 
	 public static void tearDown() {
		 if(driver!=null) {
			 CommonMethods.sleep(3);
			 driver.quit();
		 }
	 }
         
}
