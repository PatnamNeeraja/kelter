package com.kelter.a.Crusade;

import org.testng.annotations.Test;

import com.kelter.GenericLib.BaseTest;
import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.CreateCrusadePages;
import com.kelter.pages.NewCrusadePages;
import com.kelter.pages.SelectBannerPages;

public class CrusadeTest extends BaseTest{
	@Test
	public  void Crusade() throws Throwable {	
	
	
	LoginPageTest ln = new LoginPageTest();
	ln.LoginPage();
	
	CreateCrusadePages cc = new CreateCrusadePages();
	cc.clickCreateCrusade();
	
	SelectBannerPages sb = new SelectBannerPages();
	sb.clickSelectBanner();
	
	NewCrusadePages nc = new NewCrusadePages();
	nc.clickNewCrusade();
	
	
	
	
	}

}
