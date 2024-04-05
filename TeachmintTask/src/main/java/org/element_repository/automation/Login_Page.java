package org.element_repository.automation;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import base.BasePage;

public class Login_Page extends BasePage {
	public Login_Page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[contains(@placeholder,'Email or Mobile number')]")
	private WebElement PhoneNumberTextBox;
	
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	private WebElement NextButton;	
	
	@FindBy(xpath="//button[contains(text(),'Submit OTP')]")
	private WebElement SubmitButton;
	
	@FindBy(xpath = "//input[@data-group-idx]")
	private List<WebElement> otpFields;

	public WebElement getPhoneNumberTextBox() {
		return PhoneNumberTextBox;
	}

	public WebElement getNextButton() {
		return NextButton;
	}
	

	
	
	public void sendotp(String mono,String otp) {
		PhoneNumberTextBox.sendKeys(mono);
		NextButton.click();
	   
		for(int i=0;i<otp.length();i++)
		{
			   WebElement otpField = otpFields.get(i);
			   otpField.sendKeys(String.valueOf(otp.charAt(i)));
		}
	
		SubmitButton.click();
		Reporter.log("Successfully Login",true);
	}

	
	}
	
	
	


}
