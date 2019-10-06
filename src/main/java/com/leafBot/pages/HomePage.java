package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public LeadsmainPage clickCRMSFALink() {
		click(locateElement("link","CRM/SFA"));
		return new LeadsmainPage();
	}

}
