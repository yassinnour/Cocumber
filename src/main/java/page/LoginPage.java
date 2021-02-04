package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.ID, using = "username")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.ID, using = "password")
	WebElement USER_PASSWORD_ELEMENT;
	@FindBy(how = How.NAME, using = "login")
	WebElement SIGNIN_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//img[@class=\"logo\"]")
	WebElement LOGIN_PAGE_ELEMENT;
	// Methods to interact with elements

	public boolean isPanelHeaderDisplayed() {
		try {
			return LOGIN_PAGE_ELEMENT.isDisplayed();
		}
		catch(NoSuchElementException e) {
			return false;
		}
	}
	public void enterUserNameAndPassword(String username, String password) {
		USER_NAME_ELEMENT.sendKeys(username);
		USER_PASSWORD_ELEMENT.sendKeys(password);
	}

	

	public void clickOnSignIn() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
}
