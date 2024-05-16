package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjects.HomePage;
import PageObjects.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsDefinition {
	
	WebDriver driver = new FirefoxDriver();
	HomePage homePage ;
	RegistrationPage regPage;
	String url = "https://demowebshop.tricentis.com/";
	
	/*
	 * Scenario: Validate the login functionality using valid credentials
	 */
	@Given("user is on the home page")
	public void launch() {
	 System.out.println("Hi from Login StepDefinitions file ");
	 homePage = new HomePage(driver);
	 regPage = new RegistrationPage(driver);
	 homePage.launchSite(url);
	}
	@When("user clicks on login link")
	public void user_clicks_on_login_link() {
		
	}
	@Then("login component should be displayed")
	public void login_component_should_be_displayed() {
	    
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   
	}
	@When("clicks on submit button")
	public void clicks_on_submit_button() {
	    
	}
	@Then("user should be logged in")
	public void user_should_be_logged_in() {
	   
	}
	
	/*
	 *  Scenario Outline: Validate user registration process
	 */
	
	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
		 homePage.clickOnRegisterLink();
	}
	@Then("registration page is displaed")
	public void registration_page_is_displaed() {
	    
	}
	@When("user enters {string} and {string} and {string} and {string}")
	public void user_enters_and_and_and(String firstName, String lastName, String email, String password) {
	  regPage.selectGender("Male");
	  regPage.newUserRegistration(firstName, lastName, email, password);
	  regPage.logOut();
	}

}
