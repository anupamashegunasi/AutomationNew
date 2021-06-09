package qsp;

import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver Driver=new ChromeDriver();
			Driver.get("file:///C:/Users/Vedavati/Desktop/demo.html");
			List<WebElement> AllLinks=Driver.findElements(By.tagName("a"));
			int count=AllLinks.size();
			
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement link=AllLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		}
		Driver.close();
		}
}
		
		
			
	


