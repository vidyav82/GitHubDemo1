import java.awt.Robot;
import java.awt.AWTException;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
import okhttp3.internal.http2.Header;

public class SDFCTestCases<SelectElement> {
	
//@Test
//public void A_LoginErrorMessage() throws InterruptedException {
//
//	ExtentTest logger;
//	ExtentReports report;
//	WebDriver driver;
//
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
//	
//	String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//	String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//	report = new ExtentReports(path);
//	logger = report.startTest("A_LoginErrorMessage");
//	
//	driver.get("https://login.salesforce.com/");
//	Thread.sleep(2000);
//	
//	WebElement uid = driver.findElement(By.id("username"));
//	uid.sendKeys("test@tekarch.com");
//	
//	WebElement pwd = driver.findElement(By.id("password"));
//	pwd.clear();
//	
//	WebElement LoginButn = driver.findElement(By.id("Login"));
//	LoginButn.click();
//	
//	WebElement ErrorMsg = driver.findElement(By.id("error"));
//	String Msg = ErrorMsg.getText();
//	
//	if(Msg.equals("Please enter your password."))
//	{
//		logger.log(LogStatus.PASS,"The Error message is displayed correctly.");
//	}
//	else
//	{
//		logger.log(LogStatus.FAIL,"The Error message  is not displayed correctly.");
//	}
//	
//	
//	report.flush();
//	driver.quit();
//}
//
//@Test
//public void B_LogintoSFDC() throws InterruptedException {
//
//	ExtentTest logger;
//	ExtentReports report;
//	
//	WebDriver driver;
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
//	
//	String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//	String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//	report = new ExtentReports(path);
//	logger = report.startTest("B_LogintoSFDC");
//	
//	driver.get("https://login.salesforce.com/");
//	Thread.sleep(2000);
//	WebElement uid = driver.findElement(By.id("username"));
//	uid.sendKeys("test@tekarch.com");
//	
//	WebElement pwd = driver.findElement(By.id("password"));
//	pwd.sendKeys("B@ngalore123");
//	
//	WebElement LoginButn = driver.findElement(By.id("Login"));
//	LoginButn.click();
//	Thread.sleep(50000);
//	
//	driver.getTitle();
//	
//	WebElement Hometab = driver.findElement(By.id("home_Tab"));
//	
//	
//	if(Hometab.isDisplayed())
//	{
//		logger.log(LogStatus.PASS,"Passed: The Home page is loaded correctly.");
//	}
//	else
//	{
//		logger.log(LogStatus.FAIL,"Failed: Home page is not loaded correctly.");
//	}
//	
//	report.flush();
//	driver.quit();
//}
//
//@Test
//public void C_CheckRemeberMe() throws InterruptedException {
//
//	ExtentTest logger;
//	ExtentReports report;
//	
//	WebDriver driver;
//	WebDriverManager.firefoxdriver().setup();
//	
//	driver = new FirefoxDriver();
//	
//	String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//	String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//	report = new ExtentReports(path);
//	logger = report.startTest("C_CheckRemeberMe");
//	
//	driver.get("https://login.salesforce.com/");
//	Thread.sleep(2000);
//	WebElement uid = driver.findElement(By.id("username"));
//	uid.sendKeys("test@tekarch.com");
//	
//	WebElement pwd = driver.findElement(By.id("password"));
//	pwd.sendKeys("B@ngalore123");
//	
//	WebElement Remme = driver.findElement(By.id("rememberUn"));
//	Remme.click();
//	
//	WebElement LoginButn = driver.findElement(By.id("Login"));
//	LoginButn.click();
//	Thread.sleep(5000);
//	
//	WebElement UsrPic = driver.findElement(By.id("userNavLabel"));
//	UsrPic.click();
//	
//	
//	WebElement logout = driver.findElement(By.linkText("Logout"));
//	logout.click();
//	Thread.sleep(2000);
//	
//	WebElement usrname = driver.findElement(By.id("idcard-identity"));
//	String Usrid = usrname.getText();
//	
//	if(Usrid.equals("test@tekarch.com"))
//	{
//		logger.log(LogStatus.PASS,"Passed: The user name is saved.");
//	}
//	else
//	{
//		logger.log(LogStatus.FAIL,"Failed: The User name is not saved.");
//	}
//	
//	report.flush();
//	driver.quit();
//	}
//
//	@Test
//	public void D_ForgotPassword_4A() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("D_ForgotPassword_4A");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		
//		WebElement forgotpwd = driver.findElement(By.id("forgot_password_link"));
//		forgotpwd.click();
//		
//		Thread.sleep(2000);
//		String pagetitle = driver.getTitle();
//		if(pagetitle.equals("Forgot Your Password | Salesforce"))
//			logger.log(LogStatus.PASS,"The Forgot Password page is displayed");
//		else
//			logger.log(LogStatus.FAIL,"The Forgot Password page is not displayed");
//		
//		WebElement forgotpageuid = driver.findElement(By.id("un"));
//		forgotpageuid.sendKeys("test@tekarch.com");
//		
//		WebElement conti = driver.findElement(By.id("continue"));
//		conti.click();
//		
//		Thread.sleep(2000);
//		WebElement checkmail = driver.findElement(By.id("header"));
//		String retntxt = checkmail.getText();
//		
//		if(retntxt.equals("Check Your Email"))
//			logger.log(LogStatus.PASS,"The Check you Email page is displayed.");
//		else
//			logger.log(LogStatus.FAIL,"The Check your Email page is not displayed.");
//		
//		report.flush();
//		driver.quit();
//	}
//
//	@Test
//	public void D_ForgotPassword_4B() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("D_ForgotPassword_4B");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("1234");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("1123567");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		
//		WebElement errormsg = driver.findElement(By.id("error"));
//		String errmsg = errormsg.getText();
//		String actualmsg = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
//		if (errmsg.equals(actualmsg))
//			logger.log(LogStatus.PASS,"The error message displayed is correct.");
//		else
//			logger.log(LogStatus.FAIL,"The error message is not correctly displayed.");
//		
//		report.flush();
//		driver.quit();
//		
//	}
//	
//	@Test
//	public void E_Tc06() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("E_Tc06");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(5000);
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		WebElement myproflnk = driver.findElement(By.linkText("My Profile"));
//		myproflnk.click();
//		Thread.sleep(8000);
//		
//		WebElement upldlnk = driver.findElement(By.id("uploadLink"));
//		
//		
//		if(upldlnk.isDisplayed())
//			logger.log(LogStatus.PASS,"User Profile Page exists.");
//		else
//			logger.log(LogStatus.FAIL,"User profile page does not exists.");
//		
//		WebElement editlnk = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a"));
//		editlnk.click();
//		Thread.sleep(2000);
//		
//		
//		WebElement edtpage = driver.findElement(By.id("contactInfoTitle"));
//		
//		if(edtpage.getText().equals("Edit Profile"))
//			logger.log(LogStatus.PASS,"Edit Profile page is displayed.");
//		else
//			logger.log(LogStatus.FAIL,"Edit profile page is not displayed.");
//		
//		driver.switchTo().frame("contactInfoContentId");
//		
//		
//		WebElement abouttab = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
//		abouttab.click();
//		
//		WebElement lastName = driver.findElement(By.id("lastName"));
//		lastName.clear();
//		lastName.sendKeys("Venkatesh1");
//		
//		WebElement contab = driver.findElement(By.xpath("//*[@id=\"contactTab\"]/a"));
//		if (contab.isEnabled())
//			logger.log(LogStatus.PASS,"Contact tab Exists.");
//		else
//			logger.log(LogStatus.FAIL,"Contact tab does not exists.");
//		
//		WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
//		saveall.click();
//		
//		WebElement postlink = driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
//		postlink.click();
//	
//		WebElement htmlbody = driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
//		driver.switchTo().frame(htmlbody);
//		WebElement textspace = driver.findElement(By.xpath("/html/body"));
//		textspace.click();
//		textspace.sendKeys("Testing is in progress.");
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
//		share.click();	
	
	
//		Thread.sleep(2000);
//		WebElement txt = driver.findElement(By.xpath("/html[1]/body[1]/p[1]"));
//		String txtdisp = txt.getText();
//		if(txtdisp.contains("Testing is in progress."))
//			logger.log(LogStatus.PASS,"The entered text is displayed.");
//				else
//			logger.log(LogStatus.FAIL,"The entered text is not displayed.");
//		
//		
//		report.flush();
//		driver.quit();
//	}
//	
//	
//	@Test
//	public void F_Tc07() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("F_Tc07");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(5000);
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		WebElement mySetlnk = driver.findElement(By.linkText("My Settings"));
//		mySetlnk.click();
//		Thread.sleep(6000);
//		
//		WebElement mysetpgelnk = driver.findElement(By.xpath("//*[@id=\"PersonalSetup_font\"]/span[2]"));
//		if (mysetpgelnk.isDisplayed())
//			logger.log(LogStatus.PASS, "My Settings page is displayed.");
//		else
//			logger.log(LogStatus.FAIL,"My Setting page is not displayed.");
//		
//		WebElement perslnk = driver.findElement(By.xpath("//*[@id=\"PersonalInfo_font\"]"));
//		perslnk.click();
//		Thread.sleep(3000);
//		WebElement loginhis = driver.findElement(By.id("LoginHistory_font"));
//		loginhis.click();
//		
//		WebElement lgnhislnk = driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
//		if (lgnhislnk.isDisplayed())
//			logger.log(LogStatus.PASS,"The Login History Link is displayed.");
//		else
//			logger.log(LogStatus.FAIL,"Login History Link is not displayed.");
//		
//		WebElement displaylnk = driver.findElement(By.id("DisplayAndLayout_font"));
//		displaylnk.click();
//		Thread.sleep(3000);
//		WebElement custfnt = driver.findElement(By.id("CustomizeTabs_font"));
//		custfnt.click();
//		Thread.sleep(3000);
//		
//		WebElement custappdrop = driver.findElement(By.xpath("//*[@id=\"p4\"]/option[9]"));
//		custappdrop.click();
//		
//		
//		WebElement reports = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[43]"));
//		reports.click();
//		
//		WebElement add_btn = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
//		add_btn.click();
//		
//		WebElement selectlst = driver.findElement(By.cssSelector("#duel_select_1"));
//		Select lstval = new Select(selectlst);
//		lstval.selectByValue("report");
//		WebElement option = lstval.getFirstSelectedOption();
//		String defaultItem = option.getText();
//		if(defaultItem.equals("Reports"))
//			logger.log(LogStatus.PASS,"The reports is selected.");
//		else
//			logger.log(LogStatus.FAIL,"The reports is not selected.");
//			
//		
//		WebElement savebtn = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
//		savebtn.click();
//		
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]"));
//		email.click();
//		
//		WebElement emailset = driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
//		emailset.click();
//		
//		WebElement sendnme = driver.findElement(By.id("sender_name"));
//		sendnme.clear();
//		sendnme.sendKeys("Vidya Venkatesh12");
//		
//		WebElement sendmail = driver.findElement(By.id("sender_email"));
//		sendmail.clear();
//		sendmail.sendKeys("vidyav82@gmail.com");
//		
//		WebElement radiobtn = driver.findElement(By.id("auto_bcc1"));
//		radiobtn.click();
//		
//		WebElement savebtn1 = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
//		savebtn1.click();
//		Thread.sleep(2000);
//		
//		WebElement msg1 = driver.findElement(By.xpath("//*[@id=\"meSaveCompleteMessage\"]/table/tbody/tr/td[2]/div"));
//		String savmsg1 = msg1.getText();
//		
//		if(savmsg1.equals("Your settings have been successfully saved."))
//			logger.log(LogStatus.PASS,"Settings have saved.");
//		else
//			logger.log(LogStatus.FAIL,"Settings are not saved.");
//		
//		WebElement sendnme1 = driver.findElement(By.id("sender_name"));
//		String savedname = sendnme1.getAttribute("value");
//		
//		if(savedname.equals("Vidya Venkatesh12"))
//			logger.log(LogStatus.PASS,"The sender name is saved successfully.");
//		else
//			logger.log(LogStatus.FAIL,"The sender name is not saved successfully.");
//		
//		WebElement sendmail1 = driver.findElement(By.id("sender_email"));
//		String svedemail = sendmail1.getAttribute("value");
//		if(svedemail.equals("vidyav82@gmail.com"))
//			logger.log(LogStatus.PASS,"The email is saved successfully");
//		else
//			logger.log(LogStatus.FAIL,"The email is not saved properly.");
//		
//		WebElement calendars = driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders_font\"]"));
//		calendars.click();
//		
//		WebElement activityremin = driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]"));
//		activityremin.click();
//		
//		WebElement openrem = driver.findElement(By.xpath("//*[@id=\"testbtn\"]"));
//		openrem.click();
//		
//		Thread.sleep(3000);
//		String oldwin = driver.getWindowHandle();
//		Set<String> getallwin = driver.getWindowHandles();
//		String[] getwin = getallwin.toArray(new String[getallwin.size()]);
//		driver.switchTo().window(getwin[1]);
//		String geturl = driver.getCurrentUrl();
//		String actualurl = "https://na174.salesforce.com/ui/core/activity/ActivityReminderPage?at=1581875196537&test=1";
//						
//		
//		if (geturl.equals(actualurl))
//			logger.log(LogStatus.PASS,"Test Reminder page is displayed.");
//		else
//			logger.log(LogStatus.FAIL,"Test Reminder page is not displayed.");
//		
//		
//		driver.close();
//		Thread.sleep(3000);
//		driver.switchTo().window(oldwin);
//		
//		report.flush();
//		driver.quit();
//	}	
//	
//	@Test
//	public void G_Tc08() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//	
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("G_Tc08");
//	
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(5000);
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		WebElement myprolnk = driver.findElement(By.linkText("My Profile"));
//		if(myprolnk.isDisplayed())
//			
//			logger.log(LogStatus.PASS, "My Profile link is displayed under the User Navigation list.");
//		else
//			logger.log(LogStatus.FAIL, "My Profile link is not displayed under the User Navigation list.");
//		
//		
//		WebElement mySetlnk = driver.findElement(By.linkText("My Settings"));
//		if(mySetlnk.isDisplayed())
//			
//			logger.log(LogStatus.PASS, "My Settings link is displayed under the User Navigation list.");
//		else
//			logger.log(LogStatus.FAIL, "My Settings link is not displayed under the User Navigation list.");
//
//		WebElement devconlnk = driver.findElement(By.linkText("Developer Console"));
//		if(devconlnk.isDisplayed())
//			logger.log(LogStatus.PASS, "Developer Console link is displayed under the User Navigation list.");
//		else
//			logger.log(LogStatus.FAIL, "Developer Console link is not displayed under the User Navigation list.");
//		
//		
//		WebElement swtchlightlnk = driver.findElement(By.linkText("Switch to Lightning Experience"));
//		if(swtchlightlnk.isDisplayed())
//			logger.log(LogStatus.PASS, "Switch to Lightning Experience link is displayed under the User Navigation list.");
//		else
//			logger.log(LogStatus.FAIL, "Switch to Lightning Experience link is not displayed under the User Navigation list.");
//		
//		
//		WebElement logoutlnk = driver.findElement(By.linkText("Logout"));
//		if(logoutlnk.isDisplayed())
//			logger.log(LogStatus.PASS,"Logout link is displayed under the User Navigation list.");
//		else
//			logger.log(LogStatus.FAIL,"Logout link is not displayed under the User Navigation list.");
//			
//		
//		devconlnk.click();
//		driver.switchTo().window("Developer Console");
//		driver.switchTo().frame("Developer Console").quit();
//		
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void H_Tc09() throws InterruptedException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("H_Tc09");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(5000);
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		
//		WebElement logoutlnk = driver.findElement(By.linkText("Logout"));
//		
//		logoutlnk.click();
//		Thread.sleep(2000);
//		
//		WebElement username = driver.findElement(By.id("username"));
//		
//		if(username.isDisplayed())
//			logger.log(LogStatus.PASS, "Logout is successful.");
//
//		else
//			logger.log(LogStatus.FAIL, "Logout is not successful.");
//		
//		report.flush();
//		driver.quit();
//	}
	
	
//	@Test
//	public void I_TC10CreateAccount() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("I_TC10CreateAccount");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
//		showAll.click();
//		Thread.sleep(6000);
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		
//
//		
//		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'Vidya Venkatesh1')]"));
//		String name  = usrname.getText();
//				
//		if(name.equals("Vidya Venkatesh1"))
//			logger.log(LogStatus.PASS, "The Correct user name is displayed in accounts page.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct user name is not displayed in accounts page.");
//		
//		WebElement NewAcnt = driver.findElement(By.xpath("//input[@name='new']"));
//		NewAcnt.click();
//		
//		String pagetitle = driver.getTitle();
//		String actualTitle = "Account Edit: New Account ~ Salesforce - Developer Edition";
//		if(pagetitle.equals(actualTitle))
//			logger.log(LogStatus.PASS, "The Correct new Account page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct new Account page is not displayed.");
//		
//		WebElement newActname = driver.findElement(By.xpath("//input[@id='acc2']"));
//		newActname.sendKeys("New12 Tester12");
//		
//		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
//		Select seltype = new Select(type);
//		seltype.selectByValue("Technology Partner");
//		
//		WebElement priority = driver.findElement(By.xpath("//select[@id='00N6g00000MRGwj']"));
//		Select priodrop = new Select(priority);
//		priodrop.selectByValue("High");
//		
//		WebElement saveBut = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
//		saveBut.click();
//		
//		WebElement savdname = driver.findElement(By.xpath("//h2[@class='topName']"));
//		String dispname = savdname.getText();
//		if(dispname.equals("New12 Tester12"))
//			logger.log(LogStatus.PASS, "The new Account functionality is working and saved the details.");
//		else
//			logger.log(LogStatus.FAIL, "The new Account functionality is not working and not saved the details.");
//		
//		report.flush();
//		driver.quit();
//		}
	
