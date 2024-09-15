package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver Idriver;

	public LoginPage(WebDriver rdriver)
	{

		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(id="input-email")
	WebElement emailfield;

	@FindBy(id="input-password")
	WebElement passwordfield;

	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
    
	@FindBy(linkText="Logout")
	WebElement LogoutBtn;
	
	
	
	public void EnterEmail(String Eml)
	{
		emailfield.sendKeys(Eml);
	}

	public void Enterpassword(String pass)
	{
		passwordfield.sendKeys(pass);
	}

	public void ClickonBTN(String Btn)
	{
		loginbtn.click();
	}

	public void ClickonLogoutBTn(String Btn2)
	{
		LogoutBtn.click();
	}








}
