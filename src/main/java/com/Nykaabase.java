package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Nykaabase {
	
	 public static WebDriver driver;
	@FindBy(name="email")
	private WebElement email;
	

	public WebElement getEmail() {
		return email;
	}
    @FindBy(name="password")
    private WebElement password;
    @FindBy(id="continue")
    private WebElement allow;
    @FindBy(id="signInSubmit")
    private WebElement login;

	public WebElement getLogin() {
		return login;
	}


	public void setLogin(WebElement login) {
		this.login = login;
	}


	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getAllow() {
		return allow;
	}


	public Nykaabase(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
		
				
	}


	public WebElement getPassword() {
		return password;
	}


	
    		 
	}
	

