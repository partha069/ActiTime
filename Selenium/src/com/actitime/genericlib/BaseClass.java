package com.actitime.genericlib;

import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.acttime.objectrepositorylib.Common;
import com.acttime.objectrepositorylib.Login;

public class BaseClass { 
	public static WebDriver driver;
	@BeforeClass
	public void configBC() throws Throwable{
		CommonUtils cLib = new CommonUtils();
		Properties pObj = cLib.getPropertyObj();
		String pBrower = pObj.getProperty("browser");
		if(pBrower.equals("firefox")){
		   driver = new FirefoxDriver();
		}else if(pBrower.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", 
					"./resource/chromedriver.exe");
            driver = new ChromeDriver();
		}else if(pBrower.equals("ie")){
			System.setProperty("webdriver.ie.driver", 
					 "./resource/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
		}else{
			driver = new FirefoxDriver();
		}
	} 
	
	@BeforeMethod
	public void configBM() throws Throwable{
		CommonUtils cLib = new CommonUtils();

		Properties pObj = cLib.getPropertyObj();
		System.out.println("login to aPP");
		Login lp = PageFactory.initElements(driver, Login.class);
		lp.login(pObj.getProperty("username"), pObj.getProperty("password"));
	}
	
	@AfterMethod
	public void configAM(){
		System.out.println("logout");
		Common cp = PageFactory.initElements(driver, Common.class);
		cp.logout();
	}
	
	@AfterClass
	public void configAC(){
		driver.close();
	}

}
