import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.support.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test123<SelectElement> {

@Test
public void Testfields() throws InterruptedException{
	
//	ExtentTest logger;
//	ExtentReports report;
//	
	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
	
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	
	WebElement uid = driver.findElement(By.id("username"));
	uid.sendKeys("test@tekarch.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("B@ngalore123");
	
	WebElement LoginButn = driver.findElement(By.id("Login"));
	LoginButn.click();
	Thread.sleep(6000);
	

	WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
	UsrPro.click();
	
	WebElement myproflnk = driver.findElement(By.linkText("My Profile"));
	myproflnk.click();
	
	Thread.sleep(10000);
		
			
	driver.switchTo().frame(0);
	
	Thread.sleep(3000);
	//WebElement htmlbody = driver.findElement(By.cssSelector("body.chatterPublisherRTE.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders:nth-child(2)"));
	//driver.switchTo().frame(htmlbody);
	WebElement htmlbody = driver.findElement(By.cssSelector("html"));
	driver.switchTo().frame(htmlbody);
	WebElement textspace = driver.findElement(By.cssSelector("body"));
	textspace.click();
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver; 
	js.executeScript("arguments[0].setAttribute('value',arguments[1]);",textspace,"Testing is in progress."); 
	
	Thread.sleep(2000);
	//htmlbody.sendKeys("Testing is in progress.");
	
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	
	WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	share.click();
}
}