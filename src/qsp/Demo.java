package qsp;


import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com/");
		Driver.close();
		

	}

}
