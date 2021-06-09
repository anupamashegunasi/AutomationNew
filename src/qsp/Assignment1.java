package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://www.flipkart.com/");
			Driver.findElement(By.xpath("//input[@title='search for products,brands and more']")).sendKeys("iphone");
		Thread.sleep(2000);
			Driver.findElement(By.name("q")).sendKeys("iphone");
			Thread.sleep(1000);
			
			List<WebElement>AllSugg=Driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
			int count=AllSugg.size();
			System.out.println(count);
			Thread.sleep(1000);
			for(int i=0;i<count;i++)
			{
				String text=AllSugg.get(i).getText();
				System.out.println(text);
				String text1=AllSugg.get(count-1).getText();
				System.out.println(text1);
				Driver.close();
			}
		}
}

