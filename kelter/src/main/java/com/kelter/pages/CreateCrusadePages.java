package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class CreateCrusadePages extends BaseTest{

	@FindBy(xpath = "//a[text()='Campaigns']") private WebElement Crusade;
	
	public CreateCrusadePages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickCreateCrusade () throws Throwable
	{
		Crusade.click();
	}
}
