package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.bookhotel;
import com.MiruCucumber.org.pomanager.pomanager;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class bookhotelsd extends baseclass{
	public static WebDriver dr= adactinrunner.driver;
	pomanager pom = new pomanager(dr);
	bookhotel bh = new bookhotel(dr);
	@When("^Enter \"([^\"]*)\" as firstname$")
	public void enter_as_firstname(String arg1) throws Throwable {
	   sendkeys(pom.getBh().getFirst_name(), arg1);
	}

	@When("^enter \"([^\"]*)\" as lastname$")
	public void enter_as_lastname(String arg1) throws Throwable {
	    sendkeys(pom.getBh().getLast_name(), arg1);
	}

	@When("^enter \"([^\"]*)\" as billing address$")
	public void enter_as_billing_address(String arg1) throws Throwable {
	   sendkeys(pom.getBh().getAddress(), arg1);
	}

	@When("^enter \"([^\"]*)\" as card number$")
	public void enter_as_card_number(String arg1) throws Throwable {
	    sendkeys(pom.getBh().getCc_num(), arg1);
	}

	@When("^select card type$")
	public void select_card_type() throws Throwable {
	  dropdown(pom.getBh().getCc_type(), "byvalue", "MAST");
	}

	@When("^select exp month$")
	public void select_exp_month() throws Throwable {
	   dropdown(pom.getBh().getCc_exp_month(), "byvalue", "4");
	}

	@When("^select exp year$")
	public void select_exp_year() throws Throwable {
	    dropdown(pom.getBh().getCc_exp_year(), "byvalue", "2022");
	}

	@When("^enter cvv num$")
	public void enter_cvv_num() throws Throwable {
	   sendkeys(pom.getBh().getCc_cvv(), "456");
	}

	@Then("^click book now button$")
	public void click_book_now_button() throws Throwable {
	    clicking(pom.getBh().getBook_now());
	}
}
