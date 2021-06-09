package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vedavati/Desktop/Disable.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
	 JavascriptExecutor j=(JavascriptExecutor)driver;
	 j.executeScript("document.getElementById('d2'), value='manager' ");
	}
}
	 		
		

