package com.actime.customertest;

import java.awt.PageAttributes;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.CommonUtils;
import com.acttime.objectrepositorylib.ActtiveProjectAndCustomer;
import com.acttime.objectrepositorylib.CreateNewCustomer;
import com.acttime.objectrepositorylib.Home;
import com.acttime.objectrepositorylib.OpenTask;

public class CustomerTest extends BaseClass{
	
	@Test
	public void createCustomerTest() throws Throwable{
		//read test data
		CommonUtils cLib = new CommonUtils();
		String customerNAme = cLib.getExcelData("Sheet2", 1, 2);
		String expMsg = cLib.getExcelData("Sheet2", 1, 3);

		//step 2  : navigate to TASK Page
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.naviagateToTAskPage();
		
		//step 3 : navigate to Pro & cust PAge
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.naviagateToPrjectAndCustomerPage();
		
		//step 4 : navigate to create Customer PAgae
		ActtiveProjectAndCustomer ap = PageFactory.initElements(driver, ActtiveProjectAndCustomer.class);
		ap.naviagateToCreateNewCustomerPAge();
		
		//step 5 : create New Customer
		CreateNewCustomer cncp = PageFactory.initElements(driver, CreateNewCustomer.class);
		cncp.cerateCustomer(customerNAme);
		
		//step 6  :verify
		String actMSg = ap.getSucMsgText().getText();
		boolean stat = actMSg.contains(expMsg);
		Assert.assertTrue(stat);
		System.out.println(actMSg);
	}
	
	@Test
	public void createCustomerWithDescpTest() throws Throwable{
		//read test data
				CommonUtils cLib = new CommonUtils();
				String customerNAme = cLib.getExcelData("Sheet2", 2, 2);
				String customerDescp = cLib.getExcelData("Sheet2", 2, 3);
				String sucMsg = cLib.getExcelData("Sheet2", 2, 4);
				
				//step 2  : navigate to TASK Page
				Home hp = PageFactory.initElements(driver, Home.class);
				hp.naviagateToTAskPage();
				//step 3 : navigate to Pro & cust PAge
				OpenTask op = PageFactory.initElements(driver, OpenTask.class);
				op.naviagateToPrjectAndCustomerPage();
				//step 4 : navigate to create Customer PAgae
				ActtiveProjectAndCustomer ap = PageFactory.initElements(driver, ActtiveProjectAndCustomer.class);
				ap.naviagateToCreateNewCustomerPAge();
				//step 5 : create New Customer
				CreateNewCustomer cncp = PageFactory.initElements(driver, CreateNewCustomer.class);
				cncp.cerateCustomer(customerNAme, customerDescp);
				//step 6  :verify
				String actMSg = ap.getSucMsgText().getText();
				boolean stat = actMSg.contains(sucMsg);
				Assert.assertTrue(stat);
				System.out.println(actMSg);
	}

}








