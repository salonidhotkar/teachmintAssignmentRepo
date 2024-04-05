import java.security.cert.Certificate;

import org.base.automation.BaseTest;
import org.element_repository.automation.Account_Page;
import org.element_repository.automation.Administration_Page;
import org.element_repository.automation.Certificate_Page;
import org.element_repository.automation.Edit_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TeachMint_TC_001 extends BaseTest {
	
	@Test
	public void dashborad() {
		
		Actions act=new Actions(driver);
		act.moveToElement(null)
		
		Account_Page acc=new Account_Page(driver);
		acc.getClickedonAccountBox().click();
		Reporter.log("Sucessfully clicked on AccountBox",true);
		
		Administration_Page admin=new Administration_Page(driver);
		admin.clickonAdministration();
		Reporter.log("Sucessfully Clicked on Administration module",true);
		
		admin.getCertificateButton().click();
		Reporter.log(" Sucessfully Clicked on Certificatebutton",true);
		
		admin.getSchoolleavingcertificate().click();
		Reporter.log("Sucessfully clicked on SchoolLeavingCertificate",true);
		
		Certificate_Page certificate=new Certificate_Page(driver);
		certificate.getGeneratebutton().click();
		Reporter.log("Sucessfully Clicked on GenerateButton",true);
		
		Edit_page edit=new Edit_page(driver);
		edit.getEditpageGenerateButton().click();
		Reporter.log("Sucessfully clicked on GenerateButton",true);
		
		edit.getRemarkButton().sendKeys("pass");
		Reporter.log("Sucessfully enter Remarked",true);
		
		edit.getGenerateButton().click();
		Reporter.log("Sucessfully clicked on generatebutton",true);
		
		WebElement download = driver.findElement(By.xpath("//h4[contains(text(),'Document generated successfully')]"));
		System.out.println(download.getText());
		
		edit.getDownloadbutton().click();
		Reporter.log("Sucessfully clicked on downloadbutton",true);
		
		
		
		
		
		
		
	}
	

}
