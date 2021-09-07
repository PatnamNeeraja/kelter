package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;

public class CreateimplicitPages extends BaseTest{

	@FindBy(xpath = "//a[text()='Potentials']") private WebElement PotentialBtn;
	


public CreateimplicitPages()
{
	PageFactory.initElements(BaseTest.driver, this);
}


public void clickCreatePotential() throws Throwable
{
	PotentialBtn.click();
	FileLib flib = new FileLib();
	WebDriverCommonLib wb = new WebDriverCommonLib();
	wb.verify(wb.getPageTitle(),flib.readPropertyData(PROP_PATH,"TitlePotential"),"Potential Page");
}
}