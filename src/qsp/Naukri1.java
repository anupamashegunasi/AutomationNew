package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("//div[text()='Login']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='text'])")).sendKeys("anupamashegunasi2@gmail.com");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9902534138@naukri.com");
driver.findElement(By.xpath("//button[text()='Login']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//div[@class='user-name roboto-bold-text']")).click();

File f=new File("./data/Resume.docx");

String Absolutepath=f.getAbsolutePath();
driver.findElement(By.id("attachCV")).sendKeys(Absolutepath);
System.out.println("file uploaded successfully");
driver.close();
}
}