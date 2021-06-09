package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Widthofemailpwd {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		int width=Driver.findElement(By.id("email")).getSize().getWidth();
		int width1=Driver.findElement(By.name("pass")).getSize().getWidth();
		System.out.println(width);
		System.out.println(width1);
		if(width==width1)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}

}
}


