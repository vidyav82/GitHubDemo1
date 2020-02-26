//import java.awt.Robot;
//import java.awt.AWTException;
//
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import java.awt.event.KeyEvent;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
////import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;
//
//import org.openqa.selenium.support.*;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import okhttp3.internal.http2.Header;
//
//public class SFDC_UserMenuDropDown extends Reusable{
//	
//	@Test
//	public void E_Tc06() throws InterruptedException {
//	
//		InitializeChromeDriver();
//		CreateReport();
//		
//		logger = report.startTest("E_Tc06");
//		
//		Loginsalesforce();
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		Click(UsrPro,"User Navigation Link");
//		
//		WebElement myproflnk = driver.findElement(By.linkText("My Profile"));
//		Click(myproflnk,"My Profile");
//		
//		Thread.sleep(8000);
//		
//		WebElement upldlnk = driver.findElement(By.id("uploadLink"));
//		
//		VerifyLinkIsDisplayed(upldlnk,"User Profile Page");
//				
//		
//		WebElement editlnk = driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a"));
//		Click(editlnk,"Edit Link");
//		
//		Thread.sleep(5000);
//		
//		
//		WebElement edtpage = driver.findElement(By.id("contactInfoTitle"));
//		
//		Verify_VisibleText(edtpage,"Edit Profile", "Edit Profile page");
//		
//		driver.switchTo().frame("contactInfoContentId");
//		
//		
//		WebElement abouttab = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
//		Click(abouttab,"About Tab");
//		
//		WebElement lastName = driver.findElement(By.id("lastName"));
//		lastName.clear();
//		EnterText(lastName, "Venkatesh1", "Last Name text");	
//		
//		
//		WebElement contab = driver.findElement(By.xpath("//*[@id=\"contactTab\"]/a"));
//		VerifyElementIsEnabled(contab, "Contact Tab");
//		
//		
//		WebElement saveall = driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
//		Click(saveall,"Save All");
//		
//		WebElement postlink = driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']"));
//		Click(postlink,"Post Link");
//	
//		WebElement htmlbody = driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
//		driver.switchTo().frame(htmlbody);
//		
//		WebElement textspace = driver.findElement(By.xpath("/html/body"));
//		textspace.click();
//		EnterText(textspace, "Testing is in progress.", "Rich Text Editor");
//		Thread.sleep(2000);
//		driver.switchTo().defaultContent();
//		
//		WebElement share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
//		Click(share,"Share");
//		Thread.sleep(2000);
//				
//		WebElement txt = driver.findElement(By.className("cxfeeditemtextadditional"));
//		Verify_VisibleText(txt,"Testing is in progress.", "The entered text");
//		
//		WebElement FileLink = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'File')]"));
//		Click(FileLink,"File Link");
//		
//		WebElement uploadFile = driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']"));
//		Click(uploadFile,"Upload File Link");
//		
//		WebElement browselink = driver.findElement(By.id("chatterFile"));
//		//Click(browselink,"Browse Link");
//		EnterText(browselink, "C:\\Users\\Public\\TestDoc.txt", "Browse File");
//		
//				
//		WebElement Share = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
//		Click(Share, "ShareButton");
//		
//		Thread.sleep(8000);
//		
//		WebElement posttxt = driver.findElement(By.className("feeditemfirstentity"));
//		StringBuffer username = new StringBuffer(posttxt.getText());
//		StringBuffer expected1 = username.append(" posted a file.");
//		
//		String actualmsg = "Vidya Venkatesh1 posted a file.";
//		String expectedmsg = new String(expected1); 
//		
//		
//		VerifyStringEqual(expectedmsg, actualmsg,"The File Upload message : ");
//		
//		WebElement moderator = driver.findElement(By.id("displayBadge"));
//		//clickObj(AddPhoto, "AddPhoto");
//		MouseOver(driver, moderator);
//		WebElement AddPhotolink = driver.findElement(By.xpath("//a[@id='uploadLink']"));
//		Click(AddPhotolink, "AddPhotolink");
//		SwitchFrame("uploadPhotoContentId");
//		Thread.sleep(3000);
//		WebElement choosefileoption = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
//		EnterText(choosefileoption, "C:\\Users\\Public\\TestPic.jpg", "choosefileoption");
//		WebElement save = driver.findElement(By.id("j_id0:uploadFileForm:uploadBtn"));
//		Click(save, "save");
//	
//		Thread.sleep(3000);
//		WebElement save2 = driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
//		Click(save2,"Save Crop");
//		
//		Thread.sleep(15000);
//
//		
//		CloseReport();
//		CloseBrowser();
//	}
//	
//	@Test
//	public void F_Tc07() throws InterruptedException {
//	
//		InitializeChromeDriver();
//		CreateReport();
//		
//		logger = report.startTest("F_Tc07");
//		
//		Loginsalesforce();
//		
//		WebElement UsrPro = driver.findElement(By.id("userNavLabel"));
//		Click(UsrPro, "User Navigation Link");
//		
//		WebElement mySetlnk = driver.findElement(By.linkText("My Settings"));
//		Click(mySetlnk, "My Settings");
//		Thread.sleep(6000);
//		
//		WebElement mysetpgelnk = driver.findElement(By.xpath("//*[@id=\"PersonalSetup_font\"]/span[2]"));
//		VerifyLinkIsDisplayed(mysetpgelnk,"My Settings page");
//		
//				
//		WebElement perslnk = driver.findElement(By.xpath("//*[@id=\"PersonalInfo_font\"]"));
//		Click(perslnk, "Personal Info");
//		Thread.sleep(8000);
//		
//		WebElement loginhis = driver.findElement(By.id("LoginHistory_font"));
//		Click(loginhis, "Login History");
//		
//		WebElement lgnhislnk = driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
//		VerifyLinkIsDisplayed(lgnhislnk,"Login History Link");
//		
//		
//		WebElement displaylnk = driver.findElement(By.id("DisplayAndLayout_font"));
//		Click(displaylnk, "DisplayAndLayout");
//		Thread.sleep(5000);
//		
//		WebElement custfnt = driver.findElement(By.id("CustomizeTabs_font"));
//		Click(custfnt, "Customize Tab");
//		Thread.sleep(3000);
//		
//		WebElement custappdrop = driver.findElement(By.xpath("//*[@id=\"p4\"]/option[9]"));
//		Click(custappdrop, "CustomerAppDropdown");
//		
//		
//		WebElement reports = driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[43]"));
//		Click(reports, "Reports");
//		
//		WebElement add_btn = driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
//		Click(add_btn, "Add Button");
//		
//		WebElement selectlst = driver.findElement(By.cssSelector("#duel_select_1"));
//		Select lstval = new Select(selectlst);
//		lstval.selectByValue("report");
//		WebElement option = lstval.getFirstSelectedOption();
//		String defaultItem = option.getText();
//		VerifyStringEqual(defaultItem, "Reports","The reports selected is");
//					
//		WebElement savebtn = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
//		Click(savebtn, "Save Button");
//		
//		WebElement email = driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]"));
//		email.click();
//		
//		WebElement emailset = driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
//		Click(emailset, "Email Set");
//		
//		WebElement sendnme = driver.findElement(By.id("sender_name"));
//		sendnme.clear();
//		EnterText(sendnme, "Vidya Venkatesh12", "sender name");
//		
//		
//		WebElement sendmail = driver.findElement(By.id("sender_email"));
//		sendmail.clear();
//		EnterText(sendmail, "vidyav82@gmail.com", "sender email");
//		
//		
//		WebElement radiobtn = driver.findElement(By.id("auto_bcc1"));
//		Click(radiobtn, "Radio Button");
//		
//		WebElement savebtn1 = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
//		Click(savebtn1, "Save Button");
//		Thread.sleep(6000);
//		
//		WebElement msg1 = driver.findElement(By.xpath("//*[@id=\"meSaveCompleteMessage\"]/table/tbody/tr/td[2]/div"));
//		String savmsg1 = msg1.getText();
//		VerifyStringEqual(savmsg1, "Your settings have been successfully saved.","Settings Save message");
//						
//		WebElement sendnme1 = driver.findElement(By.id("sender_name"));
//		String savedname = sendnme1.getAttribute("value");
//		VerifyStringEqual(savedname, "Vidya Venkatesh12","The sender name is saved");
//		
//		
//		WebElement sendmail1 = driver.findElement(By.id("sender_email"));
//		String svedemail = sendmail1.getAttribute("value");
//		VerifyStringEqual(svedemail, "vidyav82@gmail.com","The email is saved");
//		
//				
//		WebElement calendars = driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders_font\"]"));
//		Click(calendars, "Calendars");
//		
//		WebElement activityremin = driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]"));
//		Click(activityremin, "Reminders");
//		
//		WebElement openrem = driver.findElement(By.xpath("//*[@id=\"testbtn\"]"));
//		Click(openrem, "Reminders");
//		
//		Thread.sleep(3000);
//		String oldwin = driver.getWindowHandle();
//		Set<String> getallwin = driver.getWindowHandles();
//		String[] getwin = getallwin.toArray(new String[getallwin.size()]);
//		driver.switchTo().window(getwin[1]);
//		String geturl = driver.getCurrentUrl();
//		String actualurl = "https://na174.salesforce.com/ui/core/activity/ActivityReminderPage?at=1581875196537&test=1";
//		VerifyStringEqual(geturl, actualurl,"Test Reminder page");				
//		driver.close();
//		Thread.sleep(3000);
//		driver.switchTo().window(oldwin);
//		
//		CloseReport();
//		CloseBrowser();
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
//}
