package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.loginpg;
import com.MiruCucumber.org.pomanager.filereadermanager;
import com.MiruCucumber.org.pomanager.pomanager;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class loginpgsd extends baseclass {

	public static WebDriver dr = adactinrunner.driver;
	pomanager pom = new pomanager(dr);
	loginpg lp = new loginpg(dr);
	
	@Given("^enter url of adactin application$")
	public void enter_url_of_adactin_application() throws Throwable {
	    geturl(filereadermanager.getmanager().getcr().geturl());
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	   sendkeys(pom.getLp().getUsername(),arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    sendkeys(pom.getLp().getPassword(),arg1);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	   clicking(pom.getLp().getLogin());
	}

	@Then("^user validate login button$")
	public void user_validate_login_button() throws Throwable {
	    
	}


}
