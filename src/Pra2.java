import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("http://www.google.com/");
		//driver.get("http://gmail.com/");
		//driver.get("http://facebook.com");
		//driver.navigate().back();
		//Thread.sleep(1000);
		//driver.navigate().back();
		//Thread.sleep(1000);
		//driver.navigate().forward();
		//Thread.sleep(1000);
		driver.get("http://www.naukri.com/");
		Thread.sleep(5000);
		//String text = driver.getCurrentUrl();
		//System.out.println(text);
		//String Source = driver.getPageSource();
		//System.out.println(Source);
		String text1 = driver.getTitle();
		System.out.println(text1);
		//driver.close();
		driver.quit();
	}

}

