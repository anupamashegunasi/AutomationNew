package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addofallbrowsernaukari {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main (String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allbrowser = driver.getWindowHandles();		
		for(String all:allbrowser)
		{
			
			System.out.println(all);
		}
		driver.quit();
	}

}
