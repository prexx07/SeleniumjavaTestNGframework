package testcases;

import org.testng.annotations.Test;

import pageObjectModel.HomePageObjects;
import pageObjectModel.LoginPageObjects;
import resources.BaseClass;
import resources.commonMethods;
import resources.data;

public class LoginTestCases extends BaseClass{
	
	@Test
	public void verifyLoginwithValidData() {
		
    HomePageObjects hpo = new HomePageObjects(driver);
    
    hpo.myAccount().click();
		
    hpo.login().click();
	
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		//This emailAddress is randomly generating and code is available in BaseClass
		lpo.enteremailAddress().sendKeys(emailAddress);
		
		lpo.enterpassword().sendKeys(data.enterpassword);
		
		lpo.clickonloginButton().click();
		
		String expectedTextURL = (data.expectedTextURL);
				
		String actualTextURL = driver.getCurrentUrl();
		
		commonMethods.handleAssertions(expectedTextURL, actualTextURL);
		
	}
	    @Test
	    public void verifyLoginWithInvalidData() {
	    	
	    HomePageObjects hpo = new HomePageObjects(driver);
	        
	    hpo.myAccount().click();
	    		
	    hpo.login().click();
	    	
	    		LoginPageObjects lpo = new LoginPageObjects(driver);
	    		
	    		lpo.enteremailAddress().sendKeys(data.enterInvalidemailAddress);
	    		
	    		lpo.enterpassword().sendKeys(data.enterInvalidpassword);
	    		
	    		lpo.clickonloginButton().click();	
	 
	    		
	    		String invalidLoginexpectedText = (data.invalidLoginexpectedText);
	    				
	    		String invalidLoginactualText = lpo.loginErrorText().getText();
	    		
	    		commonMethods.handleAssertions(invalidLoginexpectedText, invalidLoginactualText);
	    	
	    }

}
