package com.tutorialsninja.application.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.commons.WebCommons;

public class HomePageElements extends  WebCommons {
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
     protected WebElement myAccountDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	protected WebElement registerFromDropDown;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	protected WebElement loginFromDropDown;
	
	
	protected By regAccTitleLocator = By.xpath("//h1[contains(text(),'Register Account')]");
	protected By loginTitlelocator = By.xpath("//h2[normalize-space()='Returning Customer']");
	protected By newCustomerRegiTitlelocator = By.xpath("//h2[normalize-space()='Returning Customer']");
	
	public static HomePageElements getHomePageElements(WebDriver driver) {
		return PageFactory.initElements(driver, HomePageElements.class);
	}
	
}
