package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;

public class CustomerModule extends Baseclass {
	@Test
	public void cratecustomer()
	{
		Reporter.log("createcustomer", true);
	}

}
