package TestXero;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestXero extends ReusableXero{
	
	/* Before Method to initialize the browser. 
	 * Set the browser parameter either as chrome or edge or firefox to open the respective browsers.  */
	@BeforeMethod
	@Parameters({"browser"})
	public void BrowserInitialize(String Browser) 
	{
		if(Browser.equalsIgnoreCase("firefox")) {
			InitializeFireFoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		else if(Browser.equalsIgnoreCase("chrome")) {
			InitializeChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("edge")) {
			InitializeIEEdgeDriver();
		}
				
	}
	
	/* This test will verify the login to Xero Application using the right uid and pwd.*/
	@Test
	@Parameters({"username","password"})
	public void Test_ID01_Navigate_to_XERO(String uname,String pwd) throws Exception {
		
		CreateReport(); /* Function to create and initiatize Extent Report.*/
		logger = report.startTest("Test_ID01_Navigate_to_XERO");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement LoginBtn = driver.findElement(By.linkText("Login"));
		Click(LoginBtn,"Login Button Start"); 
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		EnterText(userid,uname, "Username");
		
		WebElement pswrd = driver.findElement(By.xpath("//input[@id='password']"));
		EnterText(pswrd,pwd, "Password");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='submitButton']"));
		Click(login,"Login");
		WebDriverWait wait = new WebDriverWait(driver,100);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		String Exptitle = "Xero | Dashboard | tekarch ";
		String ActTitle = driver.getTitle();
		VerifyTitleMatches(ActTitle,Exptitle,"Xero Home Page");
				
		logger.log(LogStatus.INFO, "Home Page Screen Shot." + logger.addScreenCapture(takeScreenShot("Test_ID01_Navigate_to_XERO")));
		
	}
	
	/*This test case verifies error message when wrong password is entered. */
	@Test
	@Parameters({"username","password1"})
	public void Test_ID01_Incorrect_Password(String uname,String pwd) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CreateReport();
		logger = report.startTest("Test_ID01_Incorrect_Password");
		
		
		OpenUrl("https://www.xero.com/us/");
		
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
//		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		
		WebElement LoginBtn = driver.findElement(By.linkText("Login"));
		Click(LoginBtn,"Login Button Start");
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		EnterText(userid,uname, "Username");
		
		WebElement pswrd = driver.findElement(By.xpath("//input[@id='password']"));
		EnterText(pswrd,pwd, "Password");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='submitButton']"));
		Click(login,"Login");
		
		WebElement Errortab = driver.findElement(By.xpath("//div[@class='x-boxed warning']"));
		String ExptMsg = "Your email or password is incorrect ";
		Verify_VisibleText(Errortab,ExptMsg, "Error message for wrong Paassword.");
				
		logger.log(LogStatus.INFO, "Login wrong Password screen." + logger.addScreenCapture(takeScreenShot("Test_ID01_Incorrect_Password")));
		
	}
	
	/*This Test verifies the Forgot password page. Message displayed when we enter the mail id in forgot password page.*/
	@Test
	@Parameters({"username","password"})
	public void Test_ID01_ForgotPwd(String uname,String pwd) throws Exception {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CreateReport();
		logger = report.startTest("Test_ID01_ForgotPwd");
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement LoginBtn = driver.findElement(By.linkText("Login"));
		Click(LoginBtn,"Login Button Start");
		
		
		WebElement Forgotpwd = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		Click(Forgotpwd,"Forgot Password Link");
		
		
		String ExpTitle = "Forgotten Password";
		String ActTitle = driver.getTitle();
		VerifyTitleMatches(ActTitle,ExpTitle,"Forgot Passwrod page.");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='UserName']"));
		EnterText(email,uname, "Email id");
		
		WebElement sendbtn = driver.findElement(By.xpath("//span[@class='text']"));
		Click(sendbtn,"Send Link");
		
		WebElement DisplayMsg = driver.findElement(By.xpath("//p[contains(text(),'A link to reset your password has been sent to:')]"));
		String ExptMsg = "A link to reset your password has been sent to:vidyav82@gmail.com";
		Verify_VisibleText(DisplayMsg,ExptMsg, "Forgot Password Message.");
				
		logger.log(LogStatus.INFO, "Forgot Password screen." + logger.addScreenCapture(takeScreenShot("Test_ID01_ForgotPwd")));
		
	}
	
	/*This test case verifies the Free Trial page.*/
	@Test
	public void Test_ID02_SignUptoXDC() throws Exception {
		
		CreateReport();
		logger = report.startTest("Test_ID02_SignUptoXDC");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement FreeTrial = driver.findElement(By.linkText("Free trial"));
		Click(FreeTrial,"Free Trial Button");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle = "Signup for Xero - Free Trial | Xero US";
		String ActTitle = driver.getTitle();
		VerifyTitleMatches(ActTitle,Exptitle,"Free Trial Page");
				
		logger.log(LogStatus.INFO, "Free Trial Page Screen Shot." + logger.addScreenCapture(takeScreenShot("Test_ID02_SignUptoXDC")));
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='FirstName']"));
		ElementDisplayed(firstname, "Firstname textbox");
		EnterText(firstname,"Test12", "Firstname");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
		ElementDisplayed(lastname, "Lastname textbox");
		EnterText(lastname,"Last12", "Lastname");
		
		
		WebElement emailid = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		ElementDisplayed(emailid, "Email id textbox");
		EnterText(emailid,"Test12@gmail.com", "Email id");
		
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
		ElementDisplayed(phone, "Phone Num textbox");
		EnterText(phone,"9879765467", "Phone Number");
		
		
		WebElement countrylist = driver.findElement(By.xpath("//select[@name='LocationCode']"));
		Select country = new Select(countrylist);
		country.selectByVisibleText("United States");
		
		WebElement terms = driver.findElement(By.xpath("//input[@name='TermsAccepted']"));
		Click(terms,"Terms Checkbox");
		
						
		logger.log(LogStatus.INFO, "Free Trial Screen Shot." + logger.addScreenCapture(takeScreenShot("Test_ID02_FreeTrialPage")));
		
	}
	
	/*This test case verifies the Free Trial page for the error messages for the fields if not entered and entered submit button.*/
	@Test
	public void Test_ID02_FreeTrialError() throws Exception {
		
		CreateReport();
		logger = report.startTest("Test_ID02_FreeTrialError");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement FreeTrial = driver.findElement(By.linkText("Free trial"));
		Click(FreeTrial,"Free Trial Button");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle = "Signup for Xero - Free Trial | Xero US";
		String ActTitle = driver.getTitle();
		VerifyTitleMatches(ActTitle,Exptitle,"Free Trial Page");
		
		WebElement Submit = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		Click(Submit,"Submit Button");
		
		WebElement fnameerr = driver.findElement(By.xpath("//span[@id='signup-form-error-message-1']"));
		Verify_VisibleText(fnameerr,"First name can't be empty", "Firstname is empty Error");
		
		WebElement lnameerr = driver.findElement(By.xpath("//span[@id='signup-form-error-message-2']"));
		Verify_VisibleText(lnameerr,"Last name can't be empty", "Lastname is empty Error");
		
		WebElement emailerr = driver.findElement(By.xpath("//span[@id='signup-form-error-message-3']"));
		Verify_VisibleText(emailerr,"Email text can't be empty", "Email is empty Error");
		
		WebElement phoneerr = driver.findElement(By.xpath("	//span[@id='signup-form-error-message-4']"));
		Verify_VisibleText(phoneerr,"Phone text can't be empty", "Phone is empty Error");
		
		logger.log(LogStatus.INFO, "Free Trial Screen Shot." + logger.addScreenCapture(takeScreenShot("Test_ID02_FreeTrialError")));
		
	}
	
	/*This test case verifies the terms and conditions page if displayed properly or not.*/
	@Test
	public void Test_ID02_FreeTrialTerms() throws Exception {
		
		CreateReport();
		logger = report.startTest("Test_ID02_FreeTrialTerms");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement FreeTrial = driver.findElement(By.linkText("Free trial"));
		Click(FreeTrial,"Free Trial Button");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle = "Signup for Xero - Free Trial | Xero US";
		String ActTitle = driver.getTitle();
		VerifyTitleMatches(ActTitle,Exptitle,"Free Trial Page");
		
		WebElement terms = driver.findElement(By.linkText("terms"));
		Click(terms,"Terms Link");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle1 = "Terms of Use | Xero US";
		String ActTitle1 = driver.getTitle();
		VerifyTitleMatches(ActTitle1,Exptitle1,"Terms Page");
		
		WebElement privacy = driver.findElement(By.linkText("privacy"));
		Click(privacy,"Privacy Link");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle2 = "Privacy Notice | Xero US";
		String ActTitle2 = driver.getTitle();
		VerifyTitleMatches(ActTitle2,Exptitle2,"Privacy Page");
		
		WebElement offerdet = driver.findElement(By.linkText("offer details"));
		Click(offerdet,"Offer Details Link");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle3 = "Offer details | Xero US";
		String ActTitle3 = driver.getTitle();
		VerifyTitleMatches(ActTitle3,Exptitle3,"Offer Details Page");
		
		
		WebElement bookkeep = driver.findElement(By.linkText("accountant or bookkeeper"));
		Click(bookkeep,"Book Keeper Link");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		String Exptitle4 = "Sign up for the Xero Partner Program | Xero US";
		String ActTitle4 = driver.getTitle();
		VerifyTitleMatches(ActTitle4,Exptitle4,"Accountant or Bookkeeper Page");
		
	}
	
	/*This test verifies all the tabs and lists within each tab and page displayed properly or not.*/
	@Test
	@Parameters({"username","password"})
	public void Test_ID03_TestAllTabs(String uname,String pwd) throws Exception {
		
		CreateReport();
		logger = report.startTest("Test_ID03_TestAllTabs");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		OpenUrl("https://www.xero.com/us/");
//		WebDriverWait wait = new WebDriverWait(driver,10000);
//		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		
		logger.log(LogStatus.INFO, "URL opened successfully.");
		
		WebElement LoginBtn = driver.findElement(By.linkText("Login"));
		Click(LoginBtn,"Login Button Start");
		
		WebElement userid = driver.findElement(By.xpath("//input[@id='email']"));
		EnterText(userid,uname, "Username");
		
		WebElement pswrd = driver.findElement(By.xpath("//input[@id='password']"));
		EnterText(pswrd,pwd, "Password");
		
		WebElement login = driver.findElement(By.xpath("//button[@id='submitButton']"));
		Click(login,"Login");
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver,500);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		/*The below code will verify the home page title. */
		String Exptitle = "Xero | Dashboard | tekarch";
		String ActTitle = driver.getTitle().trim();
		
		VerifyTitleMatches(ActTitle,Exptitle,"Xero Home Page");
				
		logger.log(LogStatus.INFO, "Home Page Screen Shot." + logger.addScreenCapture(takeScreenShot("Test_ID03_TestAllTabs")));
		
		/*The below code will verify the banner message in Xero home page. */
		WebElement bannermsg = driver.findElement(By.xpath("//span[@class='xrh-banner--text']"));
		String ExpdMsg = "You’re using a trial account.";
		Verify_VisibleText(bannermsg,ExpdMsg, "Banner Message");
		
		/*The below code will verify the title in Dashboard page. */
		WebElement Dashboard = driver.findElement(By.xpath("//a[@name='navigation-menu/dashboard']"));
		Click(Dashboard,"Dashboard Tab");
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		String Exptitle1 = "Xero | Dashboard | tekarch";
		String ActTitle1 = driver.getTitle().trim();
		VerifyTitleMatches(ActTitle1,Exptitle1,"Xero Dashboard Page");
		
		/*The below code will verify the Accounting tab and list items within the Accounting tab. */
		WebElement Accounting = driver.findElement(By.xpath("//button[@name='navigation-menu/accounting']"));
		Click(Accounting,"Accounting Tab");
		
		WebElement AccountingList = driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-nav--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionleft']//div[@class='xrh-dropdown--body']"));
		List<WebElement> Heading = AccountingList.findElements(By.xpath("//div//ol[@class=\"xrh-verticalmenu\"][@role=\"navigation\"][@aria-label]"));
		
		for(int i=0;i<Heading.size();i++) {
			
			logger.log(LogStatus.INFO, "The Heading Items In Accounting Tab");
			logger.log(LogStatus.INFO, Heading.get(i).getAttribute("aria-label"));
			
		}
		
		List<WebElement> items = Heading.get(0).findElements(By.xpath("//div//ol//li//a[@class=\"xrh-verticalmenuitem--body\"]"));
			for(int j=0;j<items.size();j++)
			{
				logger.log(LogStatus.INFO, "The Items In Accounting Tab");
				logger.log(LogStatus.INFO, items.get(j).getText());
				
			}
			
		/*The below code will verify the Reports tab and Title in the Reports page. */
		WebElement Reports = driver.findElement(By.xpath("//div//div//ol//li//a[@class=\"xrh-verticalmenuitem--body\"][contains(text(),'Reports')]"));
		Click(Reports,"Reports");
		Thread.sleep(8000);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		String Exptitle2 = "Xero | Reports | tekarch";
		String ActTitle2 = driver.getTitle().trim();
		
		VerifyTitleMatches(ActTitle2,Exptitle2,"Xero Reports Page");
		
		/*The below code will verify the Contacts tab and Title in the AllContacts page. */
		
		WebElement Contacts = driver.findElement(By.xpath("//button[@name='navigation-menu/contacts']"));
		Click(Contacts,"Contacts Tab");
		
		WebElement AllContacts = driver.findElement(By.xpath("//div//div//ol//li//a[@class=\"xrh-verticalmenuitem--body\"][contains(text(),'All contacts')]"));
		Click(AllContacts,"AllContacts Tab");
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		String Exptitle3 = "Xero | Contacts | tekarch";
		String ActTitle3 = driver.getTitle();
		VerifyTitleMatches(ActTitle3,Exptitle3,"Xero All Contacts Page");
		
		/*The below code will verify the TekArch Tab and Title in the TekArch tab. */
		WebElement tekArch = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Click(tekArch,"TekArch Link");
		
		/*The below code will verify the Settings Tab and Title in the Settings page. */
		WebElement Settings = driver.findElement(By.xpath("//div//div//ol//li//a[@class=\"xrh-verticalmenuitem--body\"][contains(text(),'Settings')]"));
		Click(Settings,"Settings Link");
		Thread.sleep(8000);
		driver.manage().timeouts().pageLoadTimeout(80, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		String Exptitle4 = "Xero | Organization settings | tekarch";
		String ActTitle4 = driver.getTitle().trim();
		
		VerifyTitleMatches(ActTitle4,Exptitle4,"Xero Settings Page");
		
		WebElement tekArch1 = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		Click(tekArch1,"TekArch Link");
		
		/*The below code will verify the Files Tab and Title in the Files page. */
		WebElement Files = driver.findElement(By.xpath("//div//div//ol//li//a[@class=\"xrh-verticalmenuitem--body\"][contains(text(),'Files')]"));
		Click(Files,"Files Link");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.titleContains(driver.getTitle()));
		String Exptitle5 = "Xero | Files | tekarch";
		String ActTitle5 = driver.getTitle();
		VerifyTitleMatches(ActTitle5,Exptitle5,"Xero Files Page");
		
		/*The below code will verify the New(+) Tab and list items in New Tab. */
		WebElement NewBtn = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ol[2]/li[1]/button[1]/div[1]"));
		Click(NewBtn,"+ Button");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		Thread.sleep(10000);
		WebElement listitem = driver.findElement(By.xpath("//div[@class='xrh-dropdown-layout xrh-addon--dropdown xrh-dropdown-is-open xrh-dropdown-is-opening xrh-dropdown-positionright']//div[@class='xrh-dropdown--panel']"));
		List<WebElement> listol = listitem.findElements(By.tagName("ol"));
		
		for(int i=0;i<listol.size();i++) {
			
			logger.log(LogStatus.INFO, "The Items In New Tab");
			logger.log(LogStatus.INFO, listol.get(i).getText());
			
		}
		
		WebElement Dashboard1 = driver.findElement(By.xpath("//a[@name='navigation-menu/dashboard']"));
		Click(Dashboard1,"Dashboard Tab");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		Thread.sleep(8000);
		
		/*The below code will verify the Search Tab and the search text box in Search Tab. */
		WebElement SrchBtn = driver.findElement(By.cssSelector("body.xui-body.x-sandbox:nth-child(2) header.xrh-header.xrh-header-business.xrh-header-wide div.xrh-header--main:nth-child(2) ol.xrh-addons.xrh-header-background-color li.xrh-addon:nth-child(2) button.xrh-button.xrh-addon--iconbutton.xrh-header--iconbutton.xrh-focusable--parent.xrh-focusable--parent-is-active:nth-child(1) > div.xrh-focusable--child.xrh-iconwrapper"));
		Click(SrchBtn,"Search Button");
		Thread.sleep(8000);
		
		WebElement SearchSec = driver.findElement(By.xpath("//input[@id='queryInput']"));
		VerifyLinkIsDisplayed(SearchSec, "Search Section");
		
		/*The below code will verify the Help Tab and the list items in Help Tab. */
		WebElement HelpBtn = driver.findElement(By.xpath("//button[@class='xrh-button xrh-addon--iconbutton xrh-header--iconbutton xrh-focusable--parent xrh-focusable--parent-is-active']//div[@class='xrh-focusable--child xrh-iconwrapper']"));
		Click(HelpBtn,"Help Button");
		
		WebElement helparea = driver.findElement(By.xpath("//input[@id='menu_help']"));
		VerifyLinkIsDisplayed(helparea, "Help Section");
		
		WebElement helplist = driver.findElement(By.xpath("//div[@class='xn-h-task-list xn-h-task-list-narrow']"));
		List<WebElement> listitems = helplist.findElements(By.tagName("ul"));
		
		for(int i=0;i<listitems.size();i++)
		{
			
			logger.log(LogStatus.INFO, "The HelpItems in List");
			logger.log(LogStatus.INFO, listitems.get(i).getText());
		}
		
	}
	
	/*This method will execute after every @Test Method to close the Browser and Close Extent Report.*/
	@AfterMethod
	public void closeApps() {
		CloseBrowser();
		CloseReport();
	}

}
