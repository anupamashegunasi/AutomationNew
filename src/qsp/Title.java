package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
 
			 WebDriver Driver= new ChromeDriver();
			Driver.get("http://www.facebook.com/");
			String title=Driver.getTitle();
			System.out.println(title);
			Driver.close();
	}
	}