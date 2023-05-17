package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyControl {
    
	WebDriver driver=new ChromeDriver();
	//ChromeOptions driver = new ChromeOptions();
	//driver.addArguments("--remote-allow-origins=*");
	 
	@Given("User open web browser")
	public void user_open_web_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		System.out.println("ab");
		
	}

	@When("User enter moneycontrol https:\\/\\/www.moneycontrol.com\\/")
	public void user_enter_moneycontrol_https_www_moneycontrol_com() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		
		
		driver.get("https://www.moneycontrol.com/");
	}

	@Then("User check title of page")
	public void user_check_title_of_page() {
	    
	// Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	  System.out.println("Title of web page is:" + driver.getTitle());
	
	
}}
