package Academy;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.AutomationPractice1Page;
import pageObjects.LoginPage;
import pageObjects.practicePage;
import pageObjects.registrationPage;
import resources.base;

public class login extends base {

	public WebDriver driver;
	
	@Test(priority = 1)
	public void login() throws IOException, InterruptedException {
		
		driver = initializeDriver();
    	driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		LoginPage l = new LoginPage(driver);
		l.loginButtonMethod().click();
		
		
        Thread.sleep(5000);
        
        l.emailLoginFieldMethod().sendKeys("Jitendra.battise32@gmail.com");
        l.passwordLoginFieldMethod().sendKeys("Jay323200#");
        l.rememberMeCheckboxMethod().click();
        l.loginSubmitButtonMethod().click();
        Thread.sleep(5000);
		//driver.close();
	}
	
	@Test(priority = 2)
	public void practice() throws InterruptedException {
		
		practicePage p = new practicePage(driver);
		p.practiceLinkMethod().click();
		Thread.sleep(5000);
		p.practiceLinkagainMethod().click();
		Thread.sleep(5000);
		p.yourNamePracticeMethod().sendKeys("Jitendra Battise");;
		p.emailPracticeMethod().sendKeys("Jitendra.battise32@gmail.com");
		p.agreeTermPracticeMethod().click();
		p.formSubmitPracticeMethod().click();
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
			
	}
	
	@Test(priority = 3)
	public void autoPractice() throws IOException, InterruptedException {
		
		AutomationPractice1Page ap = new AutomationPractice1Page(driver);
		ap.automationPractLink1Method().click();
		Thread.sleep(3000);
		ap.searchKeywordMethod().sendKeys("Cucumber");
		ap.searchButtonMethod().click();
		Thread.sleep(3000);
		ap.increamentMethod().click();
		ap.addToCartMethod().click();
		ap.addToCartLinkMethod().click();
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);

		action.moveToElement(ap.proceedToCheckoutMethod()).click().perform();
	
		Thread.sleep(3000);
		ap.placeOrderMethod().click();
		Thread.sleep(3000);
		
		Select s = new Select(ap.chooseCountryMethod());
		s.selectByValue("India");
		
		ap.agreeCheckboxMethod().click();
		ap.proceedButtonMethod().click();
		Thread.sleep(3000);
		driver.close();
	}

}
