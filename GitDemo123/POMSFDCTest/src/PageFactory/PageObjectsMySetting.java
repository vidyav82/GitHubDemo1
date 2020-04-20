package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import TestSFDC.Reusable;

public class PageObjectsMySetting extends Reusable{

	
	@FindBy(xpath="//*[@id=\"PersonalSetup_font\"]/span[2]")
	WebElement mysetpgelnk;
	@FindBy(xpath="//*[@id=\"PersonalInfo_font\"]")
	WebElement perslnk;
	@FindBy(id="LoginHistory_font")
	WebElement loginhis;
	@FindBy(xpath="//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")
	WebElement lgnhislnk;
	@FindBy(id="DisplayAndLayout_font")
	WebElement displaylnk;
	@FindBy(id="CustomizeTabs_font")
	WebElement custfnt;
	@FindBy(xpath="//*[@id=\"p4\"]/option[9]")
	WebElement custappdrop;
	@FindBy(xpath="//*[@id=\"duel_select_0\"]/option[43]")
	WebElement reports;
	@FindBy(xpath="//*[@id=\"duel_select_0_right\"]/img")
	WebElement add_btn;
	@FindBy(css="#duel_select_1")
	WebElement selectlst;
	@FindBy(xpath="//*[@id=\"bottomButtonRow\"]/input[1]")
	WebElement savebtn;
	@FindBy(xpath="//*[@id=\"EmailSetup_font\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"EmailSettings_font\"]")
	WebElement emailset;
	@FindBy(id="sender_name")
	WebElement sendnme;
	@FindBy(id="sender_email")
	WebElement sendmail;
	@FindBy(id="auto_bcc1")
	WebElement radiobtn;
	@FindBy(xpath="//*[@id=\"meSaveCompleteMessage\"]/table/tbody/tr/td[2]/div")
	WebElement msg1;
	@FindBy(xpath="//*[@id=\"CalendarAndReminders_font\"]")
	WebElement calendars;
	@FindBy(xpath="//*[@id=\"Reminders_font\"]")
	WebElement activityremin;
	@FindBy(xpath="//*[@id=\"testbtn\"]")
	WebElement openrem;
	
	public void clickPersonalInfo() {
		Click(perslnk,"PersonalInfoLink");
	}
	public void mySettingsisDisplayed() {
		VerifyLinkIsDisplayed(mysetpgelnk, "MySettings Page");
	}
	public void clickLoginHis() {
		Click(loginhis,"LoginHistorylink");
	}
	public void loginHisisDisplayed() {
		VerifyLinkIsDisplayed(lgnhislnk, "LoginHistoryLink");
	}
	public void clickDisplayLink() {
		Click(displaylnk,"DisplayAndLayout");
	}
	public void clickCustomizeTab() {
		Click(custfnt,"CustomizeTabs");
	}
	public void clickCustDrop() {
		Click(custappdrop,"CustomerAppDropDown");
	}
	public void clickReports() {
		Click(reports,"Reports");
	}
	public void clickAdd() {
		Click(add_btn,"AddButton");
	}
	public WebElement selectValue(String value) {
		WebElement option = SelectValue(selectlst,value);
		return option;
	}
	public void checkoptionSelected(WebElement element,String val) {
		Verify_TextContains(element,val);
	}
	public void clickSave() {
		Click(savebtn,"SaveButton");
	}
	public void clickEmail() {
		Click(email,"EmailLink");
	}
	public void clickEmailset() {
		Click(emailset,"Emailset");
	}
	public void entertextSendername(String text) {
		ClearText(sendnme, "SenderName");
		EnterText(sendnme,text, "SenderName");
	}
	public void entertextSenderemail(String text) {
		ClearText(sendmail, "SenderEmail");
		EnterText(sendmail,text, "SenderEmail");
	}
	public void clickRadio() {
		Click(radiobtn,"auto");
	}
	public void verifymessage(String Expmessage) {
		Verify_VisibleText(msg1,Expmessage, "Settings Saved Success");
	}
	public void verifysenderval(String expectedValue) {
		VerifyDisplayedValue(sendnme,expectedValue);
	}
	public void verifysendermailval(String expectedValue) {
		VerifyDisplayedValue(sendmail,expectedValue);
	}
	public void clickCalendar() {
		Click(calendars,"Calendars");
	}
	public void clickActRem() {
		Click(activityremin,"ActivityReminder");
	}
	public void clickOpenRem() {
		Click(openrem,"OpenReminder");
	}
}
