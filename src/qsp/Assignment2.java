package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://www.google.com/");
			WebElement e=Driver.switchTo().activeElement();
			e.sendKeys("java");
		}

}