//	@Test
//	public void J_TC11_Createnewview() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("J_TC11_Createnewview");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		
//		Thread.sleep(3000);
//		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'Vidya Venkatesh1')]"));
//		String name  = usrname.getText();
//				
//		if(name.equals("Vidya Venkatesh1"))
//			logger.log(LogStatus.PASS, "The Correct user name is displayed in accounts page.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct user name is not displayed in accounts page.");
//		
//		WebElement CreateNewView = driver.findElement(By.linkText("Create New View"));
//		CreateNewView.click();
//		
//		String pagetitle = driver.getTitle();
//		String actualTitle = "Accounts: Create New View ~ Salesforce - Developer Edition";
//		if(pagetitle.equals(actualTitle))
//			logger.log(LogStatus.PASS, "The Correct new View page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct new View page is not displayed.");
//		
//		WebElement newviewname = driver.findElement(By.xpath("//input[@id='fname']"));
//		newviewname.sendKeys("NewView198");
//		
//		WebElement Viewuniqnme = driver.findElement(By.xpath("//input[@id='devname']"));
//		Viewuniqnme.sendKeys("TestUniqnme523");
//		
//		WebElement savebtn = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
//		savebtn.click();
//		Thread.sleep(3000);
//		
//		WebElement viewlist = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]"));
//		Select listsaved = new Select(viewlist);
//		WebElement valueitem = listsaved.getFirstSelectedOption();
//		if(valueitem.getText().equals("NewView198"))
//			logger.log(LogStatus.PASS, "The new View is saved succcessfully.");
//		else
//			logger.log(LogStatus.FAIL, "The new View is not saved succcessfully.");
//		
//		
//		report.flush();
//		driver.quit();
//		}
	
