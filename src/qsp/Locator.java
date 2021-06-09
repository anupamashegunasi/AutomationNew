package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}



	public static void main(String[] args) throws InterruptedException
	{

		WebDriver Driver=new ChromeDriver();
		Driver.get("file:///C:/Users/Vedavati/Desktop/demo.html");
		Driver.findElement(By.tagName("a")).click();
		Driver.navigate().back();
	Driver.findElement(By.id("d1")).click();
		Driver.navigate().back();
	Driver.findElement(By.name("n1")).click();
		Driver.navigate().back();
		Driver.findElement(By.className("c1")).click();
		Driver.quit();
		
		
		
	}

}
