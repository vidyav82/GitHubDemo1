import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable {
	
	static ExtentTest logger;
	static ExtentReports report;
	static WebDriver driver;

	public static void InitializeChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void InitializeFireFoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
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
		System.out.println("Pass: we can switch to the " + id + " frame");
	}
	
	public static void SwitchFrame(WebElement element) {
		driver.switchTo().frame(element);
		System.out.println("Pass: we can switch to the frame");
	}

	public static void SwitchFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Pass: we can switch to the frame");
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

}
