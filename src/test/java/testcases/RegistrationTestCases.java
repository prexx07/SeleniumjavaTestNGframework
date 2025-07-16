package testcases;

import org.testng.annotations.Test;

import pageObjectModel.HomePageObjects;
import pageObjectModel.RegistrationPageObject;
import resources.BaseClass;
import resources.commonMethods;
import resources.data;

public class RegistrationTestCases extends BaseClass{
	
	@Test
	public void verifyRegistrationWithValidData() throws InterruptedException {
		//HomeObject creation
		HomePageObjects hpo = new HomePageObjects(driver);
		// Exception handling Pallavi changes
		commonMethods.handleExplicitWait(driver, 10, hpo.myAccount());
		
		hpo.myAccount().click();
		
		hpo.register().click();
		
		RegistrationPageObject rpo = new RegistrationPageObject(driver);
		
		//firstName value is available in data class under resources package
		rpo.firstName().sendKeys(data.firstName);
		
		//lastName value is available in data class under resources package
		rpo.lastName().sendKeys(data.lastName);
		
		//This emailAddress is randomly generating and code is available in BaseClass
		rpo.eMail().sendKeys(emailAddress);
		
		rpo.telephone().sendKeys(data.telephone);
		
		rpo.password().sendKeys(data.password);
		
		rpo.passwordConfirm().sendKeys(data.passwordConfirm);
		
		rpo.subscribe().click();
		
		rpo.privacyPolicy().click();
		
		rpo.continueButton().click();
		
		String expectedText = (data.expectedText);
				
		String actualText = rpo.registrationSuccessful().getText();
		
		commonMethods.handleAssertions(expectedText, actualText);
	}
	
	@Test(enabled=false)
	public void verifyRegistrationWithBlankData() throws InterruptedException {
		
		HomePageObjects hpo = new HomePageObjects(driver);
		commonMethods.handleExplicitWait(driver, 10, hpo.myAccount());
		
		hpo.myAccount().click();
		
	    hpo.register().click();
	    
	    RegistrationPageObject rpo = new RegistrationPageObject(driver);
	    
	    rpo.continueButton().click();
		
		String firstNameexpectedText = (data.firstNameexpectedText);
				
		String firstNameactualText = rpo.firstnameActualErrorText().getText();
		
		commonMethods.handleAssertions(firstNameexpectedText, firstNameactualText);
		
        
		String lastNameexpectedText = (data.lastNameexpectedText);
		
		String lastNameactualText = rpo.lastnameActualErrorText().getText();
		
		commonMethods.handleAssertions(lastNameexpectedText, lastNameactualText);
		
		
        String emailexpectedText = (data.emailexpectedText);
		
		String emailactualText = rpo.emailActualErrorText().getText();
		
		commonMethods.handleAssertions(emailexpectedText, emailactualText);
		
        
		String telephoneexpectedText = (data.telephoneexpectedText);
		
		String telephoneactualText = rpo.telephoneActualErrorText().getText();
		
		commonMethods.handleAssertions(telephoneexpectedText, telephoneactualText);
		
        
		String passwordexpectedText = (data.passwordexpectedText);
		
		String passwordactualText = rpo.passwordActualErrorText().getText();
		
		commonMethods.handleAssertions(passwordexpectedText, passwordactualText);
		
	}
	
	    
}
