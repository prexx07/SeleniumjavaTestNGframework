package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver; //Current class driver
	
	private By MyAccount = By.xpath("//a[@title='My Account']");
			
	private By register = By.xpath("(//a[contains(text(),'Register')])[1]");	
	
	private By login =By.xpath("//a[contains(text(),'Login')]");
	
	   // Create constuctor
	public HomePageObjects(WebDriver driver) {
		
		//By using this we are assigning current class driver (Home page driver) equal to base class driver
		this.driver = driver;
	}

	public WebElement myAccount() {
		return driver.findElement(MyAccount);
	}
	
	public WebElement register() {
		return driver.findElement(register);
	}
	
	public WebElement login() {
		return driver.findElement(login);
	}
	

}
