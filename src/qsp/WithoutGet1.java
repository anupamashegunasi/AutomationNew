package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutGet1
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
 
			WebDriver Driver=new ChromeDriver();
			Driver.navigate().to("http://www.naukri.com/");
			Thread.sleep(3000);
			Driver.quit();
	}

}
