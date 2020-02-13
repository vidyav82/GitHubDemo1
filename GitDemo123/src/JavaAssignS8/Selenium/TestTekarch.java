package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTekarch {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://qa-tekarch.firebaseapp.com");
		Thread.sleep(2000);
		
		WebElement id = driver.findElement(By.id("email_field"));
		id.sendKeys("admin123@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password_field"));
		pwd.sendKeys("admin123");
		
		WebElement loginButn = driver.findElement(By.xpath("//*[@id=\"login_div\"]/button"));
		loginButn.click();
		Thread.sleep(2000);
		
		WebElement hometab = driver.findElement(By.xpath("//*[@id=\"user_div\"]/div/a[1]"));
		hometab.click();
		
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Vidya");
		
		WebElement fathername = driver.findElement(By.id("lname"));
		fathername.sendKeys("Venkatesh");
		
		WebElement postalAdd = driver.findElement(By.id("postaladdress"));
		postalAdd.sendKeys("190 Lexington Drive, CA");
		
		WebElement personalAdd = driver.findElement(By.id("personaladdress"));
		personalAdd.sendKeys("190 Lexington Drive, CA");
		
		java.util.List<WebElement> Radiobutton = driver.findElements(By.className("w3-radio"));
		Radiobutton.get(1).click();
		
		WebElement City = driver.findElement(By.id("city"));
		new Select(City).selectByValue("goa");
		
		WebElement Course = driver.findElement(By.id("course"));
		new Select(Course).selectByValue("btech");
		
		WebElement District = driver.findElement(By.id("district"));
		new Select(District).selectByValue("goa");
		
		WebElement State = driver.findElement(By.id("state"));
		new Select(State).selectByValue("mca");
		
		WebElement pin = driver.findElement(By.id("pincode"));
		pin.sendKeys("560078");
		
		WebElement eid = driver.findElement(By.id("emailid"));
		eid.sendKeys("vidya@gmail.com");
		
		WebElement submit = driver.findElement(By.className("bootbutton"));
		submit.click();

		//Select City = new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
 		//City.selectByValue("GOA");
		
		
		Thread.sleep(2000);
		//driver.quit();

	}

}
