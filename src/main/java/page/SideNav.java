package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideNav {
	WebDriver driver;

	public SideNav(WebDriver driver) {
		this.driver = driver;
	}
//Bank&Cash    //span[text()='Bank & Cash']
//New Account  linkText    New Account
//List Account LinkText  List Accounts

//Elements Library
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement BANK_AND_CASH_BUTTON_ELEMENT;
	@FindBy(how = How.LINK_TEXT, using = "New Account")
	WebElement NEW_ACCOUNT_PAGE_ELEMENT;
	@FindBy(how = How.LINK_TEXT, using = "List Accounts")
	WebElement LIST_ACCOUNT_ELEMENT;

//Methods to interact with Elements
	public void clickOnBandAndCashButton() throws InterruptedException {
		Thread.sleep(2000);
		BANK_AND_CASH_BUTTON_ELEMENT.click();
		Thread.sleep(2000);
		NEW_ACCOUNT_PAGE_ELEMENT.click();
	}

	public void clickOnListAccount() throws InterruptedException {
		Thread.sleep(1000);
		LIST_ACCOUNT_ELEMENT.click();
	}

}
