package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import TestSFDC.Reusable;

public class PageObjectsMyProfile extends Reusable {
	
	@FindBy(id="uploadLink")
	WebElement upldlnk;
	@FindBy(xpath="//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img") 
	WebElement editlnk;
	@FindBy(linkText="My Profile")
	WebElement myproflnk;
	@FindBy(id="contactInfoTitle")
	WebElement edtpage;
	@FindBy(xpath="//*[@id=\"aboutTab\"]/a")
	WebElement abouttab;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(xpath="//*[@id=\"contactTab\"]/a")
	WebElement contab;
	@FindBy(xpath="//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")
	WebElement saveall;
	@FindBy(xpath="//a[@id='publisherAttachTextPost']")
	WebElement postlink;
	@FindBy(xpath="//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]")
	WebElement htmlbody;
	@FindBy(xpath="/html/body")
	WebElement textspace;
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement share;
	@FindBy(xpath="//div[@class='feedcontainer cxfeedcontainer zen actionsOnHoverEnabled' and @id='ext-gen3']//div[@class='cxfeeditem feeditem']//div[@class='feeditembody']//span[@class='feeditemtext cxfeeditemtext']")
	WebElement txt;
	
	public String getMyProfilePageTitle() {
		return driver.getTitle();
	}
	
	public void clickEditLink() {
		Click(editlnk,"EditLink");
		
	}
	
	public void uploadLinkIsDisplayed() {
		VerifyLinkIsDisplayed(upldlnk, "Upload Link");
	}

	public void verifyEditPageHeading() {
		Verify_VisibleText(edtpage,"Edit Profile", "Edit Profile Page");
	}
	
	public void clickAboutTab() {
		Click(abouttab,"About Tab");
	}
	
	public void enterLastName() {
		ClearText(lastName, "LastName");
		EnterText(lastName, "Venkatesh1", "LastName");
	}
	
	public void contactTabisEnabled() {
		VerifyElementIsEnabled(contab, "ContactTab");
	}
	
	public void clickSaveAll() {
		Click(saveall,"SaveAll");
	}
	
	public void clickpostLink() {
		Click(postlink,"Post Link");
	}
	public void switchTohtmlBody() {
		SwitchFrame(htmlbody);
	}
	public void enterTextHtmlBody(String textToenter) {
		Click(textspace,"TextSpace");
		EnterText(textspace,textToenter,"TextSpace text.");
	}
	public void clickShare() {
		Click(share,"ShareButton");
	}
	public void checktextentered(String textentered) {
		Verify_TextContains(txt,textentered);
	}
	
}
