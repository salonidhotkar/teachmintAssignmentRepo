package org.base.automation;

import java.io.IOException;
import java.time.Duration;


import org.automation.generic_utilities.InitObjects;
import org.automation.generic_utilities.ReadTestData;
import org.element_repository.automation.Login_Page;
import org.generic_utilities.automation.Initobject;
import org.generic_utilities.automation.Java_util;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public  abstract class BaseTest extends Initobject  {

	
	public ReadTestData readData=new ReadTestData();
	public Java_util jutility=new Java_util();
	
	@BeforeClass
	public void config_BC() {
		initClass = new InitObjects();
		readData = initClass.getReadTestData();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully", true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIMEOUT));
		explicitWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_TIMEOUT));

		
	}

	
	@BeforeMethod(alwaysRun = true)
	public void loginToApplication() throws IOException {
		
		String URL = jutility.data("URL");
		String MobileNumber = jutility.data("MobileNumber");
		String OTP = jutility.data("otp");

		driver.get(URL);
		loginPage = new Login_Page(driver);
		loginPage.login(MobileNumber, OTP);
		
	}

	
}
