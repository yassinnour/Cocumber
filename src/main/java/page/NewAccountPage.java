package page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewAccountPage extends BasePage {
	WebDriver driver;

	public NewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

//Elements Library
	@FindBy(how = How.ID, using = "description")
	WebElement ENTER_DESCRIPTION_ELEMENT;
	@FindBy(how = How.ID, using = "account")
	WebElement ENTER_ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.ID, using = "balance")
	WebElement ENTER_ACCOUNT_BALANCE_ELEMENT;
	@FindBy(how = How.ID, using = "account_number")
	WebElement ENTER_ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.ID, using = "contact_person")
	WebElement ENTER_CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.ID, using = "contact_phone")
	WebElement ENTER_CONTACT_PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and @class='btn btn-primary']")
	WebElement click_submit_ELEMENT;
	@FindBy(how = How.XPATH, using = " //h2[contains(text(),' Accounts ')]")
	WebElement ACCOUNT_PAGE_PANEL_ELEMENT;

//Methods to interact with Elements

	public boolean isPanelHeaderDisplayed() {
		try {
			return ACCOUNT_PAGE_PANEL_ELEMENT.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void enterAccoutTitle(String accountTitle) {
		ENTER_ACCOUNT_TITLE_ELEMENT.sendKeys(accountTitle);
	}

	public void enterAccountDescription(String description) {
		ENTER_DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void enterAccountBalance(String balance) {
		ENTER_ACCOUNT_BALANCE_ELEMENT.sendKeys(balance);
	}

	public void enterAccountNumber(String number) {
		ENTER_ACCOUNT_NUMBER_ELEMENT.sendKeys(number);
	}

	public void enterContactPerson(String contact) {
		ENTER_CONTACT_PERSON_ELEMENT.sendKeys(contact);
	}

	public void enterContactPhone(String phone) {
		ENTER_CONTACT_PHONE_ELEMENT.sendKeys(phone);
	}

	public void clickOnSubmit() {
		click_submit_ELEMENT.click();
	}
}
