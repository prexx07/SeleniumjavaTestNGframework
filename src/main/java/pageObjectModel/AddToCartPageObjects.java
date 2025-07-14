package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPageObjects {
	
public WebDriver driver; //Current class driver
	
	private By Searchfield = By.xpath("//input[@type='text']");
	
	private By ClickOnSearchfield = By.xpath("(//button[@type='button'])[4]");
	
	//Here we have traverse through to click on 'Add to cart' button from specific product name and skip for loop
	private By ClickonSpecificProductAddToCart = By.xpath("//a[contains(text(),'Samsung Galaxy Tab 10.1')]//ancestor::div[@class='product-thumb']//i[@class='fa fa-shopping-cart']");
    
    private By CheckAddToCart = By.xpath("(//button[@type='button'])[5]");
    
    private By ViewCart = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart'])[2]");
	
    private By ShoppingCartActualSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
	

	public AddToCartPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement searchField() {
		return driver.findElement(Searchfield);
	}
	
	public WebElement clickOnSearchField() {
		return driver.findElement(ClickOnSearchfield);
	}
	
	public WebElement clickonSpecificProductAddToCart() {
		return driver.findElement(ClickonSpecificProductAddToCart);
	}
	
	public WebElement checkAddToCartt() {
		return driver.findElement(CheckAddToCart);
	}
	
	public WebElement viewCart() {
		return driver.findElement(ViewCart);
	}
	
	public WebElement shoppingCartActualSuccessMessage() {
		return driver.findElement(ShoppingCartActualSuccessMessage);
	}
}
