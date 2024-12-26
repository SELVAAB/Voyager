package com.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utilities.Base;

public class loginpage extends Base{
	
	
	// Global level declare webdriver
	
	public WebDriver driver;
	
	
	
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(40));
	
	 
	 
	 
	 
	 
	 
	 
	 // Constructor
	 
	public loginpage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	

	
	
	
	
	
	// Locating the element using xpath and id
	
	
	@FindBy(xpath = "//button[@aria-label='Sign In Button']")
	
	
	public WebElement siginbtn;
	
	
	
	@FindBy(id = "input28")
	
	
	public WebElement emailaddress;
	
	
	@FindBy(xpath = "//input[@type='submit']")
	
	
	public WebElement nextbtn;
	
	
	
	@FindBy(id = "input63")
	
	
	public WebElement password;
	
	
	
	@FindBy(xpath = "//input[@class='button button-primary']")
	
	public WebElement verifybtn;
	
	
	
	
	@FindBy(xpath = "(//a[@class='button select-factor link-button'])[3]")
	
	
	public WebElement securityquestion;
	
	
	
	@FindBy(xpath = "//input[@class='password-with-toggle']")
	
	
	public WebElement foodname;
	
	
	@FindBy(xpath = "//input[@class='button button-primary']")
	
	
	public WebElement verifybtn1;
	
	
	
	
	@FindBy(xpath = "(//div[@class='enterprise-panel ng-star-inserted'])[3]")
	
	
	
	public WebElement VCA;
	
	
	
	
	
	
	
	
	
	
	// Performing the actions page class itself
	
	
	
	public void login() throws InterruptedException {
		
		
		
		wait.until(ExpectedConditions.visibilityOf(siginbtn));
		
		siginbtn.click();
		
		
		sendykeys(emailaddress,"vigneshwaran.jayabal@vca.com");
		
		
		wait.until(ExpectedConditions.visibilityOf(nextbtn));
		
		
		nextbtn.click();
		
		
		sendykeys(password,"AdminFeb@123");
		
		
		wait.until(ExpectedConditions.visibilityOf(verifybtn));
		
		
		verifybtn.click();
		
		
		wait.until(ExpectedConditions.visibilityOf(securityquestion));
		
		
		
		securityquestion.click();
		
		
		sendykeys(foodname,"upma");
		
		
		wait.until(ExpectedConditions.visibilityOf(verifybtn1));
		
		verifybtn1.click();
		
		
		Thread.sleep(60000);
		
		
		wait.until(ExpectedConditions.visibilityOf(VCA));
		
		
		VCA.click();
	}
	
	
	
}