//	@Test
//	public void K_TC12_Editview() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("K_TC12_Editview");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		
//		Thread.sleep(3000);
//		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText'][contains(text(),'Vidya Venkatesh1')]"));
//		String name  = usrname.getText();
//				
//		if(name.equals("Vidya Venkatesh1"))
//			logger.log(LogStatus.PASS, "The Correct user name is displayed in accounts page.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct user name is not displayed in accounts page.");
//		
//		WebElement CreateNewView = driver.findElement(By.linkText("Create New View"));
//		CreateNewView.click();
//		
//		String pagetitle = driver.getTitle();
//		String actualTitle = "Accounts: Create New View ~ Salesforce - Developer Edition";
//		if(pagetitle.equals(actualTitle))
//			logger.log(LogStatus.PASS, "The Correct new View page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The Correct new View page is not displayed.");
//		
//		WebElement newviewname = driver.findElement(By.xpath("//input[@id='fname']"));
//		newviewname.sendKeys("NewView198");
//		
//		WebElement Viewuniqnme = driver.findElement(By.xpath("//input[@id='devname']"));
//		Viewuniqnme.sendKeys("TestUniqnme523");
//		
//		WebElement savebtn = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
//		savebtn.click();
//		Thread.sleep(3000);
//		
//		WebElement viewlist = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]"));
//		Select listsaved = new Select(viewlist);
//		WebElement valueitem = listsaved.getFirstSelectedOption();
//		if(valueitem.getText().equals("NewView198"))
//			logger.log(LogStatus.PASS, "The new View is saved succcessfully.");
//		else
//			logger.log(LogStatus.FAIL, "The new View is not saved succcessfully.");
//		
//		
//		report.flush();
//		driver.quit();
//		}
	
	
//	@Test
//	public void L_TC13_MergeAccounts() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("L_TC13_MergeAccounts");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		WebElement mergelnk = driver.findElement(By.linkText("Merge Accounts"));
//		mergelnk.click();
//		
//		String mergeurltitle = driver.getTitle();
//		String mergeurlactual = "Merge My Accounts ~ Salesforce - Developer Edition";
//		
//		if(mergeurltitle.equals(mergeurlactual))
//			logger.log(LogStatus.PASS, "The MergeAccount page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The MergeAccount page is not displayed.");
//		
//		
//		WebElement usrsrch = driver.findElement(By.xpath("//input[@id='srch']"));
//		usrsrch.sendKeys("New12");
//		
//		WebElement findbtn = driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]"));
//		findbtn.click();
//		Thread.sleep(3000);
//		
//		
//		WebElement chkbx1 = driver.findElement(By.xpath("//input[@id='cid0']"));
//		chkbx1.click();
//		chkbx1.click();
//		WebElement chkbx2 = driver.findElement(By.xpath("//input[@id='cid1']"));
//		chkbx2.click();		
//		chkbx2.click();	
//		WebElement nxtbtn = driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]"));
//		nxtbtn.click();
//		
//		WebElement mergepage = driver.findElement(By.xpath("//h1[@class='noSecondHeader pageType']"));
//		String mrgpage = mergepage.getText();
//		String actualpage = "Merge My Accounts";
//		
//		if(mrgpage.equals(actualpage))
//			logger.log(LogStatus.PASS, "The MergeAccount Step2 page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The MergeAccount Step2 page is not displayed.");
//		
//		WebElement mergebtn = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
//		mergebtn.click();
//		
//		Thread.sleep(3000);
//		Alert okbtn = driver.switchTo().alert();
//		okbtn.accept();
//		
//		String accountspage = driver.getTitle();
//		String actualacntpage = "Accounts: Home ~ Salesforce - Developer Edition";
//		
//		if(accountspage.equals(actualacntpage))
//			logger.log(LogStatus.PASS, "The Accounts page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The Accounts page is not displayed.");
//		
//		WebElement recenttab = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[3]/div[1]/div/div[2]/table/tbody/tr[2]/th"));
//		if(recenttab.getText().equals("New12 Tester12"))
//			logger.log(LogStatus.PASS, "The Recent Accounts section shows the account merged.");
//		else
//			logger.log(LogStatus.FAIL, "The Recent Accounts section does not shows the account merged.");
//		
//		report.flush();
//		driver.quit();
//		}
	
	
//	@Test
//	public void M_TC14_Createaccountreport() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("M_TC14_Createaccountreport");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		WebElement acountsreport = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
//		acountsreport.click();
//		Thread.sleep(3000);
//		String reprtspage = driver.getTitle();
//		String actualpage = "Unsaved Report ~ Salesforce - Developer Edition";
//		
//		if(reprtspage.equals(actualpage))
//			logger.log(LogStatus.PASS, "The Reports page is displayed.");
//		else
//			logger.log(LogStatus.FAIL, "The Reports page is not displayed.");
//		
//		WebElement datedrop = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
//		datedrop.click();
//		Thread.sleep(3000);
//		WebElement DateField = driver.findElement(By.xpath("/html/body/div[15]/div/div[3]"));
//		DateField.click();
//		
//		WebElement range = driver.findElement(By.xpath("//*[@id=\"duration-ext-gen17\"]"));
//		range.click();
//		Thread.sleep(3000);
//		WebElement rangelist = driver.findElement(By.xpath("/html/body/div[16]/div/div[2]"));
//		rangelist.click();
//		
//		WebElement fromdate = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
//		fromdate.click();
//		Thread.sleep(3000);
//		WebElement backmonth = driver.findElement(By.xpath("//*[@id=\"ext-gen275\"]"));
//		backmonth.click();
//		Thread.sleep(3000);
//		WebElement dateselect = driver.findElement(By.xpath("/html/body/div[17]/ul/li/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td[4]/a/em/span"));
//		dateselect.click();
//		Thread.sleep(3000);
//		WebElement dateto = driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]"));
//		dateto.click();
//		WebElement today = driver.findElement(By.xpath("//*[@id=\"ext-gen297\"]"));
//		today.click();
//		Thread.sleep(3000);
//		WebElement savebtn = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
//		savebtn.click();
//		Thread.sleep(3000);
//		WebElement rptname = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
//		rptname.sendKeys("ReportFeb");
//		Thread.sleep(5000);
//		WebElement uniqname = driver.findElement(By.xpath("//*[@id=\"saveReportDlg_DeveloperName\"]"));
//		uniqname.click();
//		Thread.sleep(7000);
//		WebElement saveandrunrept = driver.findElement(By.cssSelector("#dlgSaveAndRun"));
//		saveandrunrept.click();
//		Thread.sleep(6000);
//		WebElement status = driver.findElement(By.xpath("//div[@id='status']"));
//		String stat = status.getText();
//		if(stat.equals("Complete"))
//			logger.log(LogStatus.PASS, "The Reports generation is complete.");
//		else
//			logger.log(LogStatus.FAIL, "The Reports generation is not complete.");
//		
//		report.flush();
//		driver.quit();
//		}
	
	
//	@Test
//	public void N_TC15_opportunitiesdropdown() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("N_TC15_opportunitiesdropdown");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
//		opportunities.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String opporpagetitle = driver.getTitle();
//		String actualtitle = "Opportunities: Home ~ Salesforce - Developer Edition";
//		
//		if(opporpagetitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities page is not displayed properly.");
//		
//		WebElement opplist = driver.findElement(By.xpath("//select[@id='fcf']"));
//		Select opplistitem = new Select(opplist);
//		List<WebElement> alloptions = opplistitem.getOptions();
//		
//		
//		String [] listsitems = {"All Oppotunities","Closing Next Month","Closing This Month",
//				"My Opportunities","New Last Week","New This Week","Opportunity Pipeline",
//				"Private","Recently Viewed Opportunities","Won"};
//		
//			for(int i=0;i<alloptions.size();i++)
//			{
//			listsitems[i] = alloptions.get(i).getText();
//			}
//			
//			
//			for(int i=0;i<alloptions.size();i++)
//			{
//				if(listsitems[i].equals(alloptions.get(i).getText()))
//					logger.log(LogStatus.PASS, "The Opportunities list item"+listsitems[i]+" is displayed properly.");
//				else
//					logger.log(LogStatus.FAIL, "The Opportunities list item"+listsitems[i]+" is not displayed properly.");
//			}
//		
//			
//			report.flush();
//			driver.quit();
				
