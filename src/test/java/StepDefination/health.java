package StepDefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import POM.CarInsurance;
import POM.HealthInsurance;
import POM.TravelInsurance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class health {
	
	static WebDriver driver=BaseClass.getDriver();
	static HealthInsurance hi;
	
	@Given("user is on the policy bazaar web link")
	public void user_is_on_the_policy_bazaar_web_link() throws InterruptedException {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user click on insurance products")
	public void user_click_on_insurance_products() {
		hi=new HealthInsurance(BaseClass.getDriver());

		hi.clickproducts();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user prints health insurance products")
	public void user_prints_health_insurance_products() throws IOException {
		hi.printhealthproducts();
		hi.returnback();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	//smoke
	
	@Then("user verifies the whether insurance products displayed")
	public void user_verifies_the_whether_insurance_products_displayed() {
		hi=new HealthInsurance(BaseClass.getDriver());
		hi.clickheader();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user verifies the whether health insurance products displayed")
	public void user_verifies_the_whether_health_insurance_products_displayed() {
		hi=new HealthInsurance(BaseClass.getDriver());
		hi.clickheadersub();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	

}
