package com.MiruCucumber.org.pomanager;

import java.io.IOException;

public class filereadermanager {
	private filereadermanager() {

	}
	
	public configreader getcr() throws IOException
	{
		configreader cr = new configreader();
		return cr;
	}
	public static filereadermanager getmanager() {
		filereadermanager frm = new filereadermanager();
		return frm;
	}
	

}
