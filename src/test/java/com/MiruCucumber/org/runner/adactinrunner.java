package com.MiruCucumber.org.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pomanager.filereadermanager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\MiruCucumber\\org\\feature\\adactin.feature",
				glue ="com\\MiruCucumber\\org\\stepdefinitions",monochrome = true, dryRun = false,
				strict = true,
				plugin = {"pretty","html:Report","json:ReportJson/Cucumber.json",
						"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/CucumberExtentReport.html"}
				)
public class adactinrunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void open() throws IOException {
		//String browser = filereadermanager.getmanager().getcr().getbrowser();
		driver =baseclass.openbrowser(filereadermanager.getmanager().getcr().getbrowser());
	}
	
	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
