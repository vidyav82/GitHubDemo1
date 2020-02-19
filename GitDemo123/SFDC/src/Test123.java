import java.text.SimpleDateFormat;
import java.util.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Test123<SelectElement> {

@Test
public void Testfields() throws InterruptedException{
	
//	ExtentTest logger;
//	ExtentReports report;
//	
	WebDriver driver;
//	WebDriverManager.chromedriver().setup();
//	driver = new ChromeDriver();
	
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.get("https://login.salesforce.com/");
	Thread.sleep(2000);
	
	WebElement uid = driver.findElement(By.id("username"));
	uid.sendKeys("test@tekarch.com");
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("B@ngalore123");
	
	WebElement LoginButn = driver.findElement(By.id("Login"));
	LoginButn.click();
	Thread.sleep(6000);
	

	WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
	UsrPro.click();
	
	WebElement myproflnk = driver.findElement(By.linkText("My Profile"));
	myproflnk.click();
	
	Thread.sleep(10000);
	
	WebElement postlink = driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
	postlink.click();
	
	WebElement htmlbody = driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
	driver.switchTo().frame(htmlbody);
	WebElement textspace = driver.findElement(By.xpath("/html/body"));
	textspace.click();
	textspace.sendKeys("Testing is in progress.");
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
	share.click();
	
	
}

//@Test TC6_SelectMyProfile() throws InterruptedException {
//	
//	logger = report.startTest("TC6_SelectMyProfile");
//
//	OpenUrl("https://login.salesforce.com");
//	WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
//	EnterText(Uname, "mithun.r@tekarch.com", "UserName");
//	WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
//	pwd.clear();
//	EnterText(pwd, "Test4321", "Password");
//	WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
//    Click(login, "login");
//    
//    WebElement UserMenu = driver.findElement(By.xpath("//div[@id='userNav']"));
//	SelectDropdown(UserMenu, "UserMenu");
//	WebElement MyProfile = driver.findElement(By.xpath("//a[@title='My Profile']"));
//	Click(MyProfile, "MyProfile");
//	Thread.sleep(9000);	
//	
//	//Edit Profile link
//	WebElement Editprofile = driver.findElement(By.xpath("//a[contains(@class,'contactInfoLaunch editLink')]//img"));
//	Click(Editprofile, "Editlink");
//
//	SwitchFrame("contactInfoContentId");
//	driver.findElement(By.id("aboutTab")).click();
//	
//	WebElement lastname=driver.findElement(By.id("lastName"));
//	lastname.clear();
//
//	EnterText(lastname, "Deekshith", "lastname");
//	System.out.println("LastName is Entered");
//	//WebElement bodyElement=driver.findElement(By.xpath("//div[contains(@class,'zen-body')]"));
//	WebElement bodyElement= driver.findElement(By.xpath("//input[@value='Save All']"));
//	Click(bodyElement, "bodyElement");
//	
//	//Edit Post link
//	Thread.sleep(4000);
//	WebElement postlink = driver.findElement(By.id("publisherAttachTextPost"));
//	Click(postlink, "postlink");
//	
//	
//	WebElement postIframe=driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]"));
//	SwitchFrame(postIframe);
//
//	//driver.switchTo().frame(postIframe);
//	WebElement postBody=driver.findElement(By.xpath("//html[1]/body[1]"));
//	Click(postBody, "postBody");
//	EnterText(postBody, "This is posted Text", "PostText");
//	
//	
//	SwitchFrame();
//	WebElement ShareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']")); 
//	Click(ShareButton, "ShareButton");
//	System.out.println("Text Posted is shared");
//
//	Thread.sleep(3000);
//	WebElement FileLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
//	Click(FileLink, "FileLink");
//	WebElement UploadFile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
//	Click(UploadFile, "UploadFile");
//	
//	Thread.sleep(3000);
//	WebElement choosefile = driver.findElement(By.xpath("//input[@id='chatterFile']"));
//	//EnterText(choosefile, "C:\\Users\\admin\\Desktop\\SFDC 37 Testcases.xlsx", "choosefile");
//	EnterText(choosefile, "/Users/vinod/Data/Code/VinodBK/report.html", "choosefile");
//	
//	WebElement Share = driver.findElement(By.id("publishersharebutton"));
//	Click(Share, "ShareButton");
//	
//	Thread.sleep(10000);
//
//
//	//Uploading photo
//	Thread.sleep(3000);
//	WebElement moderator = driver.findElement(By.id("displayBadge"));
//	//clickObj(AddPhoto, "AddPhoto");
//	MouseOver(driver, moderator);
//	WebElement AddPhotolink = driver.findElement(By.xpath("//a[@id='uploadLink']"));
//	Click(AddPhotolink, "AddPhotolink");
//	SwitchFrame("uploadPhotoContentId");
//	Thread.sleep(3000);
//	WebElement choosefileoption = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
//	EnterText(choosefileoption, "/Users/vinod/Downloads/download.jpeg", "choosefileoption");
//	WebElement save = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
//	Click(save, "save");
//	System.out.println("TC06_MyProfile completed successfully");
//	Thread.sleep(3000);
//	WebElement save2 = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
//	Click(save2,"Save Crop");
//	
//	Thread.sleep(15000);
//	driver.close();
//	
//}

}