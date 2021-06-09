package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		int x1=Driver.findElement(By.id("email")).getLocation().getX();
		int x2=Driver.findElement(By.id("pass")).getLocation().getX();
		if(x1==x2)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
System.out.println(x1+" "+x2);
Driver.close();
	}

}
