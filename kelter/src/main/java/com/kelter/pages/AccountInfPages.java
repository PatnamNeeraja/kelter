package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;

public class AccountInfPages extends BaseTest{
	
	@FindBy(xpath="//td [@class = 'label']/descendant::a[text()='Account Information']") private WebElement AccountInf;
	
	public AccountInfPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void clickAccountInf() throws Throwable
	{
		AccountInf.click();
		FileLib flib = new FileLib();
		WebDriverCommonLib wb = new WebDriverCommonLib();	
		wb.verify(wb.getPageTitle(), flib.readPropertyData(PROP_PATH, "Title"),"Account Information Page");
	}
	
	
	

}
