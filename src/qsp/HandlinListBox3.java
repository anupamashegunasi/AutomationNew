package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlinListBox3 {



	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("file:///C:/Users/Vedavati/Desktop/Hotel.html");
		WebElement SLVListBox=Driver.findElement(By.id("slv"));
		Select s=new Select(SLVListBox);
		List<WebElement> AllOption = s.getAllSelectedOptions();
		for(WebElement option :AllOption)
		{
			String text=option.getText();
			System.out.println(text);
		}
		Driver.close();
	}

}
