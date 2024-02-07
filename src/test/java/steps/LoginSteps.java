package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

///ctrl + shift+ o --to import the unimported content from class

public class LoginSteps

{
	
		
		@Given("I am at the login page")
		public void navToLoginPage() {
			System.out.println("Navigating to login page");
		}
		
		@When("I click on login button")
		public void clickOnLogin()
		{
			System.out.println("Clicking on login button");
		}
		
		@When("I enter the credentials")
		public void enteringCredentials()
		{
			System.out.println("Entering credentials");
		}
		
		@Then("I should be able to login")
		public void validateLogin()
		{
			System.out.println("Validating login");
		}

	}




	

