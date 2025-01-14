package DEMO_WEB_SHOP__P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement RegisterLink;
	public WebElement getRegisterLink() {
		return RegisterLink;
	}
}
