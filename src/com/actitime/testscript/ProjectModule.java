package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.Baseclass;

public class ProjectModule extends Baseclass {
	@Test
	public void createproject()
	{
		Reporter.log("createproject", true);
	}

}
