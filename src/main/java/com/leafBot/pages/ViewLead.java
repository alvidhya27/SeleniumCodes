package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;



public class ViewLead extends SeleniumBase  {
			
		public ViewLead verifyName() {
			verifyExactText((locateElement("id","viewLead_firstName_sp")),"Vidhya");
			return this;
		}


}