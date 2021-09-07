package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class PotentialInformationPages {
	
	@FindBy(xpath = "//input[@name='property(Potential Name)']") private WebElement PotentialInf1;
	@FindBy(xpath = "//input[@name='property(Account Name)']") private WebElement AccountNm;
	@FindBy(xpath = "//input[@name='property(Closing Date)']") private WebElement ClosingDt;
	@FindBy(xpath = "//select[@name='property(Stage)']") private WebElement Stag;
	@FindBy(xpath = "//input[@value='Save'] ") private WebElement saveBtn;

	public PotentialInformationPages()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createPotentialInformation(String PI,String AN, String CD,String SG) throws Throwable
	{
		PotentialInf1.sendKeys(PI);
		AccountNm.sendKeys(AN);
		ClosingDt.sendKeys(CD);
		Stag.sendKeys(SG);
		saveBtn.click();
		
		
	}

}
