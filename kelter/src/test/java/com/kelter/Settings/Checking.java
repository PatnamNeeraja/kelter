package com.kelter.Settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.kelter.GenericLib.BaseTest;

public class Checking extends BaseTest{
	/*@FindBy(id = "username")
	private WebElement untb;
	@FindBy(id = "password")
	private WebElement pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]")
	private WebElement signInBtn;*/

	public static void main(String args[]) throws Throwable
	{
		BaseTest ba = new BaseTest();
		ba.openbrowser();
		driver.findElement(By.id("username")).sendKeys("rashmi@dell.com");
		
	}
}

