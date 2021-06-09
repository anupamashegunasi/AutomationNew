package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginactitime {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
 
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://demo.actitime.com/");
			Driver.findElement(By.id("username")).sendKeys("admin");
			Driver.findElement(By.name("pwd")).sendKeys("manager");
			Driver.findElement(By.linkText("Login")).click();
			Thread.sleep(1000);
			Driver.close();
	}
			
					

}
