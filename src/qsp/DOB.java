package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
	

	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver Driver=new ChromeDriver();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Driver.get("http://www.facebook.com/");
			Driver.findElement(By.xpath("//a[contains(.,'Create New Account')]")).click();
			WebElement Daylistbox = Driver.findElement(By.id("day"));
			Select s1 = new Select(Daylistbox);
			s1.selectByValue("12");
			WebElement Monthlistbox = Driver.findElement(By.id("month"));
			Select s2 = new Select( Monthlistbox);
			s2.selectByVisibleText("Feb");
			WebElement Yearlistbox = Driver.findElement(By.id("year"));
			Select s3 = new Select(Yearlistbox);
			s3.selectByValue("1993");
			

			
			
		}
}
