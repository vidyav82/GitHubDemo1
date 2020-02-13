package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSalesForceLoginIE {

public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
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
