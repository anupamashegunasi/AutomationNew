package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closeallwithoutquit 
{

static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Set<String> all = driver.getWindowHandles();
	int count=all.size();
	System.out.println(count);
	for(String ob:all)
	{
		driver.switchTo().window(ob);
		
	}
	driver.close();
	
}
}




