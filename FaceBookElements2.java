package com.raj.suryatraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FaceBookElements2 {
	WebDriver driver;
	
	private final String INPUT_NAME = "//input[@name='firstname']";
	private final String INPUT_LNAME = "//input[@name='lastname']";
	private final String INPUT_EMAIL = "//input[@name='reg_email__']";
	
	public FaceBookElements2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 5), this);
	}
	
	@FindBy(xpath = INPUT_NAME)
	private WebElement inputName;
	
	@FindBy(xpath= INPUT_LNAME)
	private WebElement inputLname;
	
	@FindBy(xpath=INPUT_EMAIL)
	private WebElement inputEmail;
	
	
	public WebElement getInputName() {
		return inputName;
	}
	
	public WebElement getInputLname() {
		return inputLname;
	}
	
	public WebElement getInputEmail() {
		return inputEmail;
	}
	

}
