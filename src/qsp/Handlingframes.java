package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Vedavati/Desktop/Page1.html");
			driver.switchTo().frame(0);
			driver.findElement(By.id("t2")).sendKeys("jsp");
			driver.switchTo().parentFrame();
			driver.findElement(By.id("t1")).sendKeys("qsp");
		}
	}
	

