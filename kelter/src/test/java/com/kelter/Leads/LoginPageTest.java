package com.kelter.Leads;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;
import com.kelter.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	public void LoginPage() throws Throwable
	{
		
	BaseTest bt = new BaseTest();
	bt.openbrowser();
	FileLib filb = new FileLib();
	
	LoginPage ln = new LoginPage();
	ln.loginToApp(filb.readPropertyData(PROP_PATH, "username"), 
			filb.readPropertyData(PROP_PATH, "password"));
	WebDriverCommonLib wb=new WebDriverCommonLib();
	wb.verify(wb.getPageTitle(), filb.readPropertyData(PROP_PATH, "HomeTitle"),"Home Page");
	
	}
}
