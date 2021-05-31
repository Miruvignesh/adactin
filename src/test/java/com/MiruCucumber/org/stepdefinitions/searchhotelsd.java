package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.hotelsearch;
import com.MiruCucumber.org.pomanager.pomanager;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class searchhotelsd extends baseclass {
	public static WebDriver dr = adactinrunner.driver;
	pomanager pom = new pomanager(dr);
	hotelsearch hs = new hotelsearch(dr);
	@When("^select location of hotel$")
	public void select_location_of_hotel() throws Throwable {
		dropdown(pom.getHs().getLocation(),"byvisibletext","Melbourne");
	}
	@When("^select hotel type$")
	public void select_hotel_type() throws Throwable {
	   dropdown(pom.getHs().getHotels(), "byvalue", "Hotel Sunshine");
	}

	@When("^select room type$")
	public void select_room_type() throws Throwable {
	   dropdown(pom.getHs().getRoom_type(), "byvisibletext", "Double");
	}

	@When("^select number of rooms$")
	public void select_number_of_rooms() throws Throwable {
	   dropdown(pom.getHs().getRoom_nos(), "byvalue", "5");
	}

	@When("^enter \"([^\"]*)\" as Check in date$")
	public void enter_as_Check_in_date(String arg1) throws Throwable {
	    sendkeys(pom.getHs().getDatepick_in(),arg1);
	}

	@When("^enter \"([^\"]*)\" as Check out date$")
	public void enter_as_Check_out_date(String arg1) throws Throwable {
	   sendkeys(pom.getHs().getDatepick_out(),arg1);
	}

	@When("^select no of adults$")
	public void select_no_of_adults() throws Throwable {
	   dropdown(pom.getHs().getAdult_room(),"byvisibletext","4 - Four");
	}

	@When("^select number of childrens$")
	public void select_number_of_childrens() throws Throwable {
	   dropdown(pom.getHs().getChild_room(),"byvisibletext","2 - Two");
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
	   clicking(pom.getHs().getSubmit());
	}

}
