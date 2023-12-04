package com.tutorialsninja.application.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tutorialsninja.application.elements.HomePageElements;
import com.tutorialsninja.webdriver.WebDriverClass;

public class HomePageActions extends HomePageElements{
	
//	1. Launch Application
	public void launchApplication() {
		launchAppliction(prop.getProperty("url"));
		Assert.assertEquals(getPageTitle(), prop.getProperty("title"));
		log("pass", "Application is launched successfully");
	}
		
//	2. Click on 'My Account' Drop menu
	public void clickOnMyAccountDropMenu() {
		scrollToElement(myAccountDropDown);
		click(myAccountDropDown);
		log("info", "Clicked on the my account button");
	}
	
//	3. Click on 'Register' option 
	public void clickOnRegisterOptionDD() {
		scrollToElement(registerFromDropDown);
		click(registerFromDropDown);
		log("info", "Clicked on the register option from drop menu");	
	}
//	4. Click on 'Login' option from Drop menu
	public void clickOnLoginOptionDD() {
		scrollToElement(loginFromDropDown);
		click(registerFromDropDown);
		log("info", "Clicked on the login option from drop menu");		
	}
	
//	5. Verify Registration page is launched successfully
	public void verifyRegisterAccountPageIsLaunchedSuccessfully() {
		waitForElement(regAccTitleLocator, 10);
		log("pass", "Application register account page is launched successfully");
	}
		
//	6. Verify Registration page is launched successfully
	public void verifyLoginAccountPageIsLaunchedSuccessfully() {
		waitForElement(newCustomerRegiTitlelocator, 10);
		log("pass", "Application  login page is launched successfully");
	}
	
	public static HomePageActions getHomePage() {
		return PageFactory.initElements(new WebDriverClass().getDriver(), HomePageActions.class);
	}


}
