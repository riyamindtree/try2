package stepdefinition;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import utilities.BaseClass;


public class stepDefinition {
	
	@RunWith(Cucumber.class)
	public class StepDefination {
		WebDriver driver;
	   
	    @Given("^User is on Loading Page$")
	    public void user_is_on_loading_page() throws Throwable {
	    	
	       }
	       
	       @When("^Login into applicaiton with username and Password$")
	       public void login_into_applicaiton_with_username_and_password() throws Throwable {
	       	System.out.println("login");
	           throw new PendingException();
	       }

	       @Then("^Home page populated$")
	       public void home_page_populated() {
	       System.out.println("homePage Populated");
	           throw new PendingException();
	       }

	       @And("^Close Driver$")
	       public void Close_Driver()
	       
	       {
	       	driver.close();
	       }

}
	    }
