package com.tutorialsninja.application.tests;

import org.testng.annotations.Test;

import com.tutorialsninja.application.actions.AccountSuccessPageActions;
import com.tutorialsninja.application.actions.HomePageActions;
import com.tutorialsninja.application.actions.LoginPageActions;
import com.tutorialsninja.application.actions.RegistrationPageActions;

public class TutorialsninjaTest {
    HomePageActions homePage;
    LoginPageActions loginPage;
    AccountSuccessPageActions accSuccPage;
    RegistrationPageActions regiPage;
    
    @Test(priority=1,groups= {"Smoke","Sanity"})
    public void verifyApplicationIsLaunchedSuccessfully() {
    	homePage = HomePageActions.getHomePage();
    	homePage.launchApplication();
	}
    
    
    
    
    
}
