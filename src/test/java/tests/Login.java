package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.AdminPage;
import pageObjects.HomePage;
import resources.Base;
import org.openqa.selenium.interactions.Actions;

public class Login extends Base {
	WebDriver driver;
	@Test(dataProvider = "loginData")
  public void Login(String userName , String password, String expectedResult) throws Throwable {
		
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.userName().sendKeys(userName);
		loginPage.password().sendKeys(password);
		loginPage.loginButton().click();
		
		HomePage homePage = new HomePage(driver);
		
		String actualResult;
		try {
			Thread.sleep(5000);
			homePage.Admin().isDisplayed();
		
			actualResult ="Pass";
		} catch (Exception e) {
			
			actualResult = "Fail";
		}
       Assert.assertEquals(actualResult, expectedResult);
       if(actualResult == "Pass") {
    	   homePage.Admin().click();
    	   
    	  /* Actions a = new Actions(driver);
    	   Thread.sleep(5000);
    	   a.moveToElement(homePage.Admin());
    	   Thread.sleep(10000);
    	   a.click(homePage.Admin());*/
    	   
    	   //homePage.AddButton().click();
       }
        
  }
	
	@BeforeMethod
	public void launchBrowser() throws Throwable {
		driver = browserInitialization();
		driver.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closure() {
		driver.quit();
	}
	@DataProvider
	public Object[][] loginData() {
		Object[][] data= {{"Admin","admin123","Pass"},{"Abc123","Pavan@1234","Fail"}};
		return data;
		
	}
}
