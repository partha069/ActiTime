package com.acttime.usertest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmazonProduct {
	
	@Test(dataProvider="getData")
	public void buyProductTestNAme(String cata, Object productNAme){
		System.out.println("catagary==>"+cata + "  prodctNAme=>"
	                                         +productNAme);
		//navigate to Amazon
		//search product "***"
		//add to cart "*****" product
	}
	
	
	@DataProvider
	public Object[][] getData(){
		 Object[][] objArr = new Object[7][2];
		 objArr[0][0] = "mobile";
		 objArr[0][1] = "iphone-6";

		 objArr[1][0] = "mobile";
		 objArr[1][1] = "iphone-7";

		 
		 objArr[2][0] = "mobile";
		 objArr[2][1] = "iphone-8";
		 
		 objArr[3][0] = "mobile";
		 objArr[3][1] = "iphone-X";
		 
		 objArr[4][0] = "electronics";
		 objArr[4][1] = "tv";
		 
		 objArr[5][0] = "electronics";
		 objArr[5][1] = "ac";
		 
		 objArr[6][0] = "electronics";
		 objArr[6][1] = "fan";
		return objArr;
	}

}
