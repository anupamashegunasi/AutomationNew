package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorAndFontsize
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		String color=Driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		 String Fontsize=Driver.findElement(By.linkText("Forgotten password?")).getCssValue("font_size");
		 System.out.println(color);
		 System.out.println(Fontsize);
		 Driver.close();
	}
	

}
