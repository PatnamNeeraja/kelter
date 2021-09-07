package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class CreatenewReportPages extends BaseTest{
	
	@FindBy(xpath = "//input[@value='Create New Report']") private WebElement CR;
	
	public CreatenewReportPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickCreatenewReport () throws Throwable
	{
		CR.click();
	}
	

}
