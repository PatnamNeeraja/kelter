package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class SelectBannerPages extends BaseTest{
	
	@FindBy(xpath = "//a[text()='banner']") private WebElement SB;
	
	public SelectBannerPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickSelectBanner () throws Throwable
	{
		SB.click();
	}
		

}
