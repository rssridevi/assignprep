package com.redfin.pages;


import com.redfin.base.Testbase;
import com.redfin.pages.Homepage;
import com.redfin.pages.Searchpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage extends Testbase
{
	String city;
	@FindBy(xpath="//div[@class='Tag align-center justify-between clickable']")
	WebElement searchbox;
	@FindBy(xpath="//div[@class='CustomFilter inline-block desktopExposedSearchFilter']")
	WebElement price;
	@FindBy(xpath="//*[@name='quickMinPrice']")
	WebElement mindropdown;
	@FindBy(xpath="//*[@name='quickMaxPrice']")
	WebElement maxdropdown;
	public Searchpage()
	{
		PageFactory.initElements(driver,this);
		
	}
	public String validatesearch()
	{
		  return searchbox.getText();
		  
		//*[@id='cars']
	}
	public void price()
	{
		price.click();//ssIFrame_google
		//mindropdown.click();
		
		
		  Select min=new Select(mindropdown); 
		  min.selectByVisibleText("$600k");
		  Select max=new Select(maxdropdown); 
		  min.selectByVisibleText("$800k");
		 
		
	}

}
