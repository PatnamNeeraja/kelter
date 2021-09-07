package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class ClickCOntinuePages {
	
	@FindBy(xpath = "//input[@name='nextBtn']") private WebElement CC;
	
	public ClickCOntinuePages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void clickClickCOntinue () throws Throwable
	{
		CC.click();
	}
}
