package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium3link {
	static
	{
		
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

		public static void main(String[] args) throws InterruptedException, AWTException {
			WebDriver Driver=new FirefoxDriver();
			Driver.get("https://www.selenium.dev/downloads/");
			Driver.findElement(By.linkText("3.141.59")).click();
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_LEFT);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		}
}

			

