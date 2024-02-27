package StepDefination;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Factory.BaseClass;
import POM.TravelInsurance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import junit.framework.Assert;

public class travel {
	
	static WebDriver driver=BaseClass.getDriver();
	static TravelInsurance ti;
	
	
	@Given("user is on the policy bazaar site")
	public void user_is_on_the_policy_bazaar_site() throws InterruptedException {
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user click on travel insurance")
	public void user_click_on_travel_insurance() {
		ti=new TravelInsurance(BaseClass.getDriver());
		ti.choosetravelinsurance();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("user selects the destination {string}")
	public void user_selects_the_destination(String string1) {
		ti.destination(string1);
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	/*@When("user selects the destination")
	public void user_selects_the_destination() {
		ti.destination();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}*/

	@When("user selects the trip duration")
	public void user_selects_the_trip_duration() throws InterruptedException {
		ti.datepathclick();
		ti.tripduration("March 2024", "13");
		ti.tripduration("May 2024", "13");
		ti.dateproceedclick();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user selects the count and age of travellers")
	public void user_selects_the_count_and_age_of_travellers() {
		ti.travellersage();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user submit the medical condition survey")
	public void user_submit_the_medical_condition_survey() {
		ti.medicalsurvey();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	@When("user provide the mobile number {string}")
	public void user_provide_the_mobile_number(String string2) throws InterruptedException {
		ti.phonenumberenter(string2);
		Thread.sleep(3000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	/*@When("user provide the mobile number")
	public void user_provide_the_mobile_number() {
		ti.phonenumberenter();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}*/

	@Then("user selects student plans")
	public void user_selects_student_plans() {
		ti.studentplan();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user provide the typical trip duration")
	public void user_provide_the_typical_trip_duration() throws InterruptedException {
		ti.tinsduration();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user modify the content with sort by")
	public void user_modify_the_content_with_sort_by() {
		ti.sort();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("print lowest three plans")
	public void print_lowest_three_plans() throws IOException {
		ti.printtravelplans();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	//smoke
	
	@Then("user verifies the travel insurance icon")
	public void user_verifies_the_travel_insurance_icon() {
		ti=new TravelInsurance(BaseClass.getDriver());
		ti.travelbuttoncheck();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is in destinations page")
	public void user_is_in_destinations_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		//ti=new TravelInsurance(BaseClass.getDriver());
	    System.out.println("title is:"+ti.titlevalidations1());
	    Assert.assertEquals("Destinations",ti.titlevalidations1());
	}

	@Given("user is in on the trip date page")
	public void user_is_in_on_the_trip_date_page() {
		System.out.println("title is:"+ti.titlevalidations1());
	    Assert.assertEquals("Trip date",ti.titlevalidations1());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is on the travellers page")
	public void user_is_on_the_travellers_page() {
		System.out.println("title is:"+ti.titlevalidations1());
	    Assert.assertEquals("Travellers",ti.titlevalidations1());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is on the medical history page")
	public void user_is_on_the_medical_history_page() {
		System.out.println("title is:"+ti.titlevalidations1());
	    Assert.assertEquals("Medical history",ti.titlevalidations1());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is on the contact details page")
	public void user_is_on_the_contact_details_page() {
		System.out.println("title is:"+ti.titlevalidations1());
	    Assert.assertEquals("Contact details",ti.titlevalidations1());
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("user is on the traveller insurance plans page")
	public void user_is_on_the_traveller_insurance_plans_page() {
		System.out.println("title is:"+ti.titlecheck());
	    Assert.assertEquals("PolicyBazaar Travel Insurance - Quotes",ti.titlecheck());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on the policy bazaar icon")
	public void user_clicks_on_the_policy_bazaar_icon() {
		ti.mainpage();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	//regression
	
	@Given("user is on popup")
	public void user_is_on_popup() {
		System.out.println("title is:"+ti.travelslider());
	    Assert.assertEquals("Student Travel Information",ti.travelslider());
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	
	


}
