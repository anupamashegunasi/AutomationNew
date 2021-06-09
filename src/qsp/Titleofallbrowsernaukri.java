package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleofallbrowsernaukri {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> all = driver.getWindowHandles();
	for(String ob:all)
	{
		driver.switchTo().window(ob);
		String title = driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
	
}
}

