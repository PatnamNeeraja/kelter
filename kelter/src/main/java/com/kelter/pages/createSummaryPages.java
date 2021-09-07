package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class createSummaryPages {
	
	@FindBy(xpath = "//a[text()='Reports']") private WebElement CS;
	
	public createSummaryPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickcreateSummary () throws Throwable
	{
		CS.click();
	}
}
