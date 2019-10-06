package com.leafBot.pages;



public class CreateLeadForm extends LeadsmainPage {

	public CreateLeadForm enterFirstName() {
		
		clearAndType(locateElement("id", "createLeadForm_firstName"), "Vidhya");
		return this;
		
	}
	
public CreateLeadForm enterLastName() {
		
		clearAndType(locateElement("id", "createLeadForm_lastName"), "Alagappan");
		return this;
		
	}

public CreateLeadForm enterCompanyName() {
	
	clearAndType(locateElement("id", "createLeadForm_companyName"), "Cognizant");
	return this;
	
}

public ViewLead ClickCreate() {
	
	click(locateElement("xpath", "//input[@class='smallSubmit']"));
	return new ViewLead();
	
	
	
}
}
