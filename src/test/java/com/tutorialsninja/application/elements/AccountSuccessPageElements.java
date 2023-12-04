package com.tutorialsninja.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.commons.WebCommons;

public class AccountSuccessPageElements extends WebCommons {

	@FindBy(xpath = "(//a[normalize-space()='Continue']")
	protected WebElement continueBtnOnAccSuccessPage;

	protected By accountSuccessMsgOnAccSuccessPage = By
			.xpath("//h1[normalize-space()='Your Account Has Been Created!']");

	protected By congratulationsSuccessMsgOnAccSuccessPage = By.xpath("(//ul[@class='breadcrumb']/following::p)[1]");

	public static AccountSuccessPageElements getRegistrationPageElements(WebDriver driver) {
		return PageFactory.initElements(driver, AccountSuccessPageElements.class);
	}

}
