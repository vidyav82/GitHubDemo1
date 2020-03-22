package TestXero;

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
	
	@Test
	@Parameters({"username","password"})
	public void Test_ID01_Navigate_to_XERO(String uname,String pwd) throws Exception {
		
		CreateReport();
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
	
	@AfterMethod
	public void closeApps() {
		CloseBrowser();
		CloseReport();
	}

}
