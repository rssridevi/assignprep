package com.redfin.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redfin.base.Testbase;
import com.redfin.pages.Homepage;
import com.redfin.pages.Searchpage;


public class Homepagetest extends Testbase {
	Homepage hpage;
	Searchpage spage;
	public Homepagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		intialization();
		hpage=new Homepage();
	}
	@Test
	public void searchcity() throws InterruptedException
	{
		spage=hpage.search("sunnyvale");
		
		
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	

}
