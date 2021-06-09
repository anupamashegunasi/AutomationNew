package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox4 {



	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("file:///C:/Users/Vedavati/Desktop/Hotel.html");
		WebElement Checkpostlistbox=Driver.findElement(By.id("cp"));
		Select s=new Select(Checkpostlistbox);
		List<WebElement>Alloptions=s.getOptions();
		for(int i=0;i<Alloptions.size();i++)
		{
			String text=Alloptions.get(i).getText();
			System.out.println(text);
		}
		Driver.close();
	}
}
		
