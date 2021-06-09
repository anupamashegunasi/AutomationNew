package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		Driver.findElement(By.xpath("//body[@dir='ltr']")).click();
		int female=Driver.findElement(By.className("_58mt")).getLocation().getY();
		int male=Driver.findElement(By.xpath("//label[text()='Male']")).getLocation().getY();
		int custom=Driver.findElement(By.xpath("//label[text()='Custom']")).getLocation().getY();
		if(female==male && male==custom)
		{
			System.out.println("properly alligned");
		}
		else
		{
			System.out.println("not alligned properly");
		}
		
		}
}
