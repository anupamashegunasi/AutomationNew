package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Numbrowseropen {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args)
{
WebDriver driver = new ChromeDriver();
driver.get("https://www.naukri.com/");
Set<String> browser = driver.getWindowHandles();
int count=browser.size();
System.out.println(count);
driver.quit();
}


}
