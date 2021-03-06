package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.hotelselect;
import com.MiruCucumber.org.pomanager.pomanager;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class selecthotelsd extends baseclass {
	public static WebDriver dr= adactinrunner.driver;
	pomanager pom = new pomanager(dr);
	hotelselect sh = new hotelselect(dr);
	@When("^Select the hotel$")
	public void select_the_hotel() throws Throwable {
	   clicking(pom.getHs1().getRadiobutton_0());
	}

	@Then("^click continue button$")
	public void click_continue_button() throws Throwable {
	    clicking(pom.getHs1().getContinu());
	}
}
