package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	 WebDriver driver;
	 public AdminPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
}
	 
	 @FindBy(xpath="(//h6[normalize-space()='Admin'])[1]")
	 WebElement adminIcon;
	 
	 @FindBy(xpath="//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	 WebElement userDrop;
	 
	 @FindBy(xpath="//input[@placeholder='Type for hints...']")
	 WebElement employeeName;
	 
	 @FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	 WebElement statusDrop;
	 
	 @FindBy(xpath="div[class='oxd-form-row'] div[class='oxd-grid-2 orangehrm-full-width-grid'] div[class='oxd-grid-item oxd-grid-item--gutters'] div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']")
	 WebElement unName;
	 
	 @FindBy(xpath="(//input[@type='password'])[1]")
	 WebElement pWord;
	 
	 @FindBy(xpath="(//input[@type='password'])[2]")
	 WebElement cnfrmPwd;
	 
	 @FindBy(css="button[type='submit']")
	 WebElement save;
	 
	 public WebElement AdminIcon() {
		 return  adminIcon;
	 }
	 
	 public WebElement UserDrop() {
		 return  userDrop;
	 }
	 public WebElement EmployeeName() {
		 return  employeeName;
	 }
	 public WebElement StatusDrop() {
		 return  statusDrop;
	 }
	 public WebElement UnName() {
		 return  unName;
	 }
	 public WebElement pWord() {
		 return  pWord;
	 }
	 public WebElement CnfrmPwd() {
		 return  cnfrmPwd;
	 }
	 public WebElement Save() {
		 return  save;
	 }
}
