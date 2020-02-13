package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSalesForceLoginFirefox {
	

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(4000);
				
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys("test@tekarch.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("B@ngalore123");
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		LoginButn.click();
		
		WebElement Home = driver.findElement(By.className("breadcrumbDetail uiOutputText"));
		if(Home.isDisplayed())
		{
			System.out.println("Login Success");
		}
		
		Thread.sleep(2000);
		driver.quit();
		
		}

		}
