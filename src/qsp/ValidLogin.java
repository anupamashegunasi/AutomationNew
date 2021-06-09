package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Driver.get("http://demo.actitime.com/");
		Driver.findElement(By.id("username")).sendKeys("admin");
		
		Driver.findElement(By.name("pwd")).sendKeys("manager");
		Driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Driver.findElement(By.id("logoutLink")).click();
		Driver.close();
	}
}
