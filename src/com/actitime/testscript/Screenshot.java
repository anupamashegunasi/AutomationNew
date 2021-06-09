package com.actitime.testscript;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void takeScreenShot()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot t=(TakesScreenshot)driver;
	File source=t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshot/ss.png");
	FileUtils.copyFile(source,dest);
	driver.close();
	
}

}
