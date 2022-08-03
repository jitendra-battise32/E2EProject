package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")
	WebElement loginButton; 
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailLoginField; 
	
	@FindBy(xpath="//*[@id='password']")
	WebElement passwordLoginField; 
		
	@FindBy(xpath="//*[@id='remember_me']")
	WebElement rememberMeCheckbox; 
	
	@FindBy(xpath="//*[@value='Log in']")
	WebElement loginSubmitButton; 
	
	
	public LoginPage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


    public WebElement loginButtonMethod() {
    	
    	return loginButton;
    }
    
    
    public WebElement emailLoginFieldMethod() {
    	
    	return emailLoginField;
    }
    
    public WebElement passwordLoginFieldMethod() {
    	
    	return passwordLoginField;
    }
    
    public WebElement rememberMeCheckboxMethod() {
    	
    	return rememberMeCheckbox;
    }
    
    public WebElement loginSubmitButtonMethod() {
    	
    	return loginSubmitButton;
    }
    
    
    
}
