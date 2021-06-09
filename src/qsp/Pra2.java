package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra2 {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(5000);
	boolean text=driver.findElement(By.xpath("//p[text()='You pressed Cancel!']")).isDisplayed();
	if(text==true)
	{
		System.out.println("successfully clicked on cancel button");
	}
	else
	{
		System.out.println("not clicked");
	}
	
}
}