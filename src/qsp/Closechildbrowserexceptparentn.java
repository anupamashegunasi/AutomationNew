package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closechildbrowserexceptparentn {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String pt=driver.getTitle();
		Set<String> Allwh = driver.getWindowHandles();
		for(String wh:Allwh)
		{
			driver.switchTo().window(wh);
			String ct=driver.getTitle();
			if(!pt.equals(ct))
			{
				driver.close();
			}

		}

}
}
