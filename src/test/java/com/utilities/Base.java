package com.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	
	public WebDriver driver;

	public static WebDriverWait wait;
	
	

	public void setup(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	}

	public void click(WebElement ele) {
		// wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();

	}

	public void sendykeys(WebElement elements, String pass) {

		// wait.until(ExpectedConditions.visibilityOf(elements));
		elements.click();
		elements.clear();
		elements.sendKeys(pass);

	}

	public void selectbyvisibletext(String ele, String text) {

		WebElement one = driver.findElement(By.xpath(ele));
		wait.until(ExpectedConditions.visibilityOf(one));
		Select sss = new Select(one);
		sss.selectByVisibleText(text);
		String name = sss.getFirstSelectedOption().getText();
		System.out.println(name);
	}

	public void selectbyvalue(WebElement ele, String value) {
		
		//wait.until(ExpectedConditions.visibilityOf(ele));
		Select see = new Select(ele);
		see.selectByValue(value);
		String bb = see.getFirstSelectedOption().getText();
		System.out.println(bb);

	}

	public void draganddrop(String ele1, String ele2) {

		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath(ele1));

		WebElement target = driver.findElement(By.xpath(ele2));

		act.dragAndDrop(source, target).click().build().perform();

	}

	public void movetoelement(String ele) {

		Actions act = new Actions(driver);
		WebElement moveeee = driver.findElement(By.xpath(ele));
		act.moveToElement(moveeee).build().perform();
	}

	public void rightclick(String ele) {
		Actions act = new Actions(driver);
		WebElement RRRR = driver.findElement(By.xpath(ele));
		act.contextClick(RRRR).build().perform();
	}


}
