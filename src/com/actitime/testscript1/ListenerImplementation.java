package com.actitime.testscript1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actitime.generics.Baseclass;

public class ListenerImplementation extends Baseclass implements ITestListener
{
	public void onTestStart(ITestListener result)
	{
		
	}
	public void onTestSucess(ITestListener result)
{
}

	
		public void onTestFailure(ITestResult result)
		{
			String tc=result.getName();
			TakesScreenshot t=(TakesScreenshot)driver;
			File source=t.getScreenshotAs(OutputType.FILE);
			File dest=new File("./screenshot"+tc+".png");
			try
			{
				FileUtils.copyFile(source,dest);
			}
			catch(IOException e)
			{
			}
			
			}
public void onTestskipped(ITestResult result) { }
public void onTestFailedButwithinsucesspercentage(ITestResult result) { }
public void onstart(ITestContext context) { }
public void onFinish(ITestContext context)
{
}
}