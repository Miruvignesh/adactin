package com.MiruCucumber.org.pomanager;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.pom.*;

public class pomanager {

	public WebDriver dr;
	private loginpg lp;
	private hotelsearch hs;
	private hotelselect hs1;
	private bookhotel bh;
	private conformpg cp;
	public pomanager(WebDriver dr2) {
		this.dr=dr2;
	}
	public loginpg getLp() {
		lp = new loginpg(dr);
		return lp;
	}
	public hotelsearch getHs() {
		hs = new hotelsearch(dr);
		return hs;
	}
	public hotelselect getHs1() {
		hs1 = new hotelselect(dr);
		return hs1;
	}
	public bookhotel getBh() {
		bh = new bookhotel(dr);
		return bh;
	}
	public conformpg getCp() {
		cp= new conformpg(dr);
		return cp;
	}
	
}
