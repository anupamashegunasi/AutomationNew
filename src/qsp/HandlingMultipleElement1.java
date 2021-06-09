package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement1 {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver Driver=new ChromeDriver();
			Driver.get("file:///C:/Users/Vedavati/Desktop/demo.html");
			List<WebElement> AllLinks=Driver.findElements(By.tagName("a"));
			int count=AllLinks.size();
			Thread.sleep(3000);
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
			WebElement Link=AllLinks.get(0);
			String text=Link.getText();
			System.out.println(text);
			Driver.close();
		}
		}
}
		


