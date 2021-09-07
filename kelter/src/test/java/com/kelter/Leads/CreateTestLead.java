package com.kelter.Leads;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.GenericLib.WebDriverCommonLib;
import com.kelter.pages.CreateLeadPage;
import com.kelter.pages.CustomViewPage;
import com.kelter.pages.HomePage;
import com.kelter.pages.LoginPage;

public class CreateTestLead extends BaseTest {
	
	 public static void main(String[] args) throws Throwable{
		 BaseTest bt = new BaseTest();
		 bt.openbrowser();
		

		FileLib flib = new FileLib();
		LoginPage lp = new LoginPage();
		lp.loginToApp(flib.readPropertyData(PROP_PATH, "username"),flib.readPropertyData(PROP_PATH, "password"));
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		wb.verify(wb.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
		
		HomePage hp = new HomePage();
		hp.clickLeadsTab();
		
		wb.verify(wb.getPageTitle(), flib.readPropertyData(PROP_PATH,"customviewTitle" ), "Custom View Page");
		
		CustomViewPage cv = new CustomViewPage();
		cv.clickNewLeadBtn();
		
		wb.verify(wb.getPageTitle(),flib.readPropertyData(PROP_PATH, "createLeadTitle"),"Create Lead Page");
		
		CreateLeadPage cl = new CreateLeadPage();
		cl.createLeadWithMandatoryDetails(flib.readExceldata(EXCEL_PATH, "Sheet", 0, 0),flib.readExceldata(EXCEL_PATH, "Sheet", 1, 1));
		
		wb.verify(wb.getPageTitle(),flib.readPropertyData(PROP_PATH, "leadsDetailsTitle"),"Lead Details page");
	}

}
