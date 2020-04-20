package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestSFDC.Reusable;

public class PageObjectsAccountsPage extends Reusable {
	
	@FindBy(xpath="//span[@class='mruText'][contains(text(),'Vidya Venkatesh1')]")
	WebElement usrname;
	@FindBy(xpath="//input[@name='new']")
	WebElement NewAcnt;
	@FindBy(xpath="//input[@id='acc2']")
	WebElement newActname;
	@FindBy(xpath="//select[@id='acc6']")
	WebElement accnttype;
	@FindBy(xpath="//select[@id='00N6g00000MRGwj']")
	WebElement priority;
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@name='save']")
	WebElement saveBut;
	@FindBy(xpath="//h2[@class='topName']")
	WebElement savdname;
	
	public void verifyusername(String expmsg) {
		Verify_TextContains(usrname,expmsg);
	}
	public void clickNewAccount() {
		Click(NewAcnt,"NewAccount");
	}
	public void enterNewAccountname(String text) {
		EnterText(newActname, text, "NewAccountname");
	}
	public void selectaccntType(String value) {
		SelectaValue(accnttype,value);
	}
	public void selectPriority(String value) {
		SelectaValue(priority,value);
	}
	public void clickSave() {
		Click(saveBut,"SaveButton");
	}
	public void verifysavedname(String ExptedMessage) {
		Verify_TextContains(savdname,ExptedMessage);
	}
}
