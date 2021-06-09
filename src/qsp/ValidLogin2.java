package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidLogin2 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://demo.actitime.com/");
		Driver.findElement(By.id("username")).sendKeys("admin");
		
		Driver.findElement(By.name("pwd")).sendKeys("manager");
		Driver.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(Driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		Driver.findElement(By.id("logoutLink")).click();
		Driver.close();
		
		
	}
}
		
