package com;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionbaseclass {

	public static Actions ac;
	
	public static  WebDriver driver;
    public static void getdriver()
       {
       	System.setProperty("webdriver.chrome.driver","C:\\Users\\SING\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
       	 driver=new ChromeDriver();
       }
	public static void geturl(String a) {
		// TODO Auto-generated method stub
       driver.get(a);
       driver.manage().window().maximize();
       
	}
	
	public static void getclick(WebElement a) {
		// TODO Auto-generated method stub
		a.click();

	}
	public static void action(WebElement ai) {
		// TODO Auto-generated method stub

		 ac=new Actions(driver);
		ac.click(ai).build().perform();
		
	}
	public static void contextclick(WebElement b) {
		// TODO Auto-generated method stub
		ac=new Actions(driver);
       ac.contextClick(b).build().perform();
	}
	public static void robot() throws AWTException {
		// TODO Auto-generated method stub
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyRelease(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER);
	}
    public static void javascriptexecutor(WebElement aj) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		je.executeScript("arguments[0].scrollIntoView;", aj);
		je.executeScript("window.scrollBy(0,-1000)");

	}
    public static void windowhandles(WebElement wh1,WebElement wh2) {
		// TODO Auto-generated method stub
    	ac=new Actions(driver);
    	ac.moveToElement(wh1).click().build().perform();
    	ac.click(wh2).build().perform();

	}
  
	}
	

