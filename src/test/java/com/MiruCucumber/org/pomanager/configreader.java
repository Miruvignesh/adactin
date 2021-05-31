package com.MiruCucumber.org.pomanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class configreader {
	public static Properties ps;
	public configreader() throws IOException {
	File fi = new File("src\\test\\java\\com\\MiruCucumber\\org\\properties\\config.properties");
	FileInputStream fis = new FileInputStream(fi);
	ps = new Properties();
	ps.load(fis);
	}
	
	public String getbrowser() {
		String bn = ps.getProperty("browser");
		return bn;

	}
	public String geturl() {
		String url = ps.getProperty("url");
		return url;
	}
	
}
