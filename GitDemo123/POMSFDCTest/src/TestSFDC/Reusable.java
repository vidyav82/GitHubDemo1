package TestSFDC;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
import PageFactory.PageObjectsLogin;

public class Reusable {
	
	public static ExtentTest logger;
	public static ExtentReports report;
	public static WebDriver driver;

	public static void InitializeChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void InitializeFireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void InitializeEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		System.setProperty("webdriver.edge.driver","C:\\Users\\vasud\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}
	
	public static void OpenUrl(String url) {
		driver.get(url);
		
	}
	
	public static void CreateReport() {
		String fileName = new SimpleDateFormat("'SFDCReport_'YYYYMMddHHmm'.html'").format(new Date());
		String path = "C:\\Users\\vasud\\Desktop\\Selenium\\" + fileName;
		report = new ExtentReports(path);
		}

	public static void CloseBrowser() {
		driver.quit();
	}

	public static void CloseReport() {
		report.flush();
	}
	
	public static void SelectDropdown(WebElement obj, String objName) 
	{

		if (obj.isDisplayed()) 
		{
			System.out.println("Pass: " + objName + " is  selected");
			obj.click();
		} 
		else 
		{

			System.out.println("Fail:" + objName + " is not present.Please chk application");
				
		}
	}
	
	public static void SwitchFrame(String id) {
		driver.switchTo().frame(id);
		logger.log(LogStatus.PASS,  "We can switch to the " + id + " frame" );
		
	}
	
	public static void SwitchFrame(WebElement element) {
		driver.switchTo().frame(element);
		logger.log(LogStatus.PASS, "We can switch to the frame");
	}

	public static void SwitchFrame() {
		driver.switchTo().defaultContent();
		logger.log(LogStatus.PASS, "We can switch to the Default frame");
	}
	public static void SwitchFrameQuit(String id) {
		driver.switchTo().frame(id).quit();
		logger.log(LogStatus.PASS,  "We can switch to the " + id + " frame" );
		
	}
	
	
	public static void MouseOver(WebDriver driver,WebElement obj) {
		if(obj.isDisplayed()) 
		{
	   Actions action=new Actions(driver);
	   action.moveToElement(obj).build().perform();
		logger.log(LogStatus.PASS,  "object is present" );
		}
	 else {
			
			logger.log(LogStatus.FAIL,  "obj is not present.Please chk application" );
		}
	}
	
	public static void EnterText(WebElement element, String text, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.sendKeys(text);
		}
	}
	
	public static void ClearText(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Textbox is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Textbox is found");
			element.clear();
		}
	}
	
	public static void Click(WebElement element, String objName) {
		if (element == null || !element.isDisplayed()) {
			logger.log(LogStatus.ERROR, objName + " Element is not found.");
		} else {
			logger.log(LogStatus.INFO, objName + " Element is found");
			element.click();
		}
	}
	
	public static void Verify_VisibleText(WebElement element,String ExptedMessage, String Message) {
		
		String ActualMessage = element.getText();
		
		if(ActualMessage.equals(ExptedMessage))
		
			logger.log(LogStatus.PASS,Message + "  is visible.");
			else
			logger.log(LogStatus.FAIL,Message + "  is  not visible.");	
				
	}
	
	public static void Verify_TextContains(WebElement element,String ExptedMessage) {
		
		String ActualMessage = element.getText();
		System.out.println(ActualMessage);
		if(ActualMessage.contains(ExptedMessage))
		
			logger.log(LogStatus.PASS,ExptedMessage + "  is visible.");
			else
			logger.log(LogStatus.FAIL,ExptedMessage + "  is  not visible.");	
				
	}
	
	public static void VerifyTitleMatches(String ActualTitle,String ExpTitle,String PageName)
	{
		if(ActualTitle.equals(ExpTitle))
			logger.log(LogStatus.PASS,PageName+" : The title is loading correctly.");
				else
			logger.log(LogStatus.FAIL,PageName+" : The title is loading correctly.");	
	}
	
	public static void Loginsalesforce() throws InterruptedException
	{
		OpenUrl("https://login.salesforce.com");
		Thread.sleep(7000);
		logger.log(LogStatus.INFO, "URL opened successfully");
		
		WebElement uid = driver.findElement(By.id("username"));
		EnterText(uid, "test@tekarch.com", "username");
				
		WebElement pwd = driver.findElement(By.id("password"));
		EnterText(pwd, "B@ngalore123", "password");
		
		
		WebElement LoginButn = driver.findElement(By.id("Login"));
		Click(LoginButn,"Login Button");
	}
	
	public static void VerifyLinkIsDisplayed(WebElement element, String Linkname) {
		
		if(element.isDisplayed())
			logger.log(LogStatus.PASS,Linkname+ " is Displayed.");
		else
			logger.log(LogStatus.FAIL,Linkname+" is not Displayed.");
		
	}
	
	public static void VerifyElementIsEnabled(WebElement element, String ElementName)
	{
		if(element.isEnabled())
			logger.log(LogStatus.PASS,ElementName + " is Enabled.");
		else
			logger.log(LogStatus.FAIL,ElementName +" is not Enabled.");
	}
	
	public static void VerifyStringEqual(String Expected, String Actual,String Message)
	{
		if(Expected.equals(Actual))
			logger.log(LogStatus.PASS,Message + " is Matched.");
		else
			logger.log(LogStatus.FAIL,Message +" is not Matched.");
	}
	
	public static void ImplicitWait(int timeinsec) {
		driver.manage().timeouts().implicitlyWait(timeinsec, TimeUnit.SECONDS);
		
	}
	public static WebElement SelectValue(WebElement element,String value) {
		Select lstval = new Select(element);
		lstval.selectByValue(value);
		WebElement option = lstval.getFirstSelectedOption();
		return option;
	}
	public static void SelectaValue(WebElement element,String value) {
		Select lstval = new Select(element);
		lstval.selectByValue(value);
		
	}
	public static void VerifyDisplayedValue(WebElement element, String expectedValue) {
		
		String ActualValue = element.getAttribute("value");
		
		if(ActualValue.equals(expectedValue))
			logger.log(LogStatus.PASS,element+ "value is Displayed correctly.");
		else
			logger.log(LogStatus.FAIL,element+"value is not Displayed correctly.");
		
	}
	public static void SwitchToWin(String window) {
		driver.switchTo().window(window);
	}
	public static void verifyUrlMatches(String expecurl) {
		String geturl = driver.getCurrentUrl();
				
		if (geturl.equals(expecurl))
			logger.log(LogStatus.PASS,"Test Reminder page is displayed.");
		else
			logger.log(LogStatus.FAIL,"Test Reminder page is not displayed.");
	}
	
}