//	}
	
	
//	@Test
//	public void O_TC16_CreateanewOpty() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("O_TC16_CreateanewOpty");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
//		opportunities.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String opporpagetitle = driver.getTitle();
//		String actualtitle = "Opportunities: Home ~ Salesforce - Developer Edition";
//		
//		if(opporpagetitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities page is not displayed properly.");
//		
//		WebElement newopptu = driver.findElement(By.xpath("//input[@name='new']"));
//		newopptu.click();
//				
//		String newopportitle = driver.getTitle();
//		String actualtitle1 = "Opportunity Edit: New Opportunity ~ Salesforce - Developer Edition";
//		
//		if(newopportitle.equals(actualtitle1))
//			logger.log(LogStatus.PASS, "The New Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The New Opportunities page is not displayed properly.");
//		
//		WebElement opptname = driver.findElement(By.xpath("//input[@id='opp3']"));
//		opptname.sendKeys("LifeTime1234");
//		
//		WebElement accntname = driver.findElement(By.xpath("//input[@id='opp4']"));
//		accntname.sendKeys("New12 Tester12");
//		
//		WebElement closedt = driver.findElement(By.xpath("//input[@id='opp9']"));
//		closedt.click();
//		
//		WebElement datetday = driver.findElement(By.xpath("//a[@class='calToday']"));
//		datetday.click();
//		
//		WebElement type = driver.findElement(By.xpath("//select[@id='opp5']"));
//		Select typelst = new Select(type);
//		typelst.selectByValue("New Customer");
//		
//		WebElement lead = driver.findElement(By.xpath("//select[@id='opp6']"));
//		Select leadlist = new Select(lead);
//		leadlist.selectByValue("Partner Referral");
//		
//		WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
//		Select stagelst = new Select(stage);
//		stagelst.selectByValue("Qualification");
//		
//		WebElement prob = driver.findElement(By.xpath("//input[@id='opp12']"));
//		prob.clear();
//		prob.sendKeys("90");
//		
//		WebElement srce = driver.findElement(By.xpath("//input[@id='opp17']"));
//		srce.sendKeys("Twitter");	
//		
//		WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
//		save.click();
//		
//		WebElement savdoppo = driver.findElement(By.xpath("//div[@id='opp3_ileinner']"));
//		String optnme = savdoppo.getText();
//		if(optnme.equals("LifeTime123"))
//			logger.log(LogStatus.PASS, "The New Opportunities is created and saved properly.");
//		else
//			logger.log(LogStatus.FAIL, "The New Opportunities is not created and saved properly.");
//		
//			report.flush();
//			driver.quit();
//	}
	
