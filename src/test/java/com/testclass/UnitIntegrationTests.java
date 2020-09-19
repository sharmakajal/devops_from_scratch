package com.testclass;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.io.IOException;
/* Author Name		: 	Kajal Sharma
 * Creation Date	: 	13-07-2020
 * Epic/User story	: 	Interview Test Sample
 * Test case name	:   Complete flow of Product from Selecting to Purchasing it.
 * Prerequisite 	:   Application Url navigation.
 * Description		:   Validating complete process of any product from selection till purchasing it.
 * Tests Covered    :	a) visit ://weathershopper.pythonanywhere.com/
						b) Get the temperature
						c) Based on temperature choose to buy sunscreen or moisturizer
						d) If you choose sunscreen, then read Instructions and then add product accordingly
						e) If you choose moisturizer, then read Instructions and then add product accordingly
						f) Verify the cart
						g) Make payment
						h) verify successMessage.
 * 						
 * */
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import com.pages.ShopeasyApplication;

import setupFiles.BaseUtils;

public class UnitIntegrationTests {

	WebDriver driver;
	public String wait;
	ShopeasyApplication shopeasy;
	public String applicationURL;
	String titleHeader = "ShopIeasy";
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException {
		applicationURL = BaseUtils.InitProperties("url");
		System.setProperty("webdriver.gecko.driver", BaseUtils.getPresentWorkingDir()+File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"com"+File.separator+"external"+File.separator+"geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(applicationURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("Title of Page:" + driver.getTitle());
		System.out.println("Executed the Before Test Case");
	}
	
	@BeforeMethod
	public void BeforeEachMehtod(Method method) {
		System.out.println("Running the Test cases Before Method");
		shopeasy = new ShopeasyApplication(driver);
	}
	
	@Test(priority = 1)
	public void TS_ValidateTheHomePageShopEasy() {
		try {
			System.out.println("Executing the TS_ValidateTheHomePageShopEasy Test Case");
			shopeasy.validateThePageHeader(titleHeader);
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateTheHomePageShopEasy() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 2)
	public void TS_ValidateAlltheLinks() {
		try {
			System.out.println("Executing the TS_ValidateAlltheLinks Test Case");
			shopeasy.validateAllLinks("Home","index1");
			shopeasy.validateAllLinks("Product","login");
			shopeasy.validateAllLinks("About","aboutus");
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateAlltheLinks() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 3)
	public void TS_ValidateCreateUser(){
		try {
			System.out.println("Executing the TS_ValidateCreateUser Test Case");
			shopeasy.validateUserCreation();
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateCreateUser() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 4)
	public void TS_ValidateLoginUser(){
		try {
			System.out.println("Executing the TS_ValidateLoginUser Test Case");
			shopeasy.validateLoginUser();
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateLoginUser() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 5)
	public void TS_ValidateLoginUserPerformActions(){
		try {
			System.out.println("Executing the TS_ValidateLoginUserPerformActions Test Case");
			shopeasy.validateLoginUserAndPerformAction();
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateLoginUserPerformActions() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 6)
	public void TS_ValidateLogoutUser(){
		try {
			System.out.println("Executing the TS_ValidateLogoutUser Test Case");
			shopeasy.validateLogOutUser();
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateLogoutUser() : " +e.getLocalizedMessage());
		}	
	
	}
	@Test(priority = 7)
	public void TS_ValidateContactUsPage(){
		try {
			System.out.println("Executing the TS_ValidateContactUsPage Test Case");
			shopeasy.validateContactUsPage("Ram@xyz.com", "Product Complain","Product Model - Iphone2 Not working");
			System.out.println("TC's executed successfully");
		}catch(Exception e) {
			System.out.println("Exception if any caught in TS_ValidateContactUsPage() : " +e.getLocalizedMessage());
		}	
	}
	@AfterMethod()
	public void mandatoryAfterMethod(ITestResult testResult) throws Exception
	{
			System.out.println("Executed the After Method Class");
	}
	@AfterClass(alwaysRun = true)
	public void afterclass() {
		System.out.println("Executed the After Class");
		driver.quit();	
	}
	
}
