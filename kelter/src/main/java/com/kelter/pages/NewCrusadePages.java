package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;


public class NewCrusadePages extends BaseTest{
	
	@FindBy(xpath = "//input[@value='New Campaign']") private WebElement NC;
	
	public NewCrusadePages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickNewCrusade () throws Throwable
	{
		NC.click();
	}
}
