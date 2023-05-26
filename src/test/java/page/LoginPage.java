package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPage {
	
	public WebDriver driver;
	
	public void i_have_url_and_launch_the_browser() {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.get("https://manentia.vercel.app/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	}
	
	public void click_on_the_try_now() {
	WebElement Trynow=driver.findElement(By.xpath("//button[normalize-space()='Try Now']"));
	Trynow.click();
	    
	}
	
	public void click_on_the_signup() {
		WebElement SignUp=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/form[1]/a[1]/h6[1]"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf (SignUp));
		SignUp.click();
	}
	
	public void verify_the_first_name() {
	WebElement FirstName=driver.findElement(By.xpath("//input[@id='firstname']"));
	FirstName.sendKeys("anoop");
	    
	}
	
	public void verifythe_last_name() {
		WebElement LastName=driver.findElement(By.xpath("//input[@id='lastname']"));
		LastName.sendKeys("kumar");
	    
	}
	
	public void verify_the_email() {
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("testak9045@gmail.com");
		   
	}
	
	public void verify_the_password() {
		WebElement Password =driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Anoop@9045");
		   
	}
	
	public void verifythe_confirm_password() {
		WebElement CnfrmPassword =driver.findElement(By.xpath("//input[@id='confirmpassword']"));
		CnfrmPassword.sendKeys("Anoop@9045");
		  
	}
	
	public void click_on_the_next_button() {
		WebElement Next =driver.findElement(By.xpath("//button[normalize-space()='Next >']"));
		Next.click();
		  
	}
	public void verify_the_hospital_name() {
		WebElement Hospital=driver.findElement(By.xpath("//input[@id='Hospital']"));
		Hospital.sendKeys("fortis");
	}

	public void verify_the_hospital_address() {
		WebElement HospitalAddress=driver.findElement(By.xpath("//input[@id='address']"));
		HospitalAddress.sendKeys("noida");
	}
	
	public void verify_the_desigination() {
		WebElement Designation=driver.findElement(By.xpath("//input[@id='Designation']"));
		Designation.sendKeys("consult");
	}
	
	public void select_the_country() {
		WebElement Country=driver.findElement(By.xpath("//select[@id='Country']"));
		Select se = new Select(Country);
		se.selectByValue("India");   
	}

	public void verify_the_submit_button() {
	WebElement Submit=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
	Submit.click();
	}
	
	public void verify_the_back_button() {
		WebElement Back=driver.findElement(By.xpath("//button[normalize-space()='< Back']"));
		Back.click();
	}
	public void verify_the_login_here() {
	WebElement Loginhere=driver.findElement(By.xpath("//h6[normalize-space()='Login here']"));
	Loginhere.click();
	
	}
	
	public void enter_the_mail() {
	WebElement Eml=driver.findElement(By.xpath("//input[@id='Email']"));
	 Eml.sendKeys("testak9045@gmail.com");
	}

	public void enter_the_password() {
		 WebElement Pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		 Pwd.sendKeys("Anoop@9045");
		   
	}
	public void click_on_the_submit_button() {
		
		 WebElement sbmt =driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		 sbmt.click();
		
}
}
