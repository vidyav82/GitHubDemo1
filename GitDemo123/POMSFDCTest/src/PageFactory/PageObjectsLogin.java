package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import TestSFDC.Reusable;

public class PageObjectsLogin extends Reusable{
	
	@FindBy(id="username") 
	WebElement uid;
	@FindBy(id="password") 
	WebElement pwd;	
	@FindBy(id="Login") 
	WebElement LoginButn;
	@FindBy(id="error") 
	WebElement ErrorMsg;
	@FindBy(id="idcard-identity")
	WebElement usrname;
	@FindBy(id="forgot_password_link")
	WebElement forgotpwd;
	@FindBy(id="un")
	WebElement forgotpageuid;
	@FindBy(id="continue")
	WebElement conti;
	@FindBy(id="header")
	WebElement checkmail;
	@FindBy(id="rememberUn")
	WebElement remembermechkbox;
	
	public void EnterUID(String text, String objName) {
		
		EnterText(uid, text, objName);
	
	}
	
	public void EnterPwd(String text, String objName) {
		EnterText(pwd, text, objName);
	}
	
	public void ClearPwdText() {
		pwd.clear();
	}
	
	public void ClickLoginButton() {
		Click(LoginButn, "Login Button");
		
	}
	
	public WebElement ErrMsg() {
		return ErrorMsg;
	}
	
	public void verifyVisibleTextUsername(String ExpMsg,String Msg) {
		Verify_VisibleText(usrname,ExpMsg,Msg);
	}
	
	public void verifyVisibleTextCheckMail(String ExpMsg,String Msg) {
		Verify_VisibleText(checkmail,ExpMsg,Msg);
	}
	
	public void ClickForgotPWd() {
		Click(forgotpwd, "Forgot Password Link");
	}
	public String getLoginpageTitle() {
		return driver.getTitle();
	}
	
	public void EnterforgotPwduid(String text, String objName) {
		EnterText(forgotpageuid, text, objName);
	}
	public void ClickContinue() {
		Click(conti, "Continue");
	}
	
	public void verifyErrorMsg(String ExpMsg,String Msg) {
		Verify_VisibleText(ErrorMsg,ExpMsg,Msg);
	}
	public void clickremmecheckbox() {
		Click(remembermechkbox,"Remember Me Checkbox");
	}
	public void verifyusernamedisplayed() {
		VerifyLinkIsDisplayed(uid,"Username");
	}
}