//	
//	@Test
//	public void P_TC17_TestOpportunityPipelineReport() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("P_TC17_TestOpportunityPipelineReport");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
//		opportunities.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String opporpagetitle = driver.getTitle();
//		String actualtitle = "Opportunities: Home ~ Salesforce - Developer Edition";
//		
//		if(opporpagetitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities page is not displayed properly.");
//		
//		WebElement opptpipline = driver.findElement(By.linkText("Opportunity Pipeline"));
//		opptpipline.click();
//				
//		String newopportitle = driver.getTitle();
//		String actualtitle1 = "Opportunity Pipeline ~ Salesforce - Developer Edition";
//		
//		if(newopportitle.equals(actualtitle1))
//			logger.log(LogStatus.PASS, "The Opportunities Pipeline reports page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities Pipeline reports page is not displayed properly.");
//		
//				
//			report.flush();
//			driver.quit();
//	}
//	
//	@Test
//	public void Q_TC18_TestStuckOpportunityReport() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("Q_TC18_TestStuckOpportunityReport");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
//		opportunities.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String opporpagetitle = driver.getTitle();
//		String actualtitle = "Opportunities: Home ~ Salesforce - Developer Edition";
//		
//		if(opporpagetitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities page is not displayed properly.");
//		
//		WebElement stkopptpipline = driver.findElement(By.linkText("Stuck Opportunities"));
//		stkopptpipline.click();
//				
//		String newopportitle = driver.getTitle();
//		String actualtitle1 = "Stuck Opportunities ~ Salesforce - Developer Edition";
//		
//		if(newopportitle.equals(actualtitle1))
//			logger.log(LogStatus.PASS, "The Stuck Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Stuck Opportunities page is not displayed properly.");
//		
//				
//			report.flush();
//			driver.quit();
//	}
//	
//	@Test
//	public void R_TC19_TestQuarterlySummaryReport() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("R_TC19_TestQuarterlySummaryReport");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
//		opportunities.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String opporpagetitle = driver.getTitle();
//		String actualtitle = "Opportunities: Home ~ Salesforce - Developer Edition";
//		
//		if(opporpagetitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Opportunities page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunities page is not displayed properly.");
//		
//		WebElement freq = driver.findElement(By.xpath("//select[@id='quarter_q']"));
//		Select freqcy = new Select(freq);
//		freqcy.selectByValue("curnextfy");
//		
//		WebElement include = driver.findElement(By.xpath("//select[@id='open']"));
//		Select inclst = new Select(include);
//		inclst.selectByValue("all");
//		
//		WebElement runrpt = driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
//		runrpt.click();
//		
//		String opprptpagetitle = driver.getTitle();
//		String acttitle = "Opportunity Report ~ Salesforce - Developer Edition";
//		
//		if(opprptpagetitle.equals(acttitle))
//			logger.log(LogStatus.PASS, "The Opportunity Report page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Opportunity Report page is not displayed properly.");
//				
//			report.flush();
//			driver.quit();
//	}
	
//	@Test
//	public void S_TC20_leadsTab() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("S_TC20_leadsTab");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement leads = driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String leadstitle = driver.getTitle();
//		String actualtitle = "Leads: Home ~ Salesforce - Developer Edition";
//		
//		if(leadstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Leads page is not displayed properly.");
//		
//			
//			report.flush();
//			driver.quit();
//	}
	
//	@Test
//	public void T_TC21leadsSelectView() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("T_TC21leadsSelectView");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		
//		WebElement leads = driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String leadstitle = driver.getTitle();
//		String actualtitle = "Leads: Home ~ Salesforce - Developer Edition";
//		
//		if(leadstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Leads page is not displayed properly.");
//		
//		WebElement leadlist = driver.findElement(By.xpath("//select[@id='fcf']"));
//		Select leadlistitem = new Select(leadlist);
//		List<WebElement> alloptions = leadlistitem.getOptions();
//		
//		
//		String [] listsitems = {"All Open Leads","My Unread Leads","Recently Viewed Leads",
//				"Today's Leads"};
//		
//			for(int i=0;i<4;i++)
//			{
//			listsitems[i] = alloptions.get(i).getText();
//			}
//			
//			
//			for(int i=0;i<4;i++)
//			{
//				if(listsitems[i].equals(alloptions.get(i).getText()))
//					logger.log(LogStatus.PASS, "The Opportunities list item"+listsitems[i]+" is displayed properly.");
//				else
//					logger.log(LogStatus.FAIL, "The Opportunities list item"+listsitems[i]+" is not displayed properly.");
//			}	
//			report.flush();
//			driver.quit();
//	}
	
//	@Test
//	public void U_TC22defaultView() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("U_TC22defaultView");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement leads = driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String leadstitle = driver.getTitle();
//		String actualtitle = "Leads: Home ~ Salesforce - Developer Edition";
//		
//		if(leadstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Leads page is not displayed properly.");
//		
//		WebElement leadlist = driver.findElement(By.xpath("//select[@id='fcf']"));
//		leadlist.click();
//		Select leadlistitem = new Select(leadlist);
//		leadlistitem.selectByVisibleText("My Unread Leads");
//		
//		WebElement logoutpage = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
//		logoutpage.click();
//		Thread.sleep(3000);
//		WebElement logout = driver.findElement(By.linkText("Logout"));
//		logout.click();
//		Thread.sleep(3000);
//		WebElement login = driver.findElement(By.id("username"));
//		login.sendKeys("test@tekarch.com");
//		
//		WebElement pwd1 = driver.findElement(By.id("password"));
//		pwd1.sendKeys("B@ngalore123");
//		
//		WebElement lgnbtn = driver.findElement(By.xpath("//input[@id='Login']"));
//		lgnbtn.click();
//		
//		Thread.sleep(10000);
//		
//		WebElement showAll1 = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll1.click();
//		
//		WebElement leads1 = driver.findElement(By.linkText("Leads"));
//		leads1.click();
//		
//		Robot robot1 = new Robot();
//		robot1.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		WebElement gobtn = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
//		gobtn.click();
//		
//		Thread.sleep(6000);
//		WebElement leadlist1 = driver.findElement(By.xpath("//select[@id='00B6g00000B5PJJ_listSelect']"));
//		Select leadlistitem1 = new Select(leadlist1);
//		String selitem = leadlistitem1.getFirstSelectedOption().getText();
//		
//		if(selitem.equals("My Unread Leads"))
//			logger.log(LogStatus.PASS, "The Leads list has previous selected value.");
//		else
//			logger.log(LogStatus.FAIL, "The Leads list does not have previous selected value.");
//
//		
//			report.flush();
//			driver.quit();
//	}
//	
	
