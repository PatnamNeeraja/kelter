package com.kelter.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kelter.GenericLib.BaseTest;

public class LoginPage {

	@FindBy(id = "userName")
	private WebElement untb;
	@FindBy(id = "passWord")
	private WebElement pwtb;
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement signInBtn;

	public LoginPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	/*
	 * public WebElement getuntb() { return untb; } public void setuntb(WebElement
	 * untb) { this.untb = untb;
	 * 
	 * } public WebElement getpwtb() { return pwtb; } public void setpwtb(WebElement
	 * pwtb) { this.pwtb = pwtb;
	 * 
	 * } public WebElement getSignInBtn() { return signInBtn; } public void
	 * setSignInBtn(WebElement SignInBtn) { this.signInBtn = SignInBtn;
	 * 
	 * }
	 */
	public void loginToApp(String un, String pwd) throws Throwable {
		Thread.sleep(3000);
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInBtn.click();
	}
}
