package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginDefinition {

	LoginPage login = new LoginPage();
	
	@Given("i have URL and Launch the Browser")
	public void i_have_url_and_launch_the_browser() {
	   login.i_have_url_and_launch_the_browser(); 
	}

	@When("Click on the Try now")
	public void click_on_the_try_now() {
		login.click_on_the_try_now();  
	}

	@When("Click on the Signup")
	public void click_on_the_signup() {
	   login.click_on_the_signup();
	}

	@When("Verify the First Name")
	public void verify_the_first_name() {
	    login.verify_the_first_name();
	}

	@When("Verifythe Last Name")
	public void verifythe_last_name() {
	    login.verifythe_last_name();
	}

	@When("Verify the email")
	public void verify_the_email() {
	   login.verify_the_email();
	}

	@When("Verify the Password")
	public void verify_the_password() {
	   login.verify_the_password();
	}

	@When("Verifythe Confirm Password")
	public void verifythe_confirm_password() {
	  login.verifythe_confirm_password();
	}

	@When("Click on the Next button")
	public void click_on_the_next_button() {
	  login.click_on_the_next_button();
	}

	@When("Verify the Hospital name")
	public void verify_the_hospital_name() {
	   login.verify_the_hospital_name();
	}

	@When("Verify the Hospital address")
	public void verify_the_hospital_address() {
	   login.verify_the_hospital_address();
	}

	@When("Verify the Desigination")
	public void verify_the_desigination() {
	   login.verify_the_desigination();
	}

	@When("select the country")
	public void select_the_country() {
	   login.select_the_country();
	}

	@When("Verify the submit button")
	public void verify_the_submit_button() {
	    login.click_on_the_submit_button();
	}

	@When("Verify the back button")
	public void verify_the_back_button() {
	   login.verify_the_back_button();
	}

	@When("Verify the login here")
	public void verify_the_login_here() {
	    login.verify_the_login_here();
	}

	@When("Enter the mail")
	public void enter_the_mail() {
	    login.enter_the_mail();
	}

	@When("Enter the password")
	public void enter_the_password() {
	   login.enter_the_password();
	}

	@When("Click on the submit button")
	public void click_on_the_submit_button() {
		login.click_on_the_submit_button();
		
		
	}



}
