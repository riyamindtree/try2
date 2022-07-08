package pageobject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.SearchUI;
import utilities.Logs;

public class SearchPage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public SearchPage() {
		
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
	public void clickOnResult() {
		helper.explicitWaitForInvisibilty(SearchUI.result2, 20);
		helper.clickButton(SearchUI.result2);
		log.info("product clicked");
	}
	public void closePopUpTab() {
		helper.explicitWaitForInvisibilty(SearchUI.closeTab, 20);
		helper.clickButton(SearchUI.closeTab);
		log.info("tab closed");
	}
	
	

}
