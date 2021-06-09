package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Marcha1 {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver Driver=new ChromeDriver();
			Driver.manage().window().maximize();
			Driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			Driver.findElement(By.xpath("//button[@aclass='btn-default btn_lg")).click();
			Driver.switchTo().alert().dismiss();
			Thread.sleep(5000);
			boolean text=Driver.findElement(By.id("confirm_demo")).isDisplayed();
			if(text==true)
			{
				System.out.println("sucessfully clicked on cancel button");
			}
			else
			{
				System.out.println("not clicked");
			}
			
			}
			}
		