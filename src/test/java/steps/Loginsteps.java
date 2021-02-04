package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class Loginsteps {

	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	String username="";
	String password ="";

	@Given("^valid user$")
	public void valid_user() {
		driver = BrowserFactory.startbrowser();
		//driver.get("https://techfios.com/billing/?ng=login/");
		//loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@When("^user goes to Techfios webSite$")
	public void user_goes_to_Techfios_webSite() {
		driver.get("https://techfios.com/billing/?ng=login/");

	}

	@Then("^user should be landed in login page$")
	public void user_should_be_landed_in_login_page() throws Throwable {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.isPanelHeaderDisplayed();
	}

	@When("^user logs in with valid username \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_logs_in_with_valid_username_password(String username, String password) {
		loginPage.enterUserNameAndPassword(username, password);
		loginPage.clickOnSignIn();

	}

	@Then("^the Dashboard page should display$")
	public void the_Dashboard_page_should_display() throws InterruptedException {
		dashboardPage.validationDashboard();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}