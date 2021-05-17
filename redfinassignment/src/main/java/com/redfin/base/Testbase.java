package com.redfin.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static WebDriver driver;
	public static Properties prop;

public Testbase() 
{
	try
	{
	 prop=new Properties();
	 FileInputStream fil=new FileInputStream("D:\\devi\\testing workspace\\launchsalesforce\\src\\main\\java\\com\\salesforce\\config\\objectrep.properties");
	 prop.load(fil);
	}
	 catch(FileNotFoundException e)
	 {
	 e.printStackTrace();
	 }
	 catch(IOException e)
	 {
	 e.printStackTrace();
	 }
	 
	
	
	 
}
public void intialization() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\devi\\july2019-testing\\selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	//driver = new WebDriver(new URL("https://rssridevi27:15198b2e-e6c3-4f88-babd-fd9f1e9cb0ca@ondemand.us-west-1.saucelabs.com:443/wd/hub"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


	driver.get(prop.getProperty("url"));


	}
	

}
