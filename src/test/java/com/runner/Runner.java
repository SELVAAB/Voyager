package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="src/test/resources/features",
		
		glue={"com.stepdefinition","com.hook"},
		
		dryRun=false,
		
		monochrome=true,
		
		publish=true,
		
		tags= "@tag1",
		
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				//"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
				
				
				"html:target/cucumber-reports/report.html",
				
				"json:target/cucumber-reports/report.json",
				
				"junit:target/cucumber-reports/report.xml"}
		
		         
		
		
		)























public class Runner  extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=false)
	public Object[][]scenarios(){
		return super.scenarios();
	}
	

}
