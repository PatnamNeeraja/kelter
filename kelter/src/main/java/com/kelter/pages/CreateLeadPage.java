package com.kelter.pages;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class CreateLeadPage {
	@FindBy(xpath = "//input[@name='property(Company)']") private WebElement companyTb;
	@FindBy(xpath = "//input[@name=\"property(Last Name)\"]") private WebElement lastNameTb;
	@FindBy(xpath = "//input[@value=\"save\"])[1]") private WebElement saveBtn;

	public  CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void createLeadWithMandatoryDetails(String companyName, String ln)
	{
		companyTb.sendKeys(companyName);
		lastNameTb.sendKeys(ln);
		saveBtn.click();
		
	}
}
