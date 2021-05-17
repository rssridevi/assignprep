package com.redfin.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redfin.base.Testbase;

public class Homepage extends Testbase{
	@FindBy(name="searchInputBox")
	WebElement searchbox;
	@FindBy(xpath="//a[@class='item-title block']")
	WebElement place;
	public Searchpage search(String city) throws InterruptedException
	{
		searchbox.sendKeys(city);
		place.click();
		return new Searchpage();


	}
	public Homepage()
	{
		PageFactory.initElements(driver,this);
		
	}

	
	}


