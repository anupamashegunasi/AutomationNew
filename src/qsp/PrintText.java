package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
	String text = driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).getText();
		System.out.println(text);
		driver.close();
	}
	
}
