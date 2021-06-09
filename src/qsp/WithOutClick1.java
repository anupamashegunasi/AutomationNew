package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithOutClick1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://demo.opensourcebilling.org/");
		
		Driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		
		Driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
	
		Driver.close();
	}
	
		

}
