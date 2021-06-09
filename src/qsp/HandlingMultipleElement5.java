package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement5
{
	static 
		{
			
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args)
		{
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://www.amazon.in/");
			List<WebElement> AllLinks=Driver.findElements(By.xpath("//a"));
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

