package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

    public WebDriver driver;
	
	private By EmailAddress = By.xpath("//input[@id='input-email']");
	
	private By Password = By.xpath("//input[@id='input-password']");
	
	private By LoginButton = By.xpath("//input[@type='submit']");
	
	private By LoginErrorText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	//Create constructor
		public LoginPageObjects(WebDriver driver) {
			//By using this we are assigning current class driver (Login) equal to base class driver
			this.driver=driver;
		}
	
	public WebElement enteremailAddress() {
		return driver.findElement(EmailAddress);
	}
	
	public WebElement enterpassword() {
		return driver.findElement(Password);
	}
	
	public WebElement clickonloginButton() {
		return driver.findElement(LoginButton);
	}
	
	public WebElement loginErrorText() {
		return driver.findElement(LoginErrorText);
	}
}
