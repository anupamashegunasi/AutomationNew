package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule2 {
	@BeforeMethod
	public void login()
	{
		Reporter.log("login", true);
	}
	@AfterMethod
	public void logout()
	{
		
		Reporter.log("logout", true);
}
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("openBrowser", true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("closeBrowser", true);
	}
	@Test(priority=1,invocationCount=2)
	public void editCustomer()
	{
		Reporter.log("editCustomer", true);
	}
	
	@Test
	public void registerCustomer()
	{
		Reporter.log("registerCustomer", true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer", true);
	}
}
	
	
	
