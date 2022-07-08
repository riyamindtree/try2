package pageobject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.HomeUI;
import utilities.Logs;

public class HomePage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public HomePage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	
	public void enterSearch(String text) {
		
		helper.explicitWaitForInvisibilty(HomeUI.SearchBox, 80);
		helper.sendText(HomeUI.SearchBox, text);
		log.info("product name entered");
	}
	
	public void clickSearchButton() {
		helper.explicitWaitForInvisibilty(HomeUI.ClickButton, 80);
		helper.clickButton(HomeUI.ClickButton);
		log.info(" product searched");
	}

}
