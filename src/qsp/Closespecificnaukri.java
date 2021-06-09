package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closespecificnaukri {

		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) {
			System.out.println("enter the title which u want to close");
			Scanner sc=new Scanner(System.in);
			String ExpectedTitle=sc.nextLine();
			WebDriver Driver=new ChromeDriver();
			Driver.get("https://www.naukri.com/");
			Set<String> all = Driver.getWindowHandles();
			for(String ob:all)
			{
				Driver.switchTo().window(ob);
				String ActualTitle = Driver.getTitle();
				if( ActualTitle.equals( ExpectedTitle))
				{
					Driver.close();
				}
				}
			}
			

}
