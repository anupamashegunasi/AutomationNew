package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://www.google.com/");
			Driver.findElement(By.name("q")).sendKeys("java");
			Thread.sleep(3000);
List<WebElement> AllSugg = Driver.findElements(By.xpath("//span[contains(text(),'java')]"));
			int count=AllSugg.size();
			System.out.println(count);
			for(int i=0;i<count;i++) {
				String text=AllSugg.get(i).getText();
				System.out.println(text);
			}
			AllSugg.get(0).click();
				
				Driver.close();
				
			}
	
				
			}
		

