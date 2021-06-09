package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoDisplayed {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		boolean logo=Driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("log is dispalyed and pass");
	}
	else
	{
		System.out.println("log is not displayed and fail");
		
	}
Driver.close();
}

}