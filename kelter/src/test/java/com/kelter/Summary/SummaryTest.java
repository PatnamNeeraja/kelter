package com.kelter.Summary;

import com.kelter.Leads.LoginPageTest;
import com.kelter.pages.ClickCOntinuePages;
import com.kelter.pages.CreatenewReportPages;
import com.kelter.pages.createSummaryPages;

public class SummaryTest {
	
	public static void main(String args[]) throws Throwable {
		
		LoginPageTest ln = new LoginPageTest();
		ln.LoginPage();
		
		createSummaryPages cs = new createSummaryPages();
		cs.clickcreateSummary();
		
		CreatenewReportPages cr = new CreatenewReportPages();
		cr.clickCreatenewReport();
		
		ClickCOntinuePages cc = new ClickCOntinuePages();
		cc.clickClickCOntinue();
		
	}

}
