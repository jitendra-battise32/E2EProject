package Academy;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDriven.dataDriverClass;
import pageObjects.registrationPage;
import resources.base;

public class registration extends base {
	
	public WebDriver driver;
	
	@BeforeTest
	public void intialisation() throws IOException {
		
		driver = initializeDriver();
		
	}
	
	@Test (dataProvider= "getData")
	public void registration (String fullName, String email, String password)  throws IOException, InterruptedException {
        
		driver.get(prop.getProperty("url")); // as we have 2 data and script should run 2 times thats why we have given this get url here instead of before method
		
		driver.manage().window().maximize();
		
        registrationPage r = new registrationPage(driver);
		r.regButtonMethod().click();
		Thread.sleep(3000);
		
		r.FullNameFieldMethod().sendKeys(fullName);
	    r.emailFieldMethod().sendKeys(email);
	    r.passwordFieldMethod().sendKeys(password);
	    r.checkBoxFieldMethod().click();
	    r.submitButtonMethod().click();
	    String title = driver.getTitle();
	    Assert.assertEquals("RahulShetty", title);
	    Thread.sleep(3000);
	
	}
	
	 @AfterTest
	
	public void afterTest() {
	
	  driver.close();
		
		
	} 
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][3];
		
		data[0][0] = "Jitendra";
		data[0][1] = "jtn3200@gmail.com";
		data[0][2] = "Jay323200#";
	
		data[1][0] = "Apurva";
		data[1][1] = "apu@gmail.com";
		data[1][2] = "Jay323200#";		
		
		return data;
	} 

}
