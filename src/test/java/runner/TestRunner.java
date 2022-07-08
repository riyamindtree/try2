package runner;



import java.io.IOException;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pageobject.CartPage;
import pageobject.HomePage;
import pageobject.SearchPage;
import utilities.BaseClass;
import utilities.ExtentReports_;
import utilities.ReadExcel;
import utilities.SnapShot;
/*
public class TestRunner extends BaseClass {
	
	BaseClass baseclass;
	ReadExcel readexcel;
	SnapShot ss;
	ExtentReports_ reports;
	HomePage homepage;
	SearchPage searchpage;
	CartPage cartpage;
	
	@BeforeClass
	public void beforeClass() {
		reports = new ExtentReports_();
		reports.createReports();
		reports.createTest("furniture");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		baseclass = new BaseClass();
		baseclass.setUp();
		homepage = new HomePage();
		searchpage = new SearchPage();
		cartpage = new CartPage();
		ss = new SnapShot();
		readexcel = new ReadExcel();
		reports.logPass("opening browser");
	}
	
	@Test
	public void t1() throws IOException, InterruptedException {
		String data= ReadExcel.getStringData(1, 0);
		System.out.println(data);
		homepage.enterSearch(data);
	    homepage.clickSearchButton();
	    searchpage.clickOnResult();
	    searchpage.closePopUpTab();
	    //Thread.sleep(3000);
	    cartpage.addToCart();
	    //reports.logPass("passed");
		//ss.takeSnapShot("t1");
	    //Thread.sleep(8000);
	    String productName = cartpage.productInCart(); 
		System.out.println(productName);
		if(cartpage.productInCart().contains("Sofa")) {
			reports.logPass("passed");
			ss.takeSnapShot("t1");
		}
		else {
			reports.logFail("fail");
		}
		
	}
	   
		
		

	@AfterMethod
	public void afterMethod() {
		baseclass.tearDown();
		reports.logPass("closed");
	}
	@AfterClass
	public void afterClass() {
		reports.closeTest();
		reports.closeReport();
	}
	

	
}*/

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations")
public class TestRunner {

}
		

