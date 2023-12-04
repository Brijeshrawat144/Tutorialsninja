package com.tutorialsninja.application.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.commons.WebCommons;

public class RegistrationPageElements extends WebCommons {
	
	@FindBy(xpath = "//input[@name='firstname']")
	protected WebElement firstnameTextBox;
	
	@FindBy(xpath="//input[@name='lastname']")
	protected WebElement lastnameTextBox;

	@FindBy(xpath = "//input[@name='email']")
	protected WebElement emailTextBox;
	
	@FindBy(xpath = "//input[@name='telephone']")
	protected WebElement telephoneTextBox;
	
	@FindBy(xpath = "//input[@name='telephone']")
	protected WebElement passwordTextBox;
	
	@FindBy(xpath = "//input[@name='confirm']")
	protected WebElement conformPasswordTextBox;
	
	@FindBy(xpath ="(//input[@name='newsletter'])[1]")
	protected WebElement newsletterSubscribeRadioYesBtn;
	
	@FindBy(xpath ="(//input[@name='newsletter'])[2]")
	protected WebElement newsletterSubscribeRadioNoBtn;
	
	@FindBy(xpath ="(//input[@name='agree']")
	protected WebElement privacyPolicyAgreeCheckBox;
	
	@FindBy(xpath ="(//input[@value='Continue']")
	protected WebElement continueER_1Btn;
	
	
	
	
	public static RegistrationPageElements getRegistrationPageElements(WebDriver driver) {
		return PageFactory.initElements(driver, RegistrationPageElements.class);
	}

	
	

}
