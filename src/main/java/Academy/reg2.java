package Academy;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dataDriven.dataDriverClass;
import pageObjects.registrationPage;
import resources.base;

public class reg2 extends base {

	public WebDriver driver;
	@Test
	public void reg() throws IOException, InterruptedException {
		
 		dataDriverClass dd = new dataDriverClass();
 		ArrayList data =  dd.getData("Apurva Boratne");
 		//System.out.println(data.get(0));
 	//	System.out.println(data.get(1));
 		//System.out.println(data.get(2));
 		
 	    String FirstName = (String) data.get(0);
 	    String Email = (String) data.get(1);
 	    String Password = (String) data.get(2);
 	
 		
 		driver = initializeDriver();
        driver.get(prop.getProperty("url")); // as we have 2 data and script should run 2 times thats why we have given this get url here instead of before method
		
		driver.manage().window().maximize();
		
        registrationPage r = new registrationPage(driver);
		r.regButtonMethod().click();
		Thread.sleep(3000);
		
		r.FullNameFieldMethod().sendKeys(FirstName);
	    r.emailFieldMethod().sendKeys(Email);
	    r.passwordFieldMethod().sendKeys(Password);
	    r.checkBoxFieldMethod().click();
	    r.submitButtonMethod().click(); 
	    
 		
	}
	
	
	

}
