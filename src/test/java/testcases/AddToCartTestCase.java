package testcases;

import org.testng.annotations.Test;

import pageObjectModel.AddToCartPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.data;

public class AddToCartTestCase extends BaseClass {
	
	@Test
	public void verifyAddToCartwithvaliddata() throws InterruptedException {
		
		AddToCartPageObjects atc = new AddToCartPageObjects(driver);
		
		atc.searchField().sendKeys(data.searchField);
		
		atc.clickOnSearchField().click();
		
		atc.clickonSpecificProductAddToCart().click();
		
		atc.checkAddToCartt().click();
		
		atc.checkAddToCartt().click();
		commonMethods.handleExplicitWait(driver, 10, atc.viewCart());
		
		atc.viewCart();
		
		String expectedTextOnViewCart = (data.expectedTextOnViewCart);
		
		String actualTextOnViewCart = atc.shoppingCartActualSuccessMessage().getText();
		
		commonMethods.handleAssertions(expectedTextOnViewCart, actualTextOnViewCart);
		
	}
	
}
