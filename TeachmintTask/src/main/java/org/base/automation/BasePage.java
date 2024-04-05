package org.base.automation;

import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends InitObjects	 {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
   @FindBy(xpath="//div[contains(text(),'Administration')]")
   private WebElement AdministrationButon;

    public WebElement getAdministrationButon() {
	return AdministrationButon;
}

   
}
   
   

