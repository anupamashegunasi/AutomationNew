package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlSourceCode
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
 
			WebDriver Driver=new ChromeDriver();
			Driver.get("html://www.google.com/");
			String htmlcode=Driver.getPageSource();
			System.out.println(htmlcode);
			Driver.close();
			
	}
	

}
