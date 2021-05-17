package com.redfin.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.redfin.base.Testbase;
import com.redfin.pages.Homepage;
import com.redfin.pages.Searchpage;

public class Searchpagetest extends Testbase{
	Homepage hpage;
	Searchpage spage;
	public Searchpagetest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		
			intialization();
			hpage=new Homepage();
			spage=new Searchpage();
			hpage.search("sunnyvale");
		
	}
	@Test
	public void verifysearch()
	{
		String city=spage.validatesearch();
		Assert.assertEquals(city, "Sunnyvale");
		
	}
	@Test
	public void priceselect()
	{
		driver.switchTo().frame(0);

		spage.price();
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	
	
}
