package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesMaximise
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
 
			WebDriver Driver=new ChromeDriver();
			Driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			Driver.manage().window().maximize();
			Thread.sleep(3000);
			Driver.quit();
	}
	

}
