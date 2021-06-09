package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
}
public WebDriver driver;
@Parameters("browser")
@BeforeTest
public void openBrowser(String browser)
{
	Reporter.log("openBrowser", true);
if(browser.equals("chrome"))
{
	driver=new ChromeDriver();
}
else if(browser.equals("firefox"))
{
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.DAYS);
}
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















