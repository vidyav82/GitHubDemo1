package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import TestSFDC.Reusable;

public class PageObjectsHomePage extends Reusable {
	
	@FindBy(id="userNavLabel")
	WebElement UsrPic;
	@FindBy(linkText="Logout") 
	WebElement logout;
	@FindBy(linkText="My Profile")
	WebElement myproflnk;
	@FindBy(linkText="My Settings")
	WebElement mySetlnk;
	@FindBy(linkText="Developer Console")
	WebElement devconlnk;
	@FindBy(linkText="Switch to Lightning Experience")
	WebElement swtchlightlnk;
	@FindBy(xpath="//img[@class='allTabsArrow']")
	WebElement showAll;
	@FindBy(linkText="Accounts")
	WebElement Accounts;
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickUserPic() {
		Click(UsrPic,"UserNavigationLink");
		
	}
	public void clickLogout() {
		Click(logout,"Logout Button");
	}
	public void clickMyProfileLink() {
		Click(myproflnk,"MyProfileLink");
	}
	
	public void clickMySettings() {
		Click(mySetlnk,"MySettingsLink");
	}
	
	public void verifyMyProfilelinkdisplayed() {
		VerifyLinkIsDisplayed(myproflnk, "My Profile");
	}
	
	public void verifyMySettinglinkdisplayed() {
		VerifyLinkIsDisplayed(mySetlnk, "My Settings");
	}
	public void verifyDevconlinkdisplayed() {
		VerifyLinkIsDisplayed(devconlnk, "Developer Console");
	}
	public void verifystchLitlinkdisplayed() {
		VerifyLinkIsDisplayed(swtchlightlnk, "Switch to Lightning Experience");
	}
	public void verifyLogoutlinkdisplayed() {
		VerifyLinkIsDisplayed(logout,"Logout");
	}
	public void clickDevCon() {
		Click(devconlnk, "Developer Console");
	}
	public void clickShowAll() {
		Click(showAll,"Show All");
	}
	public void clickAccounts() {
		Click(Accounts,"Accounts");
	}
	
}
