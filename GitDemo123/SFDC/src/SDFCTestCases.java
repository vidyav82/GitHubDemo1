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
//		WebElement postlnk = driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]"));
//		postlnk.click();
//		
//		WebElement htmlbody = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
//		
//				
//		driver.switchTo().frame(1);
//		htmlbody.click();
//		
//		htmlbody.sendKeys("Testing is in progress.");
//	
//		WebElement share = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
//		share.click();
//		
//		Thread.sleep(2000);
//		WebElement txt = driver.findElement(By.xpath("/html[1]/body[1]/p[1]"));
//		String txtdisp = txt.getText();
//		if(txtdisp.contains("Testing is in progress."))
//			logger.log(LogStatus.PASS,"The entered text is displayed.");
//		else
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
	
	
	@Test
	public void I_TC10CreateAccount() throws InterruptedException {
	
		ExtentTest logger;
		ExtentReports report;
		
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
		report = new ExtentReports(path);
		logger = report.startTest("I_TC10CreateAccount");
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys("test@tekarch.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("B@ngalore123");
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		LoginButn.click();
		Thread.sleep(10000);
		
		WebElement showAll = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		showAll.click();
		Thread.sleep(6000);
		
		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
		Accounts.click();
		
		Thread.sleep(5000);
		List<WebElement> frames = driver.findElements(By.xpath("//*[@id=\"sessiontimeout\"]"));
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement nothxbtn = driver.findElement(By.xpath("//*[@id=\"lexNoThanks\"]"));
		nothxbtn.click();
		WebElement sendtosale = driver.findElement(By.cssSelector("//*[@id=\"lexSubmit\"]"));
		sendtosale.click();
		driver.switchTo().parentFrame();
		
		
		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText']"));
		String name  = usrname.getText();
				
		if(name.equals("Vidya Venkatesh1"))
			logger.log(LogStatus.PASS, "The Correct user name is displayed in accounts page.");
		else
			logger.log(LogStatus.FAIL, "The Correct user name is not displayed in accounts page.");
		
		WebElement NewAcnt = driver.findElement(By.xpath("//input[@name='new']"));
		NewAcnt.click();
		
		String pagetitle = driver.getTitle();
		String actualTitle = "Account Edit: New Account ~ Salesforce - Developer Edition";
		if(pagetitle.equals(actualTitle))
			logger.log(LogStatus.PASS, "The Correct new Account page is displayed.");
		else
			logger.log(LogStatus.FAIL, "The Correct new Account page is not displayed.");
		
		WebElement newActname = driver.findElement(By.xpath("//input[@id='acc2']"));
		newActname.sendKeys("New12 Tester12");
		
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		Select seltype = new Select(type);
		seltype.selectByValue("Technology Partner");
		
		WebElement priority = driver.findElement(By.xpath("//select[@id='00N6g00000MRGwj']"));
		Select priodrop = new Select(priority);
		priodrop.selectByValue("High");
		
		WebElement saveBut = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
		saveBut.click();
		
		WebElement savdname = driver.findElement(By.xpath("//h2[@class='topName']"));
		String dispname = savdname.getText();
		if(dispname.equals("New12 Tester12"))
			logger.log(LogStatus.PASS, "The new Account functionality is working and saved the details.");
		else
			logger.log(LogStatus.FAIL, "The new Account functionality is not working and not saved the details.");
		
		report.flush();
		driver.quit();
		}
	
//	@Test
//	public void J_TC11_Createnewview() throws InterruptedException {
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
//		Thread.sleep(6000);
//		
//		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]"));
//		showAll.click();
//		
//		WebElement Accounts = driver.findElement(By.linkText("Accounts"));
//		Accounts.click();
//		
////		Alert alertpopup = driver.switchTo().alert();
////		WebElement nothxbtn = driver.findElement(By.xpath("//input[@id='lexNoThanks']"));
////		nothxbtn.click();
//		
//		WebElement usrname = driver.findElement(By.xpath("//span[@class='mruText']"));
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
//		newviewname.sendKeys("NewView1234");
//		
//		WebElement Viewuniqnme = driver.findElement(By.xpath("//input[@id='devname']"));
//		Viewuniqnme.sendKeys("TestUniqnme123");
//		
//		WebElement savebtn = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
//		savebtn.click();
//		
//		WebElement viewlist = driver.findElement(By.xpath("//select[@id='00B6g00000BeujJ_listSelect']"));
//		Select listsaved = new Select(viewlist);
//		WebElement valueitem = listsaved.getFirstSelectedOption();
//		if(valueitem.getText().equals("NewView1234"))
//			logger.log(LogStatus.PASS, "The new View is saved succcessfully.");
//		else
//			logger.log(LogStatus.FAIL, "The new View is not saved succcessfully.");
//		
//		
//		report.flush();
//		driver.quit();
//		}
	
	
	
	
}
