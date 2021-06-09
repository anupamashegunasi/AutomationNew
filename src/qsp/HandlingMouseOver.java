package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseOver {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement Resources=driver.findElement(By.id("navbarDocumentation"));
		Actions a=new Actions(driver);
		a.moveToElement(Resources).perform();
		String phoneNumber=driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]")).getText();
		System.out.println(phoneNumber);
		driver.close();
	}
		
		
		

}
