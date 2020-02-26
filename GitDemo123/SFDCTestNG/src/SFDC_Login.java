import java.awt.Robot;
import java.awt.AWTException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.openqa.selenium.support.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;



public class SFDC_Login extends Reusable{
	
	@Test
	public void A_LoginErrorMessage() throws InterruptedException {
		
		
		InitializeFireFoxDriver();
		CreateReport();
		
		logger = report.startTest("A_LoginErrorMessage");
	
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		WebElement uid = driver.findElement(By.id("username"));
		EnterText(uid, "test@tekarch.com", "Username");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		Click(LoginButn,"Login Button");
		
		WebElement ErrorMsg = driver.findElement(By.id("error"));
		Verify_VisibleText(ErrorMsg,"Please enter your password.","Verify ErrorMessage");
		
		CloseBrowser();
		CloseReport();
		
	}
	
//	@Test
//	public void B_LogintoSFDC() throws InterruptedException {
//	
//		InitializeFireFoxDriver();
//		CreateReport();
//		
//		logger = report.startTest("B_LogintoSFDC");
//		
//		OpenUrl("https://login.salesforce.com");
//		Thread.sleep(7000);
//		logger.log(LogStatus.INFO, "URL opened successfully");
//		
//		WebElement uid = driver.findElement(By.id("username"));
//		EnterText(uid, "test@tekarch.com", "Username");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		EnterText(pwd, "B@ngalore123", "Password");
//				
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		Click(LoginButn,"Login Button");
//		Thread.sleep(10000);
//		
//		String ActTitle = driver.getTitle();
//		String ExpTitle = "Home Page ~ Salesforce - Developer Edition";
//		VerifyTitleMatches(ActTitle,ExpTitle,"Home page");
//		
//		CloseBrowser();
//		CloseReport();
//	}
//	
//	@Test
//	public void C_CheckRemeberMe() throws InterruptedException {
//	
//		
//		InitializeFireFoxDriver();
//		CreateReport();
//		
//		logger = report.startTest("C_CheckRemeberMe");
//		
//		OpenUrl("https://login.salesforce.com");
//		Thread.sleep(7000);
//		logger.log(LogStatus.INFO, "URL opened successfully");
//		
//		WebElement uid = driver.findElement(By.id("username"));
//		EnterText(uid, "test@tekarch.com", "Username");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		EnterText(pwd, "B@ngalore123", "Password");
//				
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		Click(LoginButn,"Login Button");
//		Thread.sleep(10000);
//				
//		WebElement UsrPic = driver.findElement(By.id("userNavLabel"));
//		Click(UsrPic,"UserNavigationLink");
//		Thread.sleep(3000);
//		
//		
//		WebElement logout = driver.findElement(By.linkText("Logout"));
//		Click(logout,"Logout");
//		Thread.sleep(8000);
//		
//		WebElement usrname = driver.findElement(By.id("idcard-identity"));
//		Verify_VisibleText(usrname,"test@tekarch.com","Saving the User Name.");
//		
//		
//		CloseBrowser();
//		CloseReport();
//		
//		}
//
//	@Test
//	public void D_ForgotPassword_4A() throws InterruptedException {
//	
//		InitializeChromeDriver();
//		
//		CreateReport();
//		
//		logger = report.startTest("D_ForgotPassword_4A");
//		
//		OpenUrl("https://login.salesforce.com");
//		Thread.sleep(7000);
//		logger.log(LogStatus.INFO, "URL opened successfully");
//		
//		WebElement forgotpwd = driver.findElement(By.id("forgot_password_link"));
//		Click(forgotpwd,"Forgot Password Link");
//		
//		
//		Thread.sleep(2000);
//		
//		String ActTitle = driver.getTitle();
//		String ExpTitle = "Forgot Your Password | Salesforce";
//		VerifyTitleMatches(ActTitle,ExpTitle,"Forgot Password page");
//		
//		
//		WebElement forgotpageuid = driver.findElement(By.id("un"));
//		EnterText(forgotpageuid, "test@tekarch.com", "ForgotPasswordUserid");	
//		
//		WebElement conti = driver.findElement(By.id("continue"));
//		Click(conti,"Continue");
//				
//		Thread.sleep(2000);
//		WebElement checkmail = driver.findElement(By.id("header"));
//				
//		Verify_VisibleText(checkmail,"Check Your Email", "Check you Email page");
//				
//		
//		CloseBrowser();
//		CloseReport();
//	}

	
	@Test
	public void D_ForgotPassword_4B() throws InterruptedException {
	

		InitializeChromeDriver();
		
		CreateReport();
		
		logger = report.startTest("D_ForgotPassword_4B");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		WebElement uid = driver.findElement(By.id("username"));
		EnterText(uid, "1234", "username");
				
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "1123567", "password");
		
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		Click(LoginButn,"Login Button");
		
		
		WebElement errormsg = driver.findElement(By.id("error"));
		Verify_VisibleText(errormsg,"Please check your username and password. If you still can't log in, contact your Salesforce administrator.", " message for wrong user id");
		
				
		CloseBrowser();
		CloseReport();
		
	}
}
