package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
    public WebDriver driver;
    
    //Here we are storing the random email address method in emailAddress with static keyword to copy and
    //paste the same email id used while registration and using only emailAddress as key to pass the data.
    public static String emailAddress= generateRandomEmailAddress();
	
	public void initializeDriver() throws IOException {
	
		//TO READ THE DATA so we have used here java class i.e FileInputStream and pass the path of the file
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
   
	//We have to fetch data from data.properties file so we are using here ready made method of java 
	//i.e properties that's why we have created class of it
	Properties prop = new Properties();
	
	// To load the data from file we are using here load and passing the reference variable with it
	prop.load(fis);
	
	// To access the data in file we are using here getProperty by passing the with it
	String browserName= prop.getProperty("browser");
	
	//We can use here if or switch method here
	if (browserName.equalsIgnoreCase("chrome")) {
        driver = new ChromeDriver();
    
	} else if (browserName.equalsIgnoreCase("firefox")) {
        driver = new FirefoxDriver();
    
	} else if (browserName.equalsIgnoreCase("edge")) {
        driver = new EdgeDriver();
    } 
	
  }
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
	}
	
	@BeforeClass //Method created to create random email address for registartion and login
	             // We are keeping it as a static to copy and paste the same email address used while registartion  
	public static String generateRandomEmailAddress() {
		
		return System.currentTimeMillis()+"@gmail.com";
	}
	
     }
	

