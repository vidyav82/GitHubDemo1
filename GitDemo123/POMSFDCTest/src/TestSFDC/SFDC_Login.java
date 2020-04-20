package TestSFDC;
import java.awt.Robot;

import java.awt.AWTException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.support.PageFactory;

import PageFactory.PageObjectsAccountsPage;
import PageFactory.PageObjectsHomePage;
import PageFactory.PageObjectsLogin;
import PageFactory.PageObjectsMyProfile;
import PageFactory.PageObjectsMySetting;

public class SFDC_Login extends Reusable{

	PageObjectsLogin loginpage;
	PageObjectsHomePage homepage;
	PageObjectsMyProfile myprofilepage;
	PageObjectsMySetting mysettingpage;
	PageObjectsAccountsPage accountspage;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void Initialize(String Browser) {
		
		if(Browser.equalsIgnoreCase("firefox")) {
			InitializeFireFoxDriver();
			ImplicitWait(30);
		}
		else if(Browser.equalsIgnoreCase("chrome")) {
			InitializeChromeDriver();
			ImplicitWait(30);
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			InitializeEdgeDriver();
			ImplicitWait(30);
		}
		
		loginpage = PageFactory.initElements(driver,PageObjectsLogin.class);
		homepage = PageFactory.initElements(driver,PageObjectsHomePage.class);
		myprofilepage = PageFactory.initElements(driver,PageObjectsMyProfile.class);
		mysettingpage = PageFactory.initElements(driver,PageObjectsMySetting.class);
		accountspage = PageFactory.initElements(driver,PageObjectsAccountsPage.class);
		
		CreateReport();
	}
	
	@AfterMethod
	public void Close() {
		//CloseBrowser();
		CloseReport();
		
	}
	
	@Test(enabled=false)
	public void A_LoginErrorMessage() throws InterruptedException {
				
		logger = report.startTest("A_LoginErrorMessage");
	
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
				
		loginpage.ClearPwdText();
		
		loginpage.ClickLoginButton();
		
		Verify_VisibleText(loginpage.ErrMsg(),"Please enter your password.","Verify ErrorMessage");
		Thread.sleep(5000);
		
	}
	
	@Test(enabled=false)
	public void B_LogintoSFDC() throws InterruptedException {
	
				
		logger = report.startTest("B_LogintoSFDC");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
				
		loginpage.EnterUID("test@tekarch.com", "Username");
				
		loginpage.EnterPwd("B@ngalore123", "Password");
				
		loginpage.ClickLoginButton();
		
		Thread.sleep(10000);
		
		String ActTitle = homepage.getHomePageTitle();
		String ExpTitle = "Home Page ~ Salesforce - Developer Edition";
		VerifyTitleMatches(ActTitle,ExpTitle,"Home page");
		Thread.sleep(5000);
	}
	
	@Test(enabled=false)
	public void C_CheckRemeberMe() throws InterruptedException {
	
			
		logger = report.startTest("C_CheckRemeberMe");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
		
		loginpage.clickremmecheckbox();
		
		loginpage.ClickLoginButton();
		
		Thread.sleep(10000);
		
		homepage.clickUserPic();
		Thread.sleep(3000);
		
		homepage.clickLogout();
		Thread.sleep(8000);
			
		loginpage.verifyVisibleTextUsername("test@tekarch.com","Saving the User Name.");
		Thread.sleep(5000);
		
		}

	@Test(enabled=false)
	public void D_ForgotPassword_4A() throws InterruptedException {
	
				
		logger = report.startTest("D_ForgotPassword_4A");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
				
		loginpage.ClickForgotPWd();
		
		Thread.sleep(2000);
		
		String ActTitle = loginpage.getLoginpageTitle();
		String ExpTitle = "Forgot Your Password | Salesforce";
		VerifyTitleMatches(ActTitle,ExpTitle,"Forgot Password page");
			
		loginpage.EnterforgotPwduid("test@tekarch.com", "ForgotPasswordUserid");
		
		loginpage.ClickContinue();
				
		Thread.sleep(2000);
		WebElement checkmail = driver.findElement(By.id("header"));
		
		loginpage.verifyVisibleTextCheckMail("Check Your Email", "Check you Email page");
		Thread.sleep(5000);		
	}

	
	@Test(enabled=false)
	public void D_ForgotPassword_4B() throws InterruptedException {
	
		logger = report.startTest("D_ForgotPassword_4B");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("1234", "username");
		
		loginpage.EnterPwd("1123567", "password");
				
		loginpage.ClickLoginButton();
		Thread.sleep(4000);		
		
		loginpage.verifyErrorMsg("Please check your username and password. If you still can't log in, contact your Salesforce administrator.", " message for wrong user id");
		Thread.sleep(5000);
		
	}
	
