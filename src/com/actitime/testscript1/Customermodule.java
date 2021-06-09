package com.actitime.testscript1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Customermodule {
	public class CustomerModule extends BaseClass
	{
		@Test
		public void createCustomer()
		{
			Reporter.log("createCustomer",true);
		Assert.fail();
	}

}
}
