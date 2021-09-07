package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class SelectLeadsPages {
	
	@FindBy(xpath = "//select[@id='primarymodule']") private WebElement SL;
	
	public SelectLeadsPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickSelectLeads () throws Throwable
	{
		SL.click();
	}
}
