package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Browser 
{
	
	WebDriver driver;
	
	@Given("I open the browser")
	public WebDriver i_open_the_browser()
	{
	    System.out.println("Launching Chrome");
	     driver= new ChromeDriver();
	     
	     return driver;
	          
	}
	
	@When("I launch Apllication")
	public void i_launch_apllication() {
		driver.get("http://192.168.1.10/EWS_HSBC_PRODN/Login/Login#/Index");
	}

	@When("Passing Username\"{int}\"")
	public void passing_username(Integer int1) {
	    
	}

	@When("passing Password {string}")
	public void passing_password(String string) {
	    
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	    
	}

	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    
	}


}
