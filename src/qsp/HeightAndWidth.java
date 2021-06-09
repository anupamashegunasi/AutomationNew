package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightAndWidth {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		WebElement EmailTbx=Driver.findElement(By.id("email"));
		int height=EmailTbx.getSize().getHeight();
		int width=EmailTbx.getSize().getWidth();
		System.out.println("height="+height);
		System.out.println("width="+width);
		Driver.close();
	}

}
