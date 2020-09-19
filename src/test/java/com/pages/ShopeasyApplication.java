package com.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import setupFiles.BaseUtils;

public class ShopeasyApplication {

	WebDriver driver;
	BaseUtils baseUtils;
	static WebDriverWait wait;

	/**
	 * ShopeasyApplication() is a constructor.
	 * @param driver
	 * Initializes the Web Elements and Methods
	 */
	public ShopeasyApplication(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ---------------------------------------Web Object ---------------------------------------------------------
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Contact Us')]")
	private WebElement contactUs;
	public WebElement getContactUs() {
		return contactUs;
	}
	public WebElement getHeaderTitle(String value) {
		return driver.findElement(By.xpath("//*[@class='navbar-brand' and contains(text(),'" + value + "')]"));
	}
	@FindBy(how = How.XPATH, using = "//div[@class='form-top-left']/h3")
	private WebElement contactUsTextOnLandingPage;
	public WebElement getContactUsTextOnLandingPage() {
		return contactUsTextOnLandingPage;
	}
	@FindBy(how = How.ID, using = "email")
	private WebElement emailField;
	public WebElement getEmailField() {
		return emailField;
	}
	
	@FindBy(how = How.ID, using = "subject")
	private WebElement subField;
	public WebElement getSubField() {
		return subField;
	}
	@FindBy(how = How.ID, using = "message")
	private WebElement messageField;
	public WebElement getMessageField() {
		return messageField;
	}
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private WebElement btnSubmit;
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Thank you, Your Message stored in our Server we will contact through corresponding Mail')]")
	private WebElement thankYouText;
	public WebElement getThankYouText() {
		return thankYouText;
	}
	public WebElement getLinks(String value) {
		return driver.findElement(By.xpath("//*[@class=\"nav navbar-nav\"]/li/a[contains(text(),'" + value + "')]"));
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'SignUp')]")
	private WebElement signUp;
	public WebElement getSignUp() {
		return signUp;
	}
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Register Here !')]")
	private WebElement registerHere;
	public WebElement getRegisterHere() {
		return registerHere;
	}
	@FindBy(how = How.XPATH, using = "//div[@class='form-actions']/button")
	private WebElement userSubmitBtn;
	public WebElement getUserSubmitBtn() {
		return userSubmitBtn;
	}
	@FindBy(how = How.ID, using = "firstName")
	private WebElement firstNameField;
	public WebElement getFirstNameField() {
		return firstNameField;
	}
	@FindBy(how = How.ID, using = "lastName")
	private WebElement lastNameField;
	public WebElement getLastNameField() {
		return lastNameField;
	}
	@FindBy(how = How.ID, using = "users.emailId")
	private WebElement userEmailField;
	public WebElement getUserEmailField() {
		return userEmailField;
	}
	@FindBy(how = How.ID, using = "customerPhone")
	private WebElement customerPhoneField;
	public WebElement getcustomerPhoneField() {
		return customerPhoneField;
	}
	@FindBy(how = How.ID, using = "shippingAddress.address")
	private WebElement saddress;
	public WebElement getsaddress() {
		return saddress;
	}
	@FindBy(how = How.ID, using = "shippingAddress.city")
	private WebElement scity;
	public WebElement getScity() {
		return scity;
	}
	@FindBy(how = How.ID, using = "shippingAddress.state")
	private WebElement sstate;
	public WebElement getSstate() {
		return sstate;
	}
	@FindBy(how = How.ID, using = "shippingAddress.country")
	private WebElement sCountry;
	public WebElement getsCountry() {
		return sCountry;
	}
	@FindBy(how = How.ID, using = "shippingAddress.zipcode")
	private WebElement sZipcode;
	public WebElement getsZipcode() {
		return sZipcode;
	}
	@FindBy(how = How.ID, using = "billingAddress.address")
	private WebElement baddress;
	public WebElement getbaddress() {
		return baddress;
	}
	@FindBy(how = How.ID, using = "billingAddress.city")
	private WebElement bcity;
	public WebElement getbcity() {
		return bcity;
	}
	@FindBy(how = How.ID, using = "billingAddress.state")
	private WebElement bstate;
	public WebElement getbstate() {
		return bstate;
	}
	@FindBy(how = How.ID, using = "billingAddress.country")
	private WebElement bcountry;
	public WebElement getbcountry() {
		return bcountry;
	}
	@FindBy(how = How.ID, using = "billingAddress.zipcode")
	private WebElement bzipcode;
	public WebElement getbzipcode() {
		return bzipcode;
	}
	@FindBy(how = How.ID, using = "pass")
	private WebElement passField;
	public WebElement getpassField() {
		return passField;
	}
	@FindBy(how = How.ID, using = "confirmpass")
	private WebElement confirmpassField;
	public WebElement getConfirmpassField() {
		return confirmpassField;
	}
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Registered Successfully. Login using username and password')]")
	private WebElement thankYouRegisterText;
	public WebElement getThankYouRegisterText() {
		return thankYouRegisterText;
	}
	
