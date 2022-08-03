package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practicePage {

	
	public WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[7]/a")
	WebElement practiceLink;
	
	@FindBy(xpath="/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[7]/a")
	WebElement practiceLinkagain;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement yourNamePractice;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement emailPractice;
	
	@FindBy(xpath="//*[@id='agreeTerms']")
	WebElement agreeTermPractice;
	
	@FindBy(xpath="//*[@id='form-submit']")
	WebElement formSubmitPractice;
	
	public practicePage(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement practiceLinkMethod() {
		
		return practiceLink;
	}
	
    public WebElement practiceLinkagainMethod() {
		
		return practiceLinkagain;
	}
	
    public WebElement yourNamePracticeMethod() {
		
		return yourNamePractice;
	}

    public WebElement emailPracticeMethod() {
		
		return emailPractice;
	}
    
    public WebElement agreeTermPracticeMethod() {
		
		return agreeTermPractice;
	}
    
	
    public WebElement formSubmitPracticeMethod() {
		
		return formSubmitPractice;
	}


  
    
    
}
