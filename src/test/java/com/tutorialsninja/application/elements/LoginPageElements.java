package com.tutorialsninja.application.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.commons.WebCommons;

public class LoginPageElements extends WebCommons {
	
	
	
	
	
	
	
	
	
	public static LoginPageElements getForgetLoginPageElements(WebDriver driver) {
		return PageFactory.initElements(driver, LoginPageElements.class);
	}
	
	

}
