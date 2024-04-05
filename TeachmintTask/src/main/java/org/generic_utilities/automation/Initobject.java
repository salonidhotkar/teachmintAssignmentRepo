package org.generic_utilities.automation;


import org.automation.element_repository.Login_Page;
import org.automation.generic_utilities.InitObjects;
import org.automation.generic_utilities.ReadTestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Initobject implements FrameworkConstants {
	public static WebDriver static_driver_ref;
	public WebDriver driver;
	public InitObjects initClass; 
	public ReadTestData readData;
	public WebDriverWait explicitWait;
	public org.element_repository.automation.Login_Page loginPage;
	public String URL;
	public String MobileNumber;
	public String OTP;
	
	
	
	

	

}

