import java.util.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDFCTestCases<SelectElement> {
	
//@Test
//public void A_LoginErrorMessage() throws InterruptedException {
//
//	WebDriver driver;
//
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
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
//		System.out.println("Passed: The Error message is displayed correctly.");
//	}
//	else
//	{
//		System.out.println("Failed: The Error message  is not displayed correctly.");
//	}
//	
//	Thread.sleep(2000);
//	driver.quit();
//}

//@Test
//public void B_LogintoSFDC() throws InterruptedException {
//
//	WebDriver driver;
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
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
//	//driver.getTitle()
//	
//	WebElement Hometab = driver.findElement(By.id("home_Tab"));
//	
//	
//	if(Hometab.isDisplayed())
//	{
//		System.out.println("Passed: The Home page is loaded correctly.");
//	}
//	else
//	{
//		System.out.println("Failed: Home page is not loaded correctly.");
//	}
//	
//	driver.quit();
//}

//@Test
//public void C_CheckRemeberMe() throws InterruptedException {
//
//	WebDriver driver;
//	WebDriverManager.firefoxdriver().setup();
//	driver = new FirefoxDriver();
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
//		System.out.println("Passed: The user name is saved.");
//	}
//	else
//	{
//		System.out.println("Failed: The User name is not saved.");
//	}
//	
//	driver.quit();
//}
//
//	@Test
//	public void D_ForgotPassword_4A() throws InterruptedException {
//	
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/");
//		Thread.sleep(2000);
//		
//		WebElement forgotpwd = driver.findElement(By.id("forgot_password_link"));
//		forgotpwd.click();
//		
//		Thread.sleep(2000);
//		String pagetitle = driver.getTitle();
//		if(pagetitle.equals("Forgot Your Password | Salesforce"))
//			System.out.println("The Forgot Password page is displayed");
//		else
//			System.out.println("The Forgot Password page is not displayed");
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
//			System.out.println("The Check you Email page is displayed.");
//		else
//			System.out.println("The Check your Email page is not displayed.");
//		
//		
//		driver.quit();
//	}

//	@Test
//	public void D_ForgotPassword_4B() throws InterruptedException {
//	
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
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
//			System.out.println("The error message displayed is correct.");
//		else
//			System.out.println("The error message is not correctly displayed.");
//		
//		driver.quit();
//		
//	}
	
//	@Test
//	public void E_Tc06() throws InterruptedException {
//	
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
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
//		Thread.sleep(6000);
//		
//		WebElement upldlnk = driver.findElement(By.id("uploadLink"));
//		
//		
//		if(upldlnk.isDisplayed())
//			System.out.println("User Profile Page exists.");
//		else
//			System.out.println("User profile page does not exists.");
//		
//		WebElement editlnk = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
//		editlnk.click();
//		Thread.sleep(2000);
//		
//		WebElement edtpage = driver.findElement(By.id("contactInfoTitle"));
//		
//		if(edtpage.getText().equals("Edit Profile"))
//			System.out.println("Edit Profile page is displayed.");
//		else
//			System.out.println("Edit profile page is not displayed.");
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
//			System.out.println("Contact tab Exists.");
//		else
//			System.out.println("Contact tab does not exists.");
//		
//		WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
//		saveall.click();
//		
//		WebElement postlnk = driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]"));
//		postlnk.click();
//		
//		WebElement htmlbody = driver.findElement(By.xpath("/html/body"));
//		
//		htmlbody.click();
//		htmlbody.sendKeys("Testing is in progress.");
//		WebElement share = driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]"));
//		share.click();
//		
//		Thread.sleep(2000);
//		WebElement txt = driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[2]/div/div[5]/div/div[1]/div[1]/div[2]/div[1]/span/p"));
//		String txtdisp = txt.getText();
//		if(txtdisp.contains("Testing is in progress."))
//			System.out.println("The entered text is displayed.");
//		else
//			System.out.println("The entered text is not displayed.");
//		
//		
//		
//		//driver.quit();
//	}
	
	
//	@Test
//	public void F_Tc07() throws InterruptedException {
//	
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
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
//			System.out.println("My Settings page is displayed.");
//		else
//			System.out.println("My Setting page is not displayed.");
//		
//		WebElement perslnk = driver.findElement(By.xpath("//*[@id=\"PersonalInfo_font\"]"));
//		perslnk.click();
//		Thread.sleep(3000);
//		WebElement loginhis = driver.findElement(By.id("LoginHistory_font"));
//		loginhis.click();
//		
//		WebElement lgnhislnk = driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
//		if (lgnhislnk.isDisplayed())
//			System.out.println("The Login History Link is displayed.");
//		else
//			System.out.println("Login History Link is not displayed.");
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
//		WebElement selectlst = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[2]/div[2]/table/tbody/tr[4]/td/div/table/tbody/tr/td[3]/select/option[9]"));
//		String sellst = selectlst.getAttribute("value");
//		if(sellst.contains("Reports"))
//			System.out.println("The reports is selected.");
//		else
//			System.out.println("The reports is not selected.");
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
//			System.out.println("Settings have saved.");
//		else
//			System.out.println("Settings are not saved.");
//		
//		WebElement sendnme1 = driver.findElement(By.id("sender_name"));
//		String savedname = sendnme1.getAttribute("value");
//		
//		if(savedname.equals("Vidya Venkatesh12"))
//			System.out.println("The sender name is saved successfully.");
//		else
//			System.out.println("The sender name is not saved successfully.");
//		
//		WebElement sendmail1 = driver.findElement(By.id("sender_email"));
//		String svedemail = sendmail1.getAttribute("value");
//		if(svedemail.equals("vidyav82@gmail.com"))
//			System.out.println("The email is saved successfully");
//		else
//			System.out.println("The email is not saved properly.");
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
//		driver.switchTo().window("reminder");
//		WebElement dismissall = driver.findElement(By.xpath("//*[@id=\"dismiss_all\"]"));
//		if (dismissall.isDisplayed())
//			System.out.println("Test Reminder page is displayed.");
//		else
//			System.out.println("Test Reminder page is not displayed.");
//		
//		driver.switchTo().window("reminder").quit();
//		driver.quit();
//	}	
	
	@Test
	public void G_Tc08() throws InterruptedException {
	
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		WebElement uid = driver.findElement(By.id("username"));
		uid.sendKeys("test@tekarch.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("B@ngalore123");
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		LoginButn.click();
		Thread.sleep(5000);
		
		List<WebElement> UsrProlist = driver.findElements(By.className("mbrMenuItems"));
		String lst = UsrProlist.get(0).getAttribute("title");
		//List<String> lst = proflist.getAllSelectedOptions();
		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		UsrPro.click();
		
	}
}
