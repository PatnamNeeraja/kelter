package com.kelter.implicit;

import org.testng.annotations.Test;

import com.kelter.GenericLib.BaseTest;
import com.kelter.GenericLib.FileLib;
import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.CreateimplicitPages;
import com.kelter.pages.NewImplicitPages;
import com.kelter.pages.PotentialInformationPages;

public class ImplicitTest extends BaseTest{
	
	@Test
	public  void mains() throws Throwable{
		
	LoginPageTest ln = new LoginPageTest();
	ln.LoginPage();
	
	CreateimplicitPages ci = new CreateimplicitPages();
	ci.clickCreatePotential();
	
	NewImplicitPages ni = new NewImplicitPages();
	ni.clickNewImpBtn();
	
	FileLib flib = new FileLib();
	
	PotentialInformationPages pi = new PotentialInformationPages();
	pi.createPotentialInformation(flib.readExceldata(EXCEL_PATH,"Sheet", 3, 1),	
			flib.readExceldata(EXCEL_PATH,"Sheet", 4, 1),
			flib.readExceldata(EXCEL_PATH,"Sheet", 5, 1),
			flib.readExceldata(EXCEL_PATH,"Sheet", 6, 1));
	
	driver.close();
}
}
	
	


