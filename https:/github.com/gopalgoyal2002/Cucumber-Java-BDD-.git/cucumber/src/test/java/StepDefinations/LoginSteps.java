package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	//	@Given("user is on login page")
	//	public void varifyLoginPage() {
	//		System.out.println("Hello World");
	//	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
//		throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Inside Step - user enters username and password");
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("Inside Step - clicks on login button");

		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

}