	@Test(enabled=false)
	public void E_Tc06() throws InterruptedException {
	
	
		logger = report.startTest("E_Tc06");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
				
		loginpage.ClickLoginButton();
		Thread.sleep(10000);
		
		homepage.clickUserPic();
		
		homepage.clickMyProfileLink();
		Thread.sleep(8000);
		
		//myprofilepage.uploadLinkIsDisplayed();
		
		myprofilepage.clickEditLink();
		Thread.sleep(2000);
		
		myprofilepage.verifyEditPageHeading();
		
		SwitchFrame("contactInfoContentId");
				
		myprofilepage.clickAboutTab();
		
		myprofilepage.enterLastName();
		
		myprofilepage.contactTabisEnabled();
		
		myprofilepage.clickSaveAll();
		
		myprofilepage.clickpostLink();
	
		myprofilepage.switchTohtmlBody();
		
		myprofilepage.enterTextHtmlBody("Testing is in progress.");
		
		Thread.sleep(2000);
		SwitchFrame();
		
		myprofilepage.clickShare();	
			
		Thread.sleep(2000);
		
		myprofilepage.checktextentered("Testing is in progress.");
				
	
	}
	
	@Test(enabled=true)
	public void F_Tc07() throws InterruptedException {
	
		
		logger = report.startTest("F_Tc07");
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
				
		loginpage.ClickLoginButton();
		Thread.sleep(8000);
		
		homepage.clickUserPic();
		Thread.sleep(2000);
		
		homepage.clickMySettings();
		Thread.sleep(6000);
		
		mysettingpage.mySettingsisDisplayed();
				
		mysettingpage.clickPersonalInfo();
		Thread.sleep(5000);
		
		mysettingpage.clickLoginHis();
		
		mysettingpage.loginHisisDisplayed();
		
		mysettingpage.clickDisplayLink();
		Thread.sleep(5000);
		
		mysettingpage.clickCustomizeTab();
		Thread.sleep(5000);
		
		mysettingpage.clickCustDrop();
		Thread.sleep(5000);
		
		mysettingpage.clickReports();
		
		mysettingpage.clickAdd();
				
		WebElement option = mysettingpage.selectValue("report");
		
		mysettingpage.checkoptionSelected(option,"Reports");
				
		mysettingpage.clickSave();
		
		mysettingpage.clickEmail();
		
		mysettingpage.clickEmailset();
		
		mysettingpage.entertextSendername("Vidya Venkatesh12");
		
		mysettingpage.entertextSenderemail("vidyav82@gmail.com");
				
		mysettingpage.clickRadio();
				
		mysettingpage.clickSave();
		Thread.sleep(2000);
		
		mysettingpage.verifymessage("Your settings have been successfully saved.");
		
		mysettingpage.verifysenderval("Vidya Venkatesh12");
		
		mysettingpage.verifysendermailval("vidyav82@gmail.com");
		
		mysettingpage.clickCalendar();
		
		mysettingpage.clickActRem();
		
		mysettingpage.clickOpenRem();
		
		Thread.sleep(3000);
		
		String oldwin = driver.getWindowHandle();
		Set<String> getallwin = driver.getWindowHandles();
		String[] getwin = getallwin.toArray(new String[getallwin.size()]);
		driver.switchTo().window(getwin[1]);
				
		String exptdurl = "https://na174.salesforce.com/ui/core/activity/ActivityReminderPage?at=1581875196537&test=1";
		verifyUrlMatches(exptdurl);				
				
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(oldwin);
		
	}	
	
	@Test(enabled=true)
	public void G_Tc08() throws InterruptedException {
			
		logger = report.startTest("G_Tc08");
	
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
				
		loginpage.ClickLoginButton();
		Thread.sleep(8000);
		
		homepage.clickUserPic();
		Thread.sleep(2000);
				
		homepage.verifyMyProfilelinkdisplayed();
		
		homepage.verifyMySettinglinkdisplayed();
		
		homepage.verifystchLitlinkdisplayed();
		
		homepage.verifyLogoutlinkdisplayed();
		
		homepage.clickDevCon();		
		
		SwitchToWin("Developer Console");
		
		SwitchFrameQuit("Developer Console");
						
	}
	
	@Test(enabled=true)
	public void H_Tc09() throws InterruptedException {
		
		
		logger = report.startTest("H_Tc09");
		
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
		
		loginpage.clickremmecheckbox();
		
		loginpage.ClickLoginButton();
		
		Thread.sleep(10000);
		
		homepage.clickUserPic();
		Thread.sleep(3000);
		
		homepage.clickLogout();
		Thread.sleep(5000);
				
		loginpage.verifyusernamedisplayed();
		
	}
	
	
	@Test(enabled=true)
	public void I_TC10CreateAccount() throws InterruptedException, AWTException {
			
		logger = report.startTest("I_TC10CreateAccount");
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		loginpage.EnterUID("test@tekarch.com", "Username");
		
		loginpage.EnterPwd("B@ngalore123", "Password");
		
		loginpage.clickremmecheckbox();
		
		loginpage.ClickLoginButton();
		Thread.sleep(10000);
		
		homepage.clickShowAll();
		Thread.sleep(6000);
		
		homepage.clickAccounts();
				
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		
		accountspage.verifyusername("Vidya Venkatesh1");
		
		accountspage.clickNewAccount();
		
		String pagetitle = driver.getTitle();
		String actualTitle = "Account Edit: New Account ~ Salesforce - Developer Edition";
		
		VerifyTitleMatches(pagetitle,actualTitle,"NewAccountPage");
		
		accountspage.enterNewAccountname("New12 Test12");
	
		accountspage.selectaccntType("Technology Partner");
		
		accountspage.selectPriority("High");
		
		accountspage.clickSave();
		
		accountspage.verifysavedname("New12 Test12");
		
		}
}