	@FindBy(how = How.XPATH, using = "//p[@class='font-weight-bold top-space-10']")
	private List<WebElement> listofProducts;
	public List<WebElement> getlistofProducts() {
		return listofProducts;
	}
	
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Login')]")
	private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='j_username']")
	private WebElement emaillogin;
	public WebElement getEmaillogin() {
		return emaillogin;
	}
	@FindBy(how = How.XPATH, using = "//input[@name='j_password']")
	private WebElement passLogin;
	public WebElement getPassLogin() {
		return passLogin;
	}
	@FindBy(how = How.XPATH, using ="//button[@class='btn btn-sm btn-success']")
	private WebElement loginBtnOnSignUp;
	public WebElement getloginBtnOnSignUp() {
		return loginBtnOnSignUp;
	}
	@FindBy(how = How.XPATH, using ="//div[@class='panel-heading']/h3")
	private WebElement signInText;
	public WebElement getSignInText() {
		return signInText;
	}
	@FindBy(how = How.XPATH, using ="//li/a[contains(text(),'Welcome..Ram@xyz.com')]")
	private WebElement welcomeTextOnLogin;
	public WebElement getWelcomeTextOnLogin() {
		return welcomeTextOnLogin;
	}
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Cart')]")
	private WebElement cartOption;
	public WebElement getCartOption() {
		return cartOption;
	}
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),' Logout')]")
	private WebElement logOutOption;
	public WebElement getlogOutOption() {
		return logOutOption;
	}
	@FindBy(how = How.XPATH, using ="//li/a[contains(text(),'Login')]")
	private WebElement loginOption2;
	public WebElement getloginOption2() {
		return loginOption2;
	}
	
	
	@FindBy(how = How.XPATH, using ="//div[contains(text(),'You have logged out successfully')]")
	private WebElement logoutText;
	public WebElement getLogoutText() {
		return logoutText;
	}
	// **************************************************Methods************************************************
	/**
	 * validateThePageHeader(String expected) This method
	 * validates all the webElements present on the Screen.
	 * @author Kajal
	 * @param expected text - User expected text
	 */
	public void validateThePageHeader(String expected) {
		try {
			Thread.sleep(10000);
 			if (getHeaderTitle(expected).isDisplayed()) {
				System.out.println("Validation is successful. Value expected is :- " + expected);
			} else {
				System.out.println("Ran into Else block!! ");
			}
		} catch (Exception e) {
			System.out.println("Exception in validateThePageHeader() Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateAllLinks(String expected,String exp1) This method
	 * validates all the Links present on the Screen by clicking on them
	 * @author Kajal
	 * @param expected text - User expected text
	 * @param String exp1 - User expected text in URL
	 */
	public void validateAllLinks(String expected,String exp1) {
		try {
			Thread.sleep(10000);
			getLinks(expected).click();
			if (driver.getCurrentUrl().contains(exp1)) {
				System.out.println("Validation is successful. Url expected is :- "+ driver.getCurrentUrl());
			} else {
				System.out.println("Ran into Else block!! ");
			}
		} catch (Exception e) {
			System.out.println("Exception in validateAllLinks Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateUserCreation() This method
	 * Create user in the application
	 * @author Kajal
	 */
	public void validateUserCreation() {
		try {
			Thread.sleep(10000);
			getSignUp().click();
			Thread.sleep(1000);
			Assert.assertTrue(getRegisterHere().isDisplayed());
			System.out.println("Expected Page User landed is on Page: Regsiter Here! " );
			Thread.sleep(2000);
			getFirstNameField().sendKeys("Ram");
			System.out.println("Value entered is : "+ getFirstNameField().getAttribute("value"));
			
			getLastNameField().sendKeys("Singh");
			System.out.println("Value entered is : "+ getLastNameField().getAttribute("value"));
			
			getUserEmailField().sendKeys("Ram@xyz.com");
			System.out.println("Value entered is : "+ getUserEmailField().getAttribute("value"));
			
			getcustomerPhoneField().sendKeys("0000000000");
			System.out.println("Value entered is : "+ getcustomerPhoneField().getAttribute("value"));
			
			getsaddress().sendKeys("BLR");
			System.out.println("Value entered is : "+ getsaddress().getAttribute("value"));
			
			getScity().sendKeys("BLR");
			System.out.println("Value entered is : "+ getScity().getAttribute("value"));
			
			getSstate().sendKeys("KARNATAKA");
			System.out.println("Value entered is : "+ getSstate().getAttribute("value"));
			
			getsCountry().sendKeys("INDIA");
			System.out.println("Value entered is : "+ getsCountry().getAttribute("value"));
			
			getsZipcode().sendKeys("560100");
			System.out.println("Value entered is : "+ getsZipcode().getAttribute("value"));
			
			getbaddress().sendKeys("BLR");
			System.out.println("Value entered is : "+ getbaddress().getAttribute("value"));
			
			getbcity().sendKeys("BLR");
			System.out.println("Value entered is : "+ getbcity().getAttribute("value"));
			
			getbstate().sendKeys("KARNATAKA");
			System.out.println("Value entered is : "+ getbstate().getAttribute("value"));
			
			getbcountry().sendKeys("INDIA");
			System.out.println("Value entered is : "+ getbcountry().getAttribute("value"));
			
			getbzipcode().sendKeys("560100");
			System.out.println("Value entered is : "+ getbzipcode().getAttribute("value"));
			
			getpassField().sendKeys("Ram@123");
			getConfirmpassField().sendKeys("Ram@123");
			Thread.sleep(2000);
			getUserSubmitBtn().click();
			System.out.println("Click on Submit Button");
			Thread.sleep(3000);
			Assert.assertTrue(getThankYouRegisterText().isDisplayed());
			System.out.println("Executed the Method: - validateContactUsPage");
		} catch (Exception e) {
			System.out.println("Exception in validateUserCreation Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateLoginUser() This method
	 * validates login functionality of user
	 * @author Kajal
	 */
	public void validateLoginUser() {
		try {
			Thread.sleep(10000);
			getloginOption2().click();
			Thread.sleep(2000);
			Assert.assertTrue(getSignInText().isDisplayed());
			System.out.println("Expected Page User landed is on Page: Sign In Here! " );
			Thread.sleep(2000);
			getEmaillogin().sendKeys("Ram@xyz.com");
			System.out.println("Value entered is : "+ getEmaillogin().getAttribute("value"));
			Thread.sleep(1000);
			getPassLogin().sendKeys("Ram@123");
			Thread.sleep(1000);
			getloginBtnOnSignUp().click();
			Assert.assertTrue(getWelcomeTextOnLogin().isDisplayed());
			System.out.println("Executed the Method: - validateContactUsPage");
		} catch (Exception e) {
			System.out.println("Exception in validateLoginUser Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateLoginUserAndPerformAction() This method
	 * validates the Login user is able to perform some actions on the page
	 * @author Kajal
	 */
	public void validateLoginUserAndPerformAction() {
		try {
			Thread.sleep(4000);
			getCartOption().click();
			Thread.sleep(1000);
			//getWelcomeTextOnLogin().click();
			driver.navigate().back();
			System.out.println("Executed the method: validateLoginUserAndPerformAction");
		} catch (Exception e) {
			System.out.println("Exception in validateLoginUserAndPerformAction Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateLogOutUser() This method
	 * validates the logout Functionality of the User
	 * @author Kajal
	 */
	public void validateLogOutUser() {
		try {
			Thread.sleep(4000);
			getlogOutOption().click();
			Assert.assertTrue(getLogoutText().isDisplayed());
			System.out.println("Executed the method: validateLogOutUser");
		} catch (Exception e) {
			System.out.println("Exception in validateLogOutUser Method" + e.getLocalizedMessage());
		}
	}
	/**
	 * validateContactUsPage() This method
	 * validates the Contact Us Functionality of the User
	 * @author Kajal
	 */
	public void validateContactUsPage(String Email, String Subject, String Message) {
		try {
			Thread.sleep(10000);
			getContactUs().click();
			Thread.sleep(1000);
			Assert.assertEquals(getContactUsTextOnLandingPage().getText(),"Contact us");
			System.out.println("Expected Page User landed is on:  " + getContactUsTextOnLandingPage().getText());
			Thread.sleep(2000);
			getEmailField().sendKeys(Email);
			System.out.println("Value entered is : " +Email);
			getSubField().sendKeys(Subject);
			System.out.println("Value entered is : " +Subject);
			getMessageField().sendKeys(Message);
			System.out.println("Value entered is : " +Message);
			Thread.sleep(1000);
			getBtnSubmit().click();
			System.out.println("Click on Submit Button");
			Thread.sleep(2000);
			Assert.assertTrue(getThankYouText().isDisplayed());
			System.out.println("Executed the Method: - validateContactUsPage");
		} catch (Exception e) {
			System.out.println("Exception in validateContactUsPage Method" + e.getLocalizedMessage());
		}
	}
}