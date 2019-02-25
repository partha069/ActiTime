package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	@FindBy(name="name") WebElement customerNameEdt;	
	@FindBy(name="description") WebElement customerDespEdt;
	@FindBy(name="createCustomerSubmit")
	WebElement createNewCustomerBtn;
	
	public void cerateCustomer(String customerNAme){
		customerNameEdt.sendKeys(customerNAme);
		createNewCustomerBtn.click();
	}
	public void cerateCustomer(String customerNAme,
			           String customerDesp){
		customerNameEdt.sendKeys(customerNAme);
		customerDespEdt.sendKeys(customerDesp);
		createNewCustomerBtn.click();
	}
	
	
	
}
