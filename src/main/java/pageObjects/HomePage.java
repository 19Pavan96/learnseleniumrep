package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	 WebDriver driver;
	 public HomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
}
	 
	 @FindBy(xpath= "//a[@class='oxd-main-menu-item active']")
	 WebElement admin;
	 
	 @FindBy(xpath="(//button[@normalize-space()='Add'])[1]")
	 WebElement addButton;
	 
	
	 
	 public WebElement Admin() {
		 return admin;
	 }
	 public WebElement AddButton() {
		 return addButton;
	 }
	
}