//	@Test
//	public void V_TC23TodaysLEads() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("V_TC23TodaysLEads");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement leads = driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String leadstitle = driver.getTitle();
//		String actualtitle = "Leads: Home ~ Salesforce - Developer Edition";
//		
//		if(leadstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Leads page is not displayed properly.");
//		
//		WebElement leadlist = driver.findElement(By.xpath("//select[@id='fcf']"));
//		Select leadlistitem = new Select(leadlist);
//		leadlistitem.selectByVisibleText("Today's Leads");
//	
//				
//		WebElement gobtn = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
//		gobtn.click();
//		
//		Thread.sleep(6000);
//		WebElement leadlist1 = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]"));
//		Select leadlistitem1 = new Select(leadlist1);
//		String selitem = leadlistitem1.getFirstSelectedOption().getText();
//		
//		if(selitem.equals("Today's Leads"))
//			logger.log(LogStatus.PASS, "The Leads page shows Todays leads page.");
//		else
//			logger.log(LogStatus.FAIL, "The Leads page does not shows Todays leads page.");
//
//		
//			report.flush();
//			driver.quit();
//	}
//	
//	@Test
//	public void W_TC24NewLeads() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//		
//		WebDriver driver;
//		WebDriverManager.firefoxdriver().setup();
//		
//		driver = new FirefoxDriver();
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("W_TC24NewLeads");
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement leads = driver.findElement(By.linkText("Leads"));
//		leads.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String leadstitle = driver.getTitle();
//		String actualtitle = "Leads: Home ~ Salesforce - Developer Edition";
//		
//		if(leadstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Leads page is not displayed properly.");
//		
//		WebElement newbtn = driver.findElement(By.xpath("//input[@name='new']"));
//		newbtn.click();
//		
//				
//		String newleadstitle = driver.getTitle();
//		String actualtitle1 = "Lead Edit: New Lead ~ Salesforce - Developer Edition";
//		
//		if(newleadstitle.equals(actualtitle1))
//			logger.log(LogStatus.PASS, "The New Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The New Leads page is not displayed properly.");
//				
//		WebElement fname = driver.findElement(By.xpath("//input[@id='name_firstlea2']"));
//		fname.sendKeys("Fname133");
//		
//		WebElement lname = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
//		lname.sendKeys("Lname13");
//		
//		WebElement cname = driver.findElement(By.xpath("//input[@id='lea3']"));
//		cname.sendKeys("ABCD13");
//		
//		WebElement save = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
//		save.click();
//		
//		Thread.sleep(6000);
//		
//		String newleadtitle = driver.getTitle();
//		String actualtitle2 = "Lead: Fname133 Lname13 ~ Salesforce - Developer Edition";
//		
//		if(newleadtitle.equals(actualtitle2))
//			logger.log(LogStatus.PASS, "The New created Leads page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The New created Leads page is not displayed properly.");
//			
//		
//			report.flush();
//			driver.quit();
//	}
//	
////	@Test
////	public void X_TC25Contacts() throws InterruptedException, AWTException {
////	
////		ExtentTest logger;
////		ExtentReports report;
////
////		WebDriver driver;
////		WebDriverManager.chromedriver().setup();
////		driver = new ChromeDriver();
////		
////		
////		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
////		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
////		report = new ExtentReports(path);
////		logger = report.startTest("X_TC25Contacts");
////
////		
////		driver.get("https://login.salesforce.com/");
////		Thread.sleep(2000);
////		WebElement uid = driver.findElement(By.id("username"));
////		uid.sendKeys("test@tekarch.com");
////		
////		WebElement pwd = driver.findElement(By.id("password"));
////		pwd.sendKeys("B@ngalore123");
////		
////		WebElement LoginButn = driver.findElement(By.id("Login"));
////		LoginButn.click();
////		Thread.sleep(10000);
////		
////		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
////		showAll.click();
////		
////		WebElement contacts = driver.findElement(By.linkText("Contacts"));
////		contacts.click();
////		
////		Robot robot = new Robot();
////		robot.keyPress(KeyEvent.VK_ESCAPE);
////		Thread.sleep(3000);
////		
////		String contactstitle = driver.getTitle();
////		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
////		
////		if(contactstitle.equals(actualtitle))
////			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
////				else
////			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
////		
////		WebElement newbtn = driver.findElement(By.xpath("//input[@name='new']"));
////		newbtn.click();
////						
////		String newcontit = driver.getTitle();
////		String acttit = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
////		
////		if(newcontit.equals(acttit))
////			logger.log(LogStatus.PASS, "The New Contacts page is displayed properly.");
////				else
////			logger.log(LogStatus.FAIL, "The New Contacts page is not displayed properly.");
////		
////		WebElement lname = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
////		lname.sendKeys("Test6754");
////		
////		WebElement acntname = driver.findElement(By.xpath("//input[@id='con4']"));
////		acntname.sendKeys("New12 Tester12");
////		
////		WebElement savbtn = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
////		savbtn.click();
////		
////		
////		
////		String newcontit1 = driver.getTitle();
////		String acttit1 = "Contact: Test6754 ~ Salesforce - Developer Edition";
////		
////		if(newcontit1.equals(acttit1))
////			logger.log(LogStatus.PASS, "The NewContacts page is displayed properly.");
////				else
////			logger.log(LogStatus.FAIL, "The NewContacts page is not displayed properly.");
////		
////		
////		report.flush();
////		driver.quit();
////	}
//	
//	@Test
//	public void Y_TC26NewViewCon() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("Y_TC26NewViewCon");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement newviewlink = driver.findElement(By.linkText("Create New View"));
//		newviewlink.click();
//						
//		String newviewtit = driver.getTitle();
//		String acttit = "Contacts: Create New View ~ Salesforce - Developer Edition";
//		
//		if(newviewtit.equals(acttit))
//			logger.log(LogStatus.PASS, "The Contacts New View page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts New View page is not displayed properly.");
//		
//		WebElement Fname = driver.findElement(By.xpath("//input[@id='fname']"));
//		Fname.sendKeys("New5668");
//		
//		
//		WebElement savbtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
//		savbtn.click();
//		
//		WebElement viewlst = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/form/div[1]/div/select"));
//		Select lstitem = new Select(viewlst);
//		String item = lstitem.getFirstSelectedOption().getText();
//					
//		if(item.equals("New5668"))
//			logger.log(LogStatus.PASS, "The NewView is created from Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The NewView is created from Contacts page is not displayed properly.");
//		
//		
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void Z_TC27CheckContact() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("Z_TC27CheckContact");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement contactcreated = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
//		Select rcnt = new Select(contactcreated);
//		rcnt.selectByVisibleText("Recently Created");
//		
//		WebElement Table = driver.findElement(By.xpath("//table[contains(@class,'list')]"));
//		List<WebElement> rows = Table.findElements(By.tagName("tr"));
//		
//		boolean flag = false;
//		
//		for(int rnum=0;rnum<rows.size();rnum++)
//		{
//			List<WebElement> header = rows.get(rnum).findElements(By.tagName("th"));
//			
//			for(int head=0;head<header.size();head++)
//			{
//				if(header.get(head).getText().equals("Test6754"))
//					flag=true;
//			}
//		}
//		if(flag==true)
//			logger.log(LogStatus.PASS, "The newly created contact name is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The newly created contact name is not displayed properly.");
//				
//				
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void AA_TC28MyContacts() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AA_TC28MyContacts");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement viewlst = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/select[1]"));
//		Select lstitem = new Select(viewlst);
//		lstitem.selectByVisibleText("My Contacts");
//		
//		WebElement gobtn = driver.findElement(By.xpath("//input[@name='go']"));
//		gobtn.click();
//		
//		Thread.sleep(6000);
//
//		WebElement namecol = driver.findElement(By.xpath("//div[@class='x-grid3-hd-inner x-grid3-hd-FULL_NAME']"));
//		if(namecol.isDisplayed())
//			logger.log(LogStatus.PASS, "The MyContacts view page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The MyContacts view page is not displayed properly.");
//
//				
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void AB_TC29ContactOpen() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AB_TC29ContactOpen");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement contactname = driver.findElement(By.xpath("//a[contains(text(),'Test675445')]"));
//		contactname.click();
//		Thread.sleep(6000);
//				
//		String contactnametit = driver.getTitle();
//		String actualnmetitle = "Contact: Test675445 ~ Salesforce - Developer Edition";
//		
//		if(contactnametit.equals(actualnmetitle))
//			logger.log(LogStatus.PASS, "The Contact Test6754 page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contact Test6754 page is not displayed properly.");
//		
//		WebElement namefield = driver.findElement(By.xpath("//div[@id='con2_ileinner']"));
//		String nameval = namefield.getText();
//		
//		if(nameval.equals("Test675445"))
//			logger.log(LogStatus.PASS, "The Contact page shows correct name.");
//				else
//			logger.log(LogStatus.FAIL, "The Contact page doesnot shows correct name.");
//		
//				
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void AC_TC30NewViewError() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AC_TC30NewViewError");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement newviewlink = driver.findElement(By.linkText("Create New View"));
//		newviewlink.click();
//						
//		String newviewtit = driver.getTitle();
//		String acttit = "Contacts: Create New View ~ Salesforce - Developer Edition";
//		
//		if(newviewtit.equals(acttit))
//			logger.log(LogStatus.PASS, "The Contacts New View page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts New View page is not displayed properly.");
//		
//		WebElement Fname = driver.findElement(By.xpath("//input[@id='fname']"));
//		Fname.clear();
//		
//		WebElement uniqname = driver.findElement(By.xpath("//input[@id='devname']"));
//		uniqname.sendKeys("New55676");
//		
//		WebElement savbtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
//		savbtn.click();
//		Thread.sleep(5000);
//		
//		WebElement viewlst = driver.findElement(By.xpath("//div[contains(text(),'You must enter a value')]"));
//		String errmsg = viewlst.getText();
//					
//		if(errmsg.trim().equals("Error: You must enter a value"))
//			logger.log(LogStatus.PASS, "The error message for no view name entered is displayed in create view page.");
//				else
//			logger.log(LogStatus.FAIL, "The error message for no view name entered is not displayed in create view page.");
//		
//		
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void AD_TC31NewViewCancel() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AD_TC31NewViewCancel");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement newviewlink = driver.findElement(By.linkText("Create New View"));
//		newviewlink.click();
//						
//		String newviewtit = driver.getTitle();
//		String acttit = "Contacts: Create New View ~ Salesforce - Developer Edition";
//		
//		if(newviewtit.equals(acttit))
//			logger.log(LogStatus.PASS, "The Contacts New View page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts New View page is not displayed properly.");
//		
//		WebElement Fname = driver.findElement(By.xpath("//input[@id='fname']"));
//		Fname.sendKeys("View1234");
//		
//		WebElement uniqname = driver.findElement(By.xpath("//input[@id='devname']"));
//		uniqname.sendKeys("New55676");
//		
//		WebElement canclbtn = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
//		canclbtn.click();
//		
//		
//		
//		String contit = driver.getTitle();
//		String acttitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contit.equals(acttitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		
//		WebElement viewnme = driver.findElement(By.xpath("//tr[contains(@class,'dataRow even first')]//th[contains(@class,'')]"));
//		String viewnameshown = viewnme.getText();
//					
//		if(!viewnme.equals(viewnameshown))
//			logger.log(LogStatus.PASS, "The View is not added as expected since we cancelled the create view.");
//				else
//			logger.log(LogStatus.FAIL, "The View is got added as expected since we cancelled the create view.");
//		
//		
//		report.flush();
//		driver.quit();
//	}
//	
//	@Test
//	public void AE_TC32NewContacts() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AE_TC32NewContacts");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement contacts = driver.findElement(By.linkText("Contacts"));
//		contacts.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Contacts: Home ~ Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Contacts page is not displayed properly.");
//		
//		WebElement newbtn = driver.findElement(By.xpath("//input[@name='new']"));
//		newbtn.click();
//						
//		String newcontit = driver.getTitle();
//		String acttit = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
//		
//		if(newcontit.equals(acttit))
//			logger.log(LogStatus.PASS, "The New Contacts page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The New Contacts page is not displayed properly.");
//		
//		WebElement fname = driver.findElement(By.xpath("//input[@id='name_firstcon2']"));
//		fname.sendKeys("Indian1");
//		
//		WebElement lasttname = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
//		lasttname.sendKeys("GlobalMedia");
//		
//		WebElement savnewbtn = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']"));
//		savnewbtn.click();
//		
//		Thread.sleep(5000);
//		
//		String conedittit = driver.getTitle();
//		String acttitle = "Contact Edit: New Contact ~ Salesforce - Developer Edition";
//		
//		if(conedittit.equals(acttitle))
//			logger.log(LogStatus.PASS, "The ContactEdit page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The ContactEdit page is not displayed properly.");
//		
//		Thread.sleep(5000);
//		
//		
//		
//		WebElement contactlistings = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[2]"));
//		List<WebElement> rows = contactlistings.findElements(By.xpath("//div[@id='hoverItem28']"));
//		boolean flag=false;
//		for(int rnum=0;rnum<rows.size();rnum++)
//		{
//			List<WebElement> header = rows.get(rnum).findElements(By.xpath("//div[@id='mru0036g00000AwfKE']"));
//			
//			for(int headerrow=0;headerrow<header.size();headerrow++)
//			{
//			if(header.get(rnum).getText().equals("Indian1 GlobalMedia"))
//				flag=true;		
//			}
//		}
//		
//				
//		if(flag==true)
//			logger.log(LogStatus.PASS, "The newly added contact is saved.");
//				else
//			logger.log(LogStatus.FAIL, "The newly added contact is not saved.");
//
//		
//		report.flush();
//		driver.quit();
//	}
	
