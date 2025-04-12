package stepdefinitionfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormStepFile {
	
	WebDriver driver;
	
	@Given("User opens the simple form webpage")
	public void browserlaunch() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	@When("User enters the valid firstName")
	public void validfirstName() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("firstName")).sendKeys("Ram");
		Thread.sleep(2000);
	}

	@When("User enters the valid lastName")
	public void validlastName() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("lastName")).sendKeys("Thoorpati");
		Thread.sleep(2000);
		
	}

	@When("User enters the valid email id")
	public void validemailid() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("email")).sendKeys("ramthoorpati2@gmail.com");
		Thread.sleep(2000);
	}

	@When("User enters the valid contact number")
	public void validcontactNumber() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.findElement(By.id("number")).sendKeys("9876543210");
		Thread.sleep(2000);
		
	}

	@When("User clicks on the submit button")
	public void submitbutton() throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
	}

	
	@Then("Close the browser")
	public void browserclose() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.quit();
	}
}
