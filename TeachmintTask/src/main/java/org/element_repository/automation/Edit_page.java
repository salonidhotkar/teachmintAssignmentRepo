package org.element_repository.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Edit_page extends BasePage {

	public Edit_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[contains(text(),'Generate')]")
	private WebElement editpageGenerateButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Remarks')]")
	private WebElement RemarkButton;
	
	@FindBy(xpath = "//div[contains(text(),'Generate')]")
	private WebElement GenerateButton;
	
	@FindBy(xpath="//div[contains(text(),'Download')]")
	private WebElement downloadbutton; 
	

	public WebElement getDownloadbutton() {
		return downloadbutton;
	}

	public WebElement getGenerateButton() {
		return GenerateButton;
	}

	public WebElement getEditpageGenerateButton() {
		return editpageGenerateButton;
	}

	public WebElement getRemarkButton() {
		return RemarkButton;
	}
	

}
