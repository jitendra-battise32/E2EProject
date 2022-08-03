package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPractice1Page {

    public WebDriver driver;
	
	public AutomationPractice1Page(WebDriver driver) {
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}


    @FindBy (xpath="//a[text()='Automation Practise - 1']")
    WebElement automationPractLink1;
    
    @FindBy (xpath="//*[@class='search-keyword']")
    WebElement searchKeyword;
    
    @FindBy (xpath="//*[@class='search-button']")
    WebElement searchButton;
    
  
    @FindBy (xpath="//*[@class='increment']")
    WebElement increament;
    
  
    @FindBy (xpath="//*[text()='ADD TO CART']")
    WebElement addToCart;
    
    @FindBy (xpath="//*[@id='root']/div/header/div/div[3]/a[4]/img")
    WebElement addToCartLink;
  
    @FindBy (xpath="//*[@id='root']/div/header/div/div[3]/div[2]/div[2]/button")
    WebElement proceedToCheckout;
  
    @FindBy (xpath="//*[text()='Place Order']")
    WebElement placeOrder;
    
    @FindBy (xpath="//*[@id='root']/div/div/div/div/div/select")
    WebElement chooseCountry;
      
    @FindBy (xpath="//*[@id='root']/div/div/div/div/button")
    WebElement proceedButton;
    
  
    @FindBy (xpath="//*[@type='checkbox']")
    WebElement agreeCheckbox;
   
    public WebElement automationPractLink1Method() {
    	
    	return automationPractLink1;
    }
    
    public WebElement searchKeywordMethod() {
    	
    	return searchKeyword;
    }
    
    public WebElement searchButtonMethod() {
    	
    	return searchButton;
    }
    
    public WebElement increamentMethod() {
    	
    	return increament;
    }
    
    public WebElement addToCartMethod() {
    	
    	return addToCart;
    }
    
    public WebElement addToCartLinkMethod() {
    	
    	return addToCartLink;
    }
    
    public WebElement proceedToCheckoutMethod() {
    	
    	return proceedToCheckout;
    }
    
    public WebElement placeOrderMethod() {
    	
    	return placeOrder;
    }
    
    public WebElement chooseCountryMethod() {
    	
    	return chooseCountry;
    }
    
    public WebElement agreeCheckboxMethod() {
    	
    	return agreeCheckbox;
    }
    
    public WebElement proceedButtonMethod() {
    	
    	return proceedButton;
    }
    
}
