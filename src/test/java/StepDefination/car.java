package StepDefination;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.BaseClass;
import POM.CarInsurance;
import POM.TravelInsurance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class car {
	
	static WebDriver driver=BaseClass.getDriver();
	static CarInsurance ca;
	
	@Given("user is on the policy bazaar web site")
	public void user_is_on_the_policy_bazaar_web_site() throws InterruptedException {
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user click on car insurance")
	public void user_click_on_car_insurance() throws InterruptedException {
		ca=new CarInsurance(BaseClass.getDriver());
        ca.choosecarinsurance();
        Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the buying new car")
	public void user_click_on_the_buying_new_car() {
		ca.buynewcar();

	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered city")
	public void user_click_on_the_prefered_city() {
		ca.selectcity();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered area")
	public void user_click_on_the_prefered_area() {
		ca.selectarea();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered brand")
	public void user_click_on_the_prefered_brand() {
		ca.selectbrand();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered model")
	public void user_click_on_the_prefered_model() {
		ca.selectmodel();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered varient")
	public void user_click_on_the_prefered_varient() {
		ca.selectvariant();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the prefered varient version")
	public void user_click_on_the_prefered_varient_version() {
		ca.selectvariantversion();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user enter invalid details")
	public void user_enter_invalid_details() throws IOException, InterruptedException, HeadlessException, AWTException {
		ca.captureinvalid();
		ca.screenshot();
		//Thread.sleep(3000);
		//ca.screenshot();
		//ca.car_homepage();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("user back to home page")
	public void user_back_to_home_page() {
		ca.car_homepage();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	//smoke
	
		@Then("user verifies the car insurance icon")
		public void user_verifies_the_car_insurance_icon() {
			ca=new CarInsurance(BaseClass.getDriver());
			ca.carbuttoncheck();
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the car insurance page")
		public void user_is_on_the_car_insurance_page() {
			System.out.println("title is:"+ca.titlechecks());
		    Assert.assertEquals("PolicyBazaar Car Insurance: Insure Your Car Today",ca.titlechecks());
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the city and rto page")
		public void user_is_on_the_city_and_rto_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select City & RTO",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the select car brand site")
		public void user_is_on_the_select_car_brand_site() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Brand",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the select car model page")
		public void user_is_on_the_select_car_model_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Model",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the select car fuel type page")
		public void user_is_on_the_select_car_fuel_type_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Fuel Type",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the select car varient page")
		public void user_is_on_the_select_car_varient_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Select Car Variant",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		@Given("user is on the filling details page")
		public void user_is_on_the_filling_details_page() {
			System.out.println("title is:"+ca.titlevalidations1());
		    Assert.assertEquals("Please Fill Your Details",ca.titlevalidations1());
		    // Write code here that turns the phrase above into concrete actions
		    //throw new io.cucumber.java.PendingException();
		}

		/*@Given("user is on the filing details page")
		public void user_is_on_the_filing_details_page() {
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
		}*/



}
