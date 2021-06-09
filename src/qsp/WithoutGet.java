package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGet 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
 
			WebDriver Driver=new ChromeDriver();
			Driver.navigate().to("http://www.google.com/");
			Driver.navigate().to("http://www.gmail.com/");
			Thread.sleep(1000);
			Driver.navigate().back();
			Thread.sleep(1000);
			Driver.navigate().forward();
			Thread.sleep(1000);
			Driver.navigate().refresh();
			Thread.sleep(1000);
			Driver.close();
			
			
	}

}
