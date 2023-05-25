package testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://manentia.vercel.app/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Trynow=driver.findElement(By.xpath("//button[normalize-space()='Try Now']"));
		Trynow.click();

		WebElement SignUp=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/form[1]/a[1]/h6[1]"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOf (SignUp));
		SignUp.click();
		
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='firstname']"));
		FirstName.sendKeys("anoop");
		
		WebElement LastName=driver.findElement(By.xpath("//input[@id='lastname']"));
		LastName.sendKeys("kumar");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("testak9045@gmail.com");
		
		WebElement Password =driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("Anoop@9045");
		
		WebElement CnfrmPassword =driver.findElement(By.xpath("//input[@id='confirmpassword']"));
		CnfrmPassword.sendKeys("Anoop@9045");
		
		
		WebElement Next =driver.findElement(By.xpath("//button[normalize-space()='Next >']"));
		Next.click();
		
		WebElement Hospital=driver.findElement(By.xpath("//input[@id='Hospital']"));
		Hospital.sendKeys("fortis");
		
		WebElement HospitalAddress=driver.findElement(By.xpath("//input[@id='address']"));
		HospitalAddress.sendKeys("noida");
		
		WebElement Designation=driver.findElement(By.xpath("//input[@id='Designation']"));
		Designation.sendKeys("consult");
		
		WebElement Country=driver.findElement(By.xpath("//select[@id='Country']"));
		Select se = new Select(Country);
		se.selectByValue("India");
		
		WebElement Submit=driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		Submit.click();
		
		WebElement Back=driver.findElement(By.xpath("//button[normalize-space()='< Back']"));
		Back.click();
		
		WebElement Loginhere=driver.findElement(By.xpath("//h6[normalize-space()='Login here']"));
		Loginhere.click();
		

		WebElement Eml=driver.findElement(By.xpath("//input[@id='Email']"));
		 Eml.sendKeys("testak9045@gmail.com");
		 
		 WebElement Pwd=driver.findElement(By.xpath("//input[@id='Password']"));
		 Pwd.sendKeys("Anoop@9045");
		 
		 WebElement sbmt =driver.findElement(By.xpath("//button[normalize-space()='Submit']"));
		 sbmt.click();
		 
		 
		
		
		
		

	}

}