//	@Test
//	public void AF_TC33VerifyDetails() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AD_TC33VerifyDetails");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement hometab = driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
//		hometab.click();
//		
//				
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Home page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Home page is not displayed properly.");
//		
//		WebElement namedisp = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Vidya Venkatesh1')]"));
//		if(namedisp.getText().equals("Vidya Venkatesh1"))
//				logger.log(LogStatus.PASS, "The Home page shows the user first and last name properly.");
//					else
//				logger.log(LogStatus.FAIL, "The Home page does not shows the user first and last name properly.");
//	
//			
//		WebElement contactlistings = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
//		List<WebElement> rows = contactlistings.findElements(By.xpath("//div[@id='hoverItem97']"));
//		boolean flag=false;
//		for(int rnum=0;rnum<rows.size();rnum++)
//		{
//			List<WebElement> header = rows.get(rnum).findElements(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]"));
//			
//			for(int headerrow=0;headerrow<header.size();headerrow++)
//			{
//			if(header.get(rnum).getText().contains("Vidya Venkatesh1"))
//				flag=true;		
//			}
//		}
//		
//				
//		if(flag==true)
//			logger.log(LogStatus.PASS, "The User contact name is showing in the lest pane.");
//				else
//			logger.log(LogStatus.FAIL, "The User contact name is not showing in the lest pane.");
//		
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		WebElement myproflnk = driver.findElement(By.linkText("My Profile"));
//		myproflnk.click();
//		Thread.sleep(8000);
//		
//		WebElement namedispl = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
//		if(namedispl.getText().contains("Vidya Venkatesh1"))
//			logger.log(LogStatus.PASS, "The User contact name in Myprofile is same as in Home tab.");
//				else
//			logger.log(LogStatus.FAIL, "The User contact name in Myprofile is not same as in Home tab.");
//
//		
//		report.flush();
//		driver.quit();
//	}
	
//	@Test
//	public void AG_TC34VerifyEdit() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AG_TC34VerifyEdit");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement hometab = driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
//		hometab.click();
//		
//				
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String contactstitle = driver.getTitle();
//		String actualtitle = "Salesforce - Developer Edition";
//		
//		if(contactstitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Home page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Home page is not displayed properly.");
//		
//					
//		WebElement contactlistings = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]/div[2]/div[2]/div[1]"));
//		contactlistings.click();
//		Thread.sleep(10000);		
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//				
//		String usertitle = driver.getTitle();
//		String acttitle = "SUser: Vidya Venkatesh1 ~ Salesforce - Developer Edition";
//		
//		if(usertitle.equals(acttitle))
//			logger.log(LogStatus.PASS, "The User page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The User page is not displayed properly.");
//		
//		WebElement editlink = driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img"));
//		editlink.click();
//			
//		driver.switchTo().frame("contactInfoContentId");
//				
//		WebElement contab = driver.findElement(By.xpath("//*[@id=\"contactTab\"]/a"));
//		if (contab.isSelected())
//			logger.log(LogStatus.PASS,"Contact tab is displayed and selected.");
//		else
//			logger.log(LogStatus.FAIL,"Contact tab is not displayed and selected.");
//		
//		WebElement abouttab = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
//		abouttab.click();
//		
//		WebElement lastName = driver.findElement(By.id("lastName"));
//		lastName.clear();
//		lastName.sendKeys("Venkatesh1Test");
//		
//		
//		WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
//		saveall.click();
//		Thread.sleep(8000);
//		
//		
//		WebElement namedispl = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
//		if(namedispl.getText().equals("Venkatesh1Test"))
//			logger.log(LogStatus.PASS, "The updated name shows in the page.");
//				else
//			logger.log(LogStatus.FAIL, "The updated name does not shows in the page.");
//
//		
//		report.flush();
//		driver.quit();
//	}
//	
	
