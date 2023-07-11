package com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpom{
	public static WebDriver driver;
	public static JavascriptExecutor js; 
	
	@FindBy(name="username")
	private WebElement username; 
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
     
	
	public WebElement javascriptecxecutor() {
		// TODO Auto-generated method stub
		js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click;", login);

	}
	
	
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	} 
	
	public loginpom(WebDriver driver2) {
		// TODO Auto-generated method stub
        this.driver=driver2;
        this.js=(JavascriptExecutor)this.driver;
        PageFactory.initElements(driver2, this);
        
	}
	
	
}
