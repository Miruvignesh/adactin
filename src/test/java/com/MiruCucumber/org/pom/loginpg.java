package com.MiruCucumber.org.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpg {
	
	public static WebDriver dr;
	@FindBy (id = "username")
	private WebElement username;
	@FindBy (id = "password")
	private WebElement password;
	@FindBy (id = "login")
	private WebElement login;
	
public loginpg(WebDriver dr2) {
		this.dr = dr2;
		PageFactory.initElements(dr2, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
