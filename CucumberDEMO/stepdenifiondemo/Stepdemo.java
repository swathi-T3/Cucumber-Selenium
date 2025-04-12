package stepdenifiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdemo {
	
	WebDriver driver;
	
	@Given("User had launched the browser")
	public void user_had_launched_the_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
		 driver=  new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@And("Navigate to the valid url")
	public void navigate_to_the_valid_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
	}

	@When("User enters email ID and password credentials")
	public void user_enters_email_id_and_password_credentials() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
		driver.findElement(By.id("email")).sendKeys("abcemail@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("passowrd@1234");
		 Thread.sleep(5000);
		
	}

	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	
		System.out.println("Error message is displayed!");
	}




}
