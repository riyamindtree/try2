package pageobject;

import org.apache.logging.log4j.Logger;

import reusable.WebDriverHelper;
import uistore.CartUI;
import utilities.Logs;

public class CartPage {
	
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public CartPage() {
		helper = new WebDriverHelper();
		logUtil = new Logs();
		log = logUtil.createLog();
	}
	public void addToCart() {
		helper.explicitWaitForInvisibilty(CartUI.CartButton, 20);
		helper.clickButton(CartUI.CartButton);
		log.info("added to the cart");
	}
	
	public String productInCart() {
		helper.explicitWaitForInvisibilty(CartUI.CartProduct, 20);
		String text = helper.getText(CartUI.CartProduct);
		return text;
		
	}
	

}
