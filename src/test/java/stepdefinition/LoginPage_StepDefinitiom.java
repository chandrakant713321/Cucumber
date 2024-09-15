package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPage;

public class LoginPage_StepDefinitiom {
	
	WebDriver driver;
	LoginPage lgpage;
	
	

	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    lgpage=new LoginPage(driver);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("User Open URL\"https:\\/\\/demo.opencart.com\\/en-gb?route=account\\/login\"")
	public void user_open_url_https_demo_opencart_com_en_gb_route_account_login() {
	    driver.get("https://demo.opencart.com/en-gb?route=account/login");
	}

	@When("user enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String EmlAddress, String Password1) {
		lgpage.EnterEmail(EmlAddress);
		lgpage.Enterpassword(Password1);
	}

	@When("click on login button")
	public void click_on_login_button() {
		lgpage.ClickonBTN(null);

	}


	@Then("Page title will be {string}")
	public void page_title_will_be(String ExpectedTitle1) {

		String ActualTitle=driver.getTitle();
		   if(ActualTitle.equals(ExpectedTitle1))
		   {
			   Assert.assertTrue(true);
			   System.out.println("Test is pass");
		   }	
		   else
		   {
			   Assert.assertTrue(false);
			   System.out.println("Test is fail");
		   }
	}



	@When("User click on logout link")
	public void user_click_on_logout_link() {
		lgpage.ClickonLogoutBTn(null);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String ExpectedTitle) {
   String ActualTitle=driver.getTitle();
   if(ActualTitle.equals(ExpectedTitle))
   {
	   Assert.assertTrue(true);
	   System.out.println("Test is pass");
   }	
   else
   {
	   Assert.assertTrue(false);
	   System.out.println("Test is fail");
   }
	
	
	}
	//////////////////////////////////////////////////
	@Given("User is on google page")
	public void user_is_on_google_page() {
driver.get("https://www.google.com");
	}

	@When("User neter text as {string}")
	public void user_neter_text_as(String string) {
driver.findElement(By.id("input")).sendKeys("citi.com", Keys.ENTER);
	}

	@When("Hit enter button")
	public void hit_enter_button() {
		driver.findElement(By.id("input")).sendKeys("citi.com", Keys.ENTER);

	}

	@Then("User shoud get required page")
	public void user_shoud_get_required_page() {
     String Actual="Credit Cards, Banking, Mortgage, Personal Loans | Citi.com";
     String Expected=driver.getTitle();
     if(Actual.equals(Expected))
     {
    	 System.out.println("This is pass");
     }
     else
     {
    	 System.out.println("This is fail ");
     }
	}


	@Then("close browser")
	public void close_browser() {
 driver.quit();
	}
	
	
	
}
