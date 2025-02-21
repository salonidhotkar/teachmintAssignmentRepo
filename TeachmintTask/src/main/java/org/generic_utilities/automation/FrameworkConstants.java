package org.generic_utilities.automation;


	public interface FrameworkConstants {

		String CHROME_KEY = "webdriver.chrome.driver";
		String CHROME_PATH = "./src/main/resources/drivers/chromedriver.exe";

		String FIREFOX_KEY = "webdriver.gecko.driver";
		String FIREFOX_PATH = "./src/main/resources/drivers/geckodriver.exe";

		String EXCEL_PATH = "./src/test/resources/testData/testData.xlsx";
		String PROPERTYFILE_PATH = "./src/test/resources/common.properties";
		String SCREENSHOT_PATH = "./errorShots/";
		
		int PAGE_LOAD_TIMEOUT = 20;
		int IMPLICIT_TIMEOUT = 20;
		int EXPLICIT_TIMEOUT = 20;

}

