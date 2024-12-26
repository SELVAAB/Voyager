package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.hook.Hooks;
import com.pages.loginpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Voyagerdefinition {
	
	
	
	public WebDriver driver=Hooks.driver;
	
	
	loginpage voyager;
	
	
	@Given("user on loginpage")
	public void user_on_loginpage() throws InterruptedException {
	    
		
		loginpage voyager= new loginpage(driver);
		
		voyager.login();
		
	}

	@Given("View the vayoger home page")
	public void view_the_vayoger_home_page() {
	   
	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
	   
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() {
	    
	}

	@Then("redirect to dashboard")
	public void redirect_to_dashboard() {
	    
	}


}
