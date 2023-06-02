package stepDefinition;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.ContactUsDefinitionPage;

public class ContactUsDefinition extends BaseClass{
	
	
	public static WebDriver driver;
	
	ContactUsDefinitionPage page= new ContactUsDefinitionPage();
	
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		mysetup();
	}

	@When("Click on the contact us")
	public void click_on_the_contact_us() {
	   page.click_on_the_contact_us();
	}

	@When("Enter the name")
	public void enter_the_name() {
		page.enter_the_name();
	  
	}

	@When("Enter the Phone number")
	public void enter_the_phone_number() {
	  page.enter_the_phone_number();
	}

	@When("Enter Email Address")
	public void enter_email_address() {
	 page.enter_email_address();
	}

	@When("Enter the subject")
	public void enter_the_subject() {
	   page.enter_the_subject();
	}

	@When("enter the message")
	public void enter_the_message() {
	    page.enter_the_message();
	}

	@Then("click on the send button")
	public void click_on_the_send_button() {
	  page.click_on_the_send_button();
	}




}
