package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LeadsmainPage extends SeleniumBase {
	
	public LeadsmainPage ClickLeads() {
		
		click(locateElement("link","Leads"));
		return new LeadsmainPage();
		
	}
	
	public CreateLeadForm ClickCreateLead() {
		
		click(locateElement("link","Create Lead"));
		return new CreateLeadForm();
		
	}

}
