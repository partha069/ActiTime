package com.acttime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActtiveProjectAndCustomer {
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement createNewCustomerBtn;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement createNewProjectBtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	 WebElement sucMsgText;
	
	
   public WebElement getCreateNewCustomerBtn() {
		return createNewCustomerBtn;
	}

	public WebElement getCreateNewProjectBtn() {
		return createNewProjectBtn;
	}

	public WebElement getSucMsgText() {
		return sucMsgText;
	}

    public void naviagateToCreateNewCustomerPAge(){
	   createNewCustomerBtn.click();
   }	
   
   public void naviagateToCreateNewProjectPAge(){
	   createNewProjectBtn.click();
   }
   
   
}





