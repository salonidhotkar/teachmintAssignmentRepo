package org.element_repository.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class Certificate_Page  extends BasePage{

	public Certificate_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//div[contains(text(),'Generate')]")
	private WebElement generatebutton;

	public WebElement getGeneratebutton() {
		return generatebutton;
	}
			

}
