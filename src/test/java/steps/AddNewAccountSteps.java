package steps;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import page.NewAccountPage;
import page.SideNav;
import util.BrowserFactory;

public class AddNewAccountSteps {
WebDriver driver;
LoginPage loginPage;
SideNav sideNav;
NewAccountPage newAccount;
	
	
	@Before
	public void startFirst() {
		driver = BrowserFactory.startbrowser();
		driver.get("https://techfios.com/billing/?ng=login/");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		sideNav = PageFactory.initElements(driver, SideNav.class);
		newAccount = PageFactory.initElements(driver, NewAccountPage.class);
	}
	@Given("^a user already logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_user_already_logged_in_as_and(String username, String password) {
	    loginPage.enterUserNameAndPassword(username, password);
	    loginPage.clickOnSignIn();
	}

	@When("^user navigate to Bank Cash -> New Account Page$")
	public void user_navigate_to_Bank_Cash_New_Account_Page() throws InterruptedException {
	   sideNav.clickOnBandAndCashButton();
	}

	@Then("^New Accounts Page should display$")
	public void new_Accounts_Page_should_display(){
		newAccount.isPanelHeaderDisplayed();
	}
	@When("^user submits \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"\"([^\"]*)\" \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_submits_and(String accountTitle, String description, String balance, String number, String contact, String phone) throws InterruptedException {
		Thread.sleep(2000);
		newAccount.enterAccoutTitle(accountTitle + new Random().nextInt(999));
	    newAccount.enterAccountDescription(description);
	    newAccount.enterAccountBalance(balance);
	    newAccount.enterAccountNumber(number);
	    newAccount.enterContactPerson(contact);
	    newAccount.enterContactPhone(phone);
	    newAccount.clickOnSubmit();
	
	}

	@Then("^created account should be posted$")
	public void created_account_should_be_posted() {
	  
	}
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
