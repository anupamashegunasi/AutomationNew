package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColourAndFontSize1 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		WebElement ForgotLink=Driver.findElement(By.linkText("Forgotten password?"));
		String color=ForgotLink.getCssValue("color");
		String FontSize=ForgotLink.getCssValue("font_size");
		String FontType=ForgotLink.getCssValue("font_family");
		System.out.println(color);
		System.out.println(FontSize);
		System.out.println(FontType);
		Driver.close();
	}
	
		
		
}
