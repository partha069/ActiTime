package com.acttime.objectrepositorylib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.CommonUtils;

public class Login {
	@FindBy(name="username") 
	WebElement usernameEdt;
	
	@FindBy(name="pwd") 
	WebElement passwordEdt;
	
	@FindBy(id="loginButton") 
	WebElement loginButton;
	
	public void login(String userName, String password) throws Throwable{
		CommonUtils cLib = new CommonUtils();
		Properties pObj = cLib.getPropertyObj();
		BaseClass.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		BaseClass.driver.get(pObj.getProperty("url"));
		usernameEdt.sendKeys(userName);
		passwordEdt.sendKeys(password);
		loginButton.click();	
	}
}
