package com.actitime.testscript1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("closeBrowser", true);
		driver.close();
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login", true);
		driver.get("http://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='login']")).click();
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout", true);
		driver.findElement(By.id("logoutlink")).click();
	}
	}



