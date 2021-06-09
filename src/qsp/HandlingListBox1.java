package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox1 {
	
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			WebDriver Driver=new ChromeDriver();
			Driver.get("file:///C:/Users/Vedavati/Desktop/Hotel.html");
				
			WebElement CheckPostListbox=Driver.findElement(By.id("cp"));
			Select s=new Select(CheckPostListbox);
			s.selectByIndex(0);
			s.selectByValue("v");
			s.selectByVisibleText("dosa");
			if(s.isMultiple()==true)
			{
				s.deselectByIndex(2);
				s.deselectByVisibleText("vada");
				s.deselectByValue("i");
			}
		}
			}


