package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class March24 {
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(1000);
	Robot r=new Robot();
r.keyPress(KeyEvent.VK_LEFT);
Thread.sleep(1000);
	 r.keyPress(KeyEvent.VK_ENTER);   
	 r.keyRelease(KeyEvent.VK_ENTER);

}
}
 