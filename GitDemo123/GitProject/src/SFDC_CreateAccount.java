import java.awt.Robot;
import java.awt.AWTException;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.support.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;

public class SFDC_CreateAccount extends Reusable {
	
	@Test
	public void I_TC10CreateAccount() throws InterruptedException, AWTException {
	
		InitializeFireFoxDriver();
		CreateReport();
		
		logger = report.startTest("I_TC10CreateAccount");
		
		Loginsalesforce();
		
		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
		Click(showAll, "Show All");
		Thread.sleep(6000);
		
		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
		Click(Accounts, "Accounts");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
				
		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'Vidya Venkatesh1')]"));
		Verify_VisibleText(usrname,"Vidya Venkatesh1", "Correct user name");
		
		
		WebElement NewAcnt = driver.findElement(By.xpath("//input[@name='new']"));
		Click(NewAcnt, "NewAccount");
				
		String pagetitle = driver.getTitle();
		String actualTitle = "Account Edit: New Account ~ Salesforce - Developer Edition";
		
		VerifyTitleMatches(pagetitle,actualTitle,"new Account page");
		
		WebElement newActname = driver.findElement(By.xpath("//input[@id='acc2']"));
		EnterText(newActname, "New12 Tester12", "New Account name");
		
		
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		SelectByValue(type,"Technology Partner");
		
		
		WebElement priority = driver.findElement(By.xpath("//select[@id='00N6g00000MRGwj']"));
		SelectByValue(priority,"High");
		
		
		WebElement saveBut = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		Click(saveBut, "Save Button");
		
		
		WebElement savdname = driver.findElement(By.xpath("//h2[@class='topName']"));
		Verify_VisibleText(savdname,"New12 Tester12", "new Account functionality and saved the details");
		
		CloseReport();
		CloseBrowser();
		}
	

}
