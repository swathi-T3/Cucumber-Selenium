package cucumberStepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition {
	
	WebDriver driver;
	
	@Given("user is on the booking page")
	public void user_is_on_the_booking_page()  throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// throw new io.cucumber.java.PendingException();
		
	  
	}

	@When("user enters flight details and submits")
	public void user_enters_flight_details_and_submits() throws InterruptedException {
		
driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		boolean title = driver.getTitle().contains("BlazeDemo");
		//title.contentEquals("Flights from Paris to Buenos Aires: ");
		 
		Assert.assertTrue(title);

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputName")).sendKeys("Ram");
		driver.findElement(By.id("address")).sendKeys("Hyderabad");
		driver.findElement(By.id("city")).sendKeys("Hightechcity");
		driver.findElement(By.id("state")).sendKeys("Telenagana");
		driver.findElement(By.id("zipCode")).sendKeys("505175");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234455hgabeg");
		driver.findElement(By.id("creditCardMonth")).sendKeys("11");
		driver.findElement(By.id("creditCardYear")).sendKeys("2002");
		driver.findElement(By.id("nameOnCard")).sendKeys("Ram Thoorpati");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		// throw new io.cucumber.java.PendingException();
		
	    
	}

	@Then("booking confirmation message is displayed")
	public void booking_confirmation_message_is_displayed() throws InterruptedException {
		
		Assert.assertTrue(driver.getCurrentUrl().contains("confirmation"));
		
		WebElement title2 = driver.findElement(By.tagName("h1"));
		System.out.println(title2.getText());
		
		 Assert.assertTrue(title2.isDisplayed());
		Thread.sleep(2000);
	   
		
		driver.quit();
		 //throw new io.cucumber.java.PendingException();
	}
	
	
}
