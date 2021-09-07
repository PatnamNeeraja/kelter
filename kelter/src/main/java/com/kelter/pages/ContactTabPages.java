package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;

public class ContactTabPages extends BaseTest {
	@FindBy(xpath="//a[text()='Contacts']") private WebElement ContactTab;
	
	public ContactTabPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickContactTab() throws Throwable
	{
		ContactTab.click();
		FileLib flib = new FileLib();
		WebDriverCommonLib wb = new WebDriverCommonLib();	
		wb.verify(wb.getPageTitle(), flib.readPropertyData(PROP_PATH, "ContactsTitle"),"Contacts Page");
	}
		
	}



