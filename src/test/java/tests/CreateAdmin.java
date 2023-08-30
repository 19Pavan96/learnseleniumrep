package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.AdminPage;
import resources.Base;
import org.openqa.selenium.support.ui.Select;

public class CreateAdmin extends Base{
	WebDriver driver;
	@Test
	public void createAdmin() throws Throwable {
		
		
		
		HomePage homePage = new HomePage(driver);
		homePage.Admin().click();
		homePage.AddButton().click();
		
		AdminPage adminPage = new AdminPage(driver);
		Assert.assertTrue(adminPage.AdminIcon().isDisplayed());
		
		
		Select select = new Select(adminPage.UserDrop());
		select.selectByVisibleText("ESS");
		adminPage.EmployeeName().sendKeys(prop.getProperty("Employee"));
		Select select1 = new Select(adminPage.StatusDrop());
		select1.selectByVisibleText("Enabled");
		adminPage.UnName().sendKeys(prop.getProperty("user"));
		adminPage.pWord().sendKeys(prop.getProperty("pword"));
		adminPage.CnfrmPwd().sendKeys(prop.getProperty("pword"));
		adminPage.Save().click();
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
}
