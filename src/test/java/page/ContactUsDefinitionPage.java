package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BaseClass;


public class ContactUsDefinitionPage extends BaseClass  {
	
	//public static WebDriver driver;
	
	public void click_on_the_contact_us() {
		
		WebElement Contactus = driver.findElement(By.xpath("//a[normalize-space()='Contact Us']"));
		Contactus.click();
		   
	}
	
	public void enter_the_name() {
		WebElement Name = driver.findElement(By.xpath("//input[@id='name']"));
		Name.sendKeys("Xyz");
	}
	
	public void enter_the_phone_number() {
		
		WebElement Ph = driver.findElement(By.xpath("//input[@id='PhoneNumber']"));
		Ph.sendKeys("8192849568");
	}
	
	public void enter_email_address() {
		 
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("xyz@yopmail.com");
	}
	
	public void enter_the_subject() {
		
		WebElement subject = driver.findElement(By.xpath("//input[@id='Subject']"));
		subject.sendKeys("demo purpose");
		   
	}
	
public void enter_the_message() {
	    
	WebElement message = driver.findElement(By.xpath("//textarea[@id='Message']"));
	message.sendKeys("demo");
	
	}

public void click_on_the_send_button() {
	
	WebElement send = driver.findElement(By.xpath("//button[normalize-space()='Send']"));
	send.click();
}
}
