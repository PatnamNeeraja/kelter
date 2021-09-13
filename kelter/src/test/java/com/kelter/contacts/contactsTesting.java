package com.kelter.contacts;

import org.testng.annotations.Test;

import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.ContactTabPages;
import com.kelter.pages.NewContactPages;

public class contactsTesting {
	@Test 
	public  void Contacts() throws Throwable {
		
		LoginPageTest ln = new LoginPageTest();
		ln.LoginPage();
		
		ContactTabPages ct = new ContactTabPages();
		ct.clickContactTab();
		
		NewContactPages nc = new NewContactPages();
		nc.clickNewContact();
		
			
	}

}
