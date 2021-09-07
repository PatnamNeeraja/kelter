package com.kelter.contacts;

import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.ContactTabPages;
import com.kelter.pages.NewContactPages;

public class contactsTesting {
	
	public static void main(String args[]) throws Throwable {
		
		LoginPageTest ln = new LoginPageTest();
		ln.LoginPage();
		
		ContactTabPages ct = new ContactTabPages();
		ct.clickContactTab();
		
		NewContactPages nc = new NewContactPages();
		nc.clickNewContact();
		
			
	}

}
