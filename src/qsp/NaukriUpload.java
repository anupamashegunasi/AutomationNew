package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriUpload {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/nlogin/login");
		Thread.sleep(2000);
		driver.findElement(By.id("usernameField")).sendKeys("anupamashegunasi2@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwordField")).sendKeys("9902534138@naukri.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();

		driver.findElement(By.xpath("//div[.='Anupama")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Attach Resume']")).click();
		Thread.sleep(2000);
		File f=new File("./Data/resume.docx");
		Thread.sleep(2000);
		String Absolutepath=f.getAbsolutePath();
		Thread.sleep(2000);
		driver.findElement(By.xpath("attachCV")).sendKeys(Absolutepath);
		Thread.sleep(3000);
		driver.close();

}
}
