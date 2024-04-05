package org.element_repository.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import automation.base.Base_Page;

public class Account_Page extends Base_Page {

	public Account_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
		
	@FindBy(xpath="//span[contains(text(),'Automation')]")
	private WebElement clickedonAccountBox;

	public WebElement getClickedonAccountBox() {
		return clickedonAccountBox;
	}
	
	

}
