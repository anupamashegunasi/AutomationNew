package qsp;

import org.openqa.selenium.WebDriver;

public class DemoA {

	
	static void testA(WebDriver driver) {
			driver.get("http://www.facebook.com/");
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();
			
		


	}

}




