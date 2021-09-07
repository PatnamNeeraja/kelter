package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class SetUpPage {
	@FindBy(xpath="//a[text()='Setup']") private WebElement wr;
	
	public SetUpPage( ) 
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	 
	public void SetUpclick()
	{
		wr.click();
	}
}
