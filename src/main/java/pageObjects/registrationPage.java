package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage {

	
	public WebDriver driver;
	
	@FindBy(xpath="//*[text()='Register']")
	WebElement regButton;
	
	@FindBy(xpath="//*[@id='user_name']")
	WebElement FullNameField;
	
	@FindBy(xpath="//*[@id='user_email']")
	WebElement emailField;
	
	@FindBy(xpath="//*[@id='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//*[@type='checkbox']")
	WebElement checkBoxField;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submitButton;
	
	public registrationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement regButtonMethod() {
		
		return regButton;
	}
	
	public WebElement FullNameFieldMethod() {
		
		return FullNameField;
	}
	
    public WebElement emailFieldMethod() {
		
		return emailField;
	}
    
    public WebElement passwordFieldMethod() {
		
		return passwordField;
	}
    
    public WebElement checkBoxFieldMethod() {
		
		return checkBoxField;
	}
    
    public WebElement submitButtonMethod() {
		
		return submitButton;
	}
    
    
    
}