//	@Test
//	public void AH_TC35Alltab() throws InterruptedException, AWTException {
//	
//		ExtentTest logger;
//		ExtentReports report;
//
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		
//		
//		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
//		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
//		report = new ExtentReports(path);
//		logger = report.startTest("AH_TC35Alltab");
//
//		
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		WebElement uid = driver.findElement(By.id("username"));
//		uid.sendKeys("test@tekarch.com");
//		
//		WebElement pwd = driver.findElement(By.id("password"));
//		pwd.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn = driver.findElement(By.id("Login"));
//		LoginButn.click();
//		Thread.sleep(10000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement customize = driver.findElement(By.xpath("//input[@name='customize']"));
//		customize.click();
//		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ESCAPE);
//		Thread.sleep(3000);
//		
//		String custtitle = driver.getTitle();
//		String actualtitle = "Customize My Tabs ~ Salesforce - Developer Edition";
//		
//		if(custtitle.equals(actualtitle))
//			logger.log(LogStatus.PASS, "The Customize tab page is displayed properly.");
//				else
//			logger.log(LogStatus.FAIL, "The Customize tab page is not displayed properly.");
//		
//		WebElement table = driver.findElement(By.xpath("//select[@id='duel_select_1']"));
//		Select removeoptn = new Select(table);
//		removeoptn.selectByVisibleText("Chatter");
//		
//		WebElement rmve = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
//		rmve.click();
//		Thread.sleep(8000);
//		
//		boolean flag = true;
//		List<WebElement> items = removeoptn.getOptions();
//		for(int i=0;i<items.size();i++)
//		{
//			if(items.get(i).getText().contains("Chatter"))
//				flag = false;
//		}
//		
//		if(flag == true)
//			logger.log(LogStatus.PASS, "The value selected is removed properly from the Selected tabs section.");
//				else
//			logger.log(LogStatus.FAIL, "The value selected is not removed properly from the Selected tabs section.");
//		
//		Thread.sleep(8000);
//		WebElement availtable = driver.findElement(By.xpath("//select[@id='duel_select_0']"));
//		Select availoptn = new Select(availtable);
//		boolean flag1 = false;
//		List<WebElement> itemsavail = availoptn.getOptions();
//		for(int i=0;i<items.size();i++)
//		{
//			if(itemsavail.get(i).getText().contains("Chatter"))
//				flag1 = true;
//		}
//		
//		if(flag1 == true)
//			logger.log(LogStatus.PASS, "The value selected is added properly from the Selected tabs section to Available Tabs section.");
//				else
//			logger.log(LogStatus.FAIL, "The value selected is not added properly from the Selected tabs section to Available Tabs section.");
//				
//		WebElement savebtn = driver.findElement(By.xpath("//input[@name='save']"));
//		savebtn.click();
//		Thread.sleep(10000);
//		
//		String alltabttit = driver.getTitle();
//		String actltitle = "All Tabs ~ Salesforce - Developer Edition";
//		
//		if(alltabttit.equals(actltitle))
//			logger.log(LogStatus.PASS, "The All tab page is displayed properly after save.");
//				else
//			logger.log(LogStatus.FAIL, "The All tab page is not displayed properly after save.");
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
//		
//		WebElement Logoutlnk = driver.findElement(By.linkText("Logout"));
//		Logoutlnk.click();
//		Thread.sleep(8000);
//		
//		WebElement uid1 = driver.findElement(By.id("username"));
//		uid1.sendKeys("test@tekarch.com");
//		
//		WebElement pwd1 = driver.findElement(By.id("password"));
//		pwd1.sendKeys("B@ngalore123");
//		
//		WebElement LoginButn1 = driver.findElement(By.id("Login"));
//		LoginButn1.click();
//		Thread.sleep(20000);
//		
//		List<WebElement> tabs123 = driver.findElements(By.xpath("//ul[@id='tabBar']"));
//					
//		boolean flag2 = true;
//		for(int i=0;i<tabs123.size();i++)
//		{
//			if(tabs123.get(i).getText().equals("Chatter"))
//				flag2 = false;
//		}
//		
//		if(flag2 == true)
//			logger.log(LogStatus.PASS, "The All tab section does not have the option removed.");
//				else
//			logger.log(LogStatus.FAIL, "The All tab section still have the option removed.");
//		
//		
//		report.flush();
//		driver.quit();
//	}
	
	@Test
	public void AI_TC36_Calendar() throws InterruptedException, AWTException, ParseException {
	
		ExtentTest logger;
		ExtentReports report;

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
		report = new ExtentReports(path);
		logger = report.startTest("AI_TC36_Calendar");

		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys("test@tekarch.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("B@ngalore123");
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		LoginButn.click();
		Thread.sleep(10000);
		
		WebElement hometab = driver.findElement(By.xpath("//li[@id='home_Tab']//a[contains(text(),'Home')]"));
		hometab.click();
		Thread.sleep(8000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		
		WebElement currdate = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]"));
		String appdate = currdate.getText();
				
		Date sysdate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE MMMM dd,yyyy");
		String sysdate1 = dateFormat.format((sysdate));
		
					
		if(sysdate1.equals(appdate))
			logger.log(LogStatus.PASS, "The All tab section does not have the option removed.");
				else
			logger.log(LogStatus.FAIL, "The All tab section still have the option removed.");
		
		WebElement datelink = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/div[2]/span[2]/a[1]"));
		datelink.click();
		
		WebElement textinpage = driver.findElement(By.xpath("//h1[@class='pageType']"));
		String textact = textinpage.getText();
		
		String expttxt = "Calendar for Vidya Venkatesh1Test";
		
		if(textact.contains(expttxt))
			logger.log(LogStatus.PASS, "The Calendar for Firstname Lastname is shown in the page.");
				else
			logger.log(LogStatus.FAIL, "The Calendar for Firstname Lastname is not shown in the page.");
		
		WebElement linktime = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		linktime.click();
		
		String exptit = "Calendar: New Event ~ Salesforce - Developer Edition";
		String acttitle1 = driver.getTitle();
		
		if(acttitle1.equals(exptit))
			logger.log(LogStatus.PASS, "The Calendar: New Event page is displayed correctly.");
				else
			logger.log(LogStatus.FAIL, "The Calendar: New Event page is not displayed correctly.");

		WebElement expectedElement = driver.findElement(By.xpath("//input[@id='evt5']"));
		
		if(expectedElement.equals(driver.switchTo().activeElement()))
			logger.log(LogStatus.PASS, "The cursor is at correct Subject textbox.");
				else
			logger.log(LogStatus.FAIL, "The cursor is not at correct Subject textbox.");

		WebElement subicon = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
		subicon.click();
		
		String oldwin = driver.getWindowHandle();
		
		Set<String> getallwin = driver.getWindowHandles();
		
		String [] getwin = getallwin.toArray(new String[getallwin.size()]);
		
		driver.switchTo().window(getwin[1]);
		
		WebElement dialoglinkother = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		dialoglinkother.click();
		
		Thread.sleep(6000);
		driver.switchTo().window(oldwin);
		String currwin = driver.getWindowHandle();
		
		if(oldwin.equals(currwin))
			logger.log(LogStatus.PASS, "The dialog is closed and now the focus is back to original window.");
				else
			logger.log(LogStatus.FAIL, "The dialog is not closed and now the focus is back to original window.");

		WebElement expElement = driver.findElement(By.xpath("//input[@id='evt5']"));
		
		if(expElement.getText().equals("Other"))
			logger.log(LogStatus.PASS, "The option Other is selected from the dialog box.");
				else
			logger.log(LogStatus.FAIL, "The option Other is not selected from the dialog box.");
		
			WebElement timedrop = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
			timedrop.click();
			
			WebElement timedrop1 = driver.findElement(By.xpath("//div[@id='timePickerItem_43']"));
			timedrop1.click();
			
			
			WebElement savebtn = driver.findElement(By.xpath("//div[@id='ep']//div[contains(@class,'pbHeader')]//input[1]"));
			savebtn.click();
			
			WebElement calendar = driver.findElement(By.xpath("//h1[@class='pageType']"));
			String visibletxt = calendar.getText();
			
			if(visibletxt.contains("Calendar for Vidya Venkatesh1Test"))
				logger.log(LogStatus.PASS, "The Calendar is saved for User FirstNameLastName.");
					else
				logger.log(LogStatus.FAIL, "The Calendar is not saved for User FirstNameLastName.");
	
			WebElement event = driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id69:28:j_id71:0:j_id72:calendarEvent:j_id84\"]/a"));
			if(event.getText().equals("Other"))
				logger.log(LogStatus.PASS, "The Event Other is saved in the Caledar.");
					else
				logger.log(LogStatus.FAIL, "The Event Other is not saved in the Caledar.");
			
			
			report.flush();
			driver.quit();
		

	}
	
	
}
