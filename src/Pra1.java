import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pra1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(" file:///C:/Users/Vedavati/Desktop/demo.html");
		driver.findElement(By.xpath("//a[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[2]")).click();
		
		
		
		
		
	
	}
}