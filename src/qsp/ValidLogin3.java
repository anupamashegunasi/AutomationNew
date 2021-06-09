package qsp;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLogin3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://demo.actitime.com/");
		Driver.findElement(By.id("username")).sendKeys("admin");
		
		Driver.findElement(By.name("pwd")).sendKeys("manager");
		Driver.findElement(By.xpath("//div[text()='Login ']")).click();
		int i=0;
		while(i<=1000)
		{
			try
			{
				Driver.findElement(By.id("Logout")).click();
				break;
				}
			catch(NoSuchElementException e)
			{
				i++;
			}
		}
				Driver.close();
			}
		}
			
				
			
	