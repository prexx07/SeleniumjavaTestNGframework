package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {

    public WebDriver driver;
	
	private By FirstName = By.xpath("//input[@id='input-firstname']");
	
	private By LastName = By.xpath("//input[@id='input-lastname']");
	
	private By EMail = By.xpath("//input[@id='input-email']");
	
	private By Telephone = By.xpath("//input[@id='input-telephone']");
	
	private By Password = By.xpath("//input[@id='input-password']");
	
	private By PasswordConfirm = By.xpath("//input[@id='input-confirm']");
	
	private By Subscribe = By.xpath("(//input[@name='newsletter'])[1]");
	
	private By PrivacyPolicy = By.xpath("//input[@type='checkbox']");
	
	private By ContinueButton = By.xpath("//input[@type='submit']");
	
	private By RegistrationSuccessful = By.xpath("//div[@id='content']/h1");
	
	private By FirstnameActualErrorText = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	
	private By LastnameActualErrorText = By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	
	private By EmailActualErrorText = By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	
	private By TelephoneActualErrorText = By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	
	private By PasswordActualErrorText = By.xpath("//div[text()='Password must be between 4 and 20 characters!']");
	
	
	//Create constructor
	public RegistrationPageObject(WebDriver driver) {
		//By using this we are assigning current class driver (Registration) equal to base class driver
		this.driver=driver;
	}

	public WebElement firstName() {
		return driver.findElement(FirstName);
	}
	
	public WebElement lastName() {
		return driver.findElement(LastName);
	}
	
	public WebElement eMail() {
		return driver.findElement(EMail);
	}
	
	public WebElement telephone() {
		return driver.findElement(Telephone);
	}
	
	public WebElement password() {
		return driver.findElement(Password);
	}
	
	public WebElement passwordConfirm() {
		return driver.findElement(PasswordConfirm);
	}
	
	public WebElement subscribe() {
		return driver.findElement(Subscribe);
	}
	
	public WebElement privacyPolicy() {
		return driver.findElement(PrivacyPolicy);
	}
	
	public WebElement continueButton() {
		return driver.findElement(ContinueButton);
	}
	
	public WebElement registrationSuccessful() {
		return driver.findElement(RegistrationSuccessful);
	}
	
	public WebElement firstnameActualErrorText() {
		return driver.findElement(FirstnameActualErrorText);
	}
	
	public WebElement lastnameActualErrorText() {
		return driver.findElement(LastnameActualErrorText);
	}
	
	public WebElement emailActualErrorText() {
		return driver.findElement(EmailActualErrorText);
	}
	
	public WebElement telephoneActualErrorText() {
		return driver.findElement(TelephoneActualErrorText);
	}
	
	public WebElement passwordActualErrorText() {
		return driver.findElement(PasswordActualErrorText);
	}
}
