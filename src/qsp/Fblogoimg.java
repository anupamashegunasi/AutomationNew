package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogoimg {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		String tagName=driver.findElement(By.xpath("//img[@alt='Facebook']")).getTagName();
		if(tagName.equals("img"))
		{
			System.out.println("tagName is"+tagName+"test is pass");
		}
		else
		{
			System.out.println("test is fail");
		}
			driver.close();
		}
		}
