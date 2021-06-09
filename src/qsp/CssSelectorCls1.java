package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorCls1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
Driver.get("file:///C:/Users/Vedavati/Desktop/demo.html");
Driver.findElement(By.xpath("/html/body/a")).click();
	}
	

}
