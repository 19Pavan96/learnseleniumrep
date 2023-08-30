package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
	 WebDriver driver;
	 public LoginPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath = "//input[@placeholder='Username']")
	 WebElement userName;
	 
	 @FindBy(xpath = "//input[@placeholder='Password']")
	 WebElement password;
	 
	 @FindBy(xpath = "//button[.=' Login ']")
	 WebElement loginButton;
	 
	 
	 public WebElement userName() {
		 return userName;
	 }
	 
	 public WebElement password() {
		 return password;
		 	 
	 }
	 
	 public WebElement loginButton() {
		 return loginButton;
	 }
  }
