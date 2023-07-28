package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {
	
	@Given("I am on Ebay home page")
	public void i_am_on_ebay_home_page() {
	    System.out.println("given");
	}

	@When("I click on advanced link")
	public void i_click_on_advanced_link() {
		System.out.println("when");
	}

	@Then("I navigate to Advanced search page")
	public void i_navigate_to_advanced_search_page() {
	    // Write code here that turns the phrase above into 
	    
	}

}
