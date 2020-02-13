package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSalesForceLoginChrome {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://developer.salesforce.com/");
		Thread.sleep(4000);
		
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		LoginBtn.click();
		
		Thread.sleep(2000);
		
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys("test@tekarch.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("B@ngalore123");
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		LoginButn.click();
		
		Thread.sleep(2000);
	}

}
