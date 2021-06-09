package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clientverjava {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver Driver=new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.get("https://www.selenium.dev/downloads/");
WebElement version = Driver.findElement(By.xpath("//td[text()='Java']/../td[2]"));

}
}
