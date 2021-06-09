package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsuranceHiddenDivision {
	static
	{
		
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver Driver=new ChromeDriver();
			Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Driver.get("http://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		
			Driver.findElement(By.id("policynumber")).sendKeys("123");
			Driver.findElement(By.id("dob")).click();
			WebElement month=Driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
			Select s=new Select(month);
			s.selectByIndex(8);
			WebElement year=Driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
			
			Select s1=new Select(year);
			s1.selectByVisibleText("1996");
		
			Driver.findElement(By.linkText("29")).click();
			Driver.findElement(By.id("alternative_number")).sendKeys("8073904506");
	
			Driver.findElement(By.id("renew_policy_submit")).click();
			Thread.sleep(2000);
			Driver.close();
		}
}

			
			
