package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
	
		Driver.get("https://www.google.com");
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.findElement(By.name("q")).sendKeys("wipro jobs "+Keys.ENTER);
		List<WebElement>AllSugg=Driver.findElements(By.xpath("//a"));
		int count=AllSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String url=AllSugg.get(i).getText();
			System.out.println(url);
		}
		Driver.close();
	}
}
		
		
		
		
				
		


