package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://demo.actitime.com/");
		boolean res=Driver.findElement(By.xpath("//div[text()='Login ']")).isEnabled();
		System.out.println(res);
	}
	

}
