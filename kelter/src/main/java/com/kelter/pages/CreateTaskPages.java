package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class CreateTaskPages {

	@FindBy(xpath = "//input[@value='Create Task']") private WebElement CT;
	
	public CreateTaskPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickCreateTask () throws Throwable
	{
		CT.click();
	}
}
