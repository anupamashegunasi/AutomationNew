package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heightofemailpwd {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		int height=Driver.findElement(By.id("email")).getSize().getHeight();
		int height1=Driver.findElement(By.name("pass")).getSize().getHeight();
		System.out.println(height);
		System.out.println(height1);
		if(height==height1)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}

}
}
