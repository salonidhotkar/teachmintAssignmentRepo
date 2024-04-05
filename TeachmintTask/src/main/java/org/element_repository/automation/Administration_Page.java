package org.element_repository.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Administration_Page extends BasePage	 {

	public Administration_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@FindBy(xpath = "//div[contains(text(),'Administration')]")
	private WebElement Administration;
	
	@FindBy(xpath="//a[contains(text(),'Certificates')]")
	private WebElement CertificateButton;
	
	@FindBy(xpath = "//h6[contains(text(),'School leaving certificate')]/../../../..//h6[contains(text(),'Default templates - 7')]")
	private WebElement schoolleavingcertificate;

	public WebElement getAdministration() {
		return Administration;
	}

	public WebElement getCertificateButton() {
		return CertificateButton;
	}

	public WebElement getSchoolleavingcertificate() {
		return schoolleavingcertificate;
	}
	
	public void clickonAdministration() {
		Administration.click();
		CertificateButton.click();
	
	}

	
		
	}
	
	
	
	
	
	
	
   
	
	

