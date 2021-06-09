package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorCls {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
Driver.get("file:///C:/Users/Vedavati/Desktop/demo.html");
Driver.findElement(By.cssSelector("a[id='d1']")).click();
Driver.navigate().back();
Driver.findElement(By.cssSelector("a[name='n1']")).click();
Driver.navigate().back();
Driver.findElement(By.cssSelector("a[class='c1']")).click();
Driver.navigate().back();
Driver.findElement(By.cssSelector("a[href='http://jspiders.com/']")).click();
	}
}
