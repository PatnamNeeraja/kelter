package com.kelter.Settings;

import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.AccountInfPages;
import com.kelter.pages.SetUpPage;

public class SettingsTab {
	public static void main(String args[]) throws Throwable {
	
	LoginPageTest ln = new LoginPageTest();
	ln.LoginPage();
	
	SetUpPage st = new SetUpPage();
	st.SetUpclick();
	
	AccountInfPages af = new AccountInfPages();
	af.clickAccountInf();
}
} 
