package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;

public class NewImplicitPages extends BaseTest{
	
@FindBy(xpath="//input[@value='New Potential']") private WebElement NewImpBtn;
	
	public NewImplicitPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickNewImpBtn() throws Throwable
	{
		NewImpBtn.click();
		FileLib flib = new FileLib();
		WebDriverCommonLib wb = new WebDriverCommonLib();	
		wb.verify(wb.getPageTitle(), flib.readPropertyData(PROP_PATH, "CreatePotential"),"Create Implicit");
	}
	}



