package uistore;

import org.openqa.selenium.By;

public class CartUI {
	
	public static By CartButton = By.xpath("//button[@id='add-to-cart-button']");
	public static By CartProduct = By.xpath("//div[@id='line_items']/descendant::div[@class='product-title']");


}
