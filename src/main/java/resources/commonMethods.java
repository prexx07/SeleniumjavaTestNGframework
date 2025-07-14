package resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleAssertions(String expectText, String actText  ){
		
        SoftAssert sa = new SoftAssert();
		
		String expectedText = expectText;
				
		String actualText = actText;
		
		sa.assertEquals(actualText , expectedText);
		
		sa.assertAll();
		
	}
	
	public static void handleExplicitWait(WebDriver driver, int time, WebElement element) {
		
		WebDriverWait wait= new  WebDriverWait(driver,Duration.ofSeconds(10));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
