package com;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nybase {
	
	public static WebDriver driver;
    public static Actions ac;
	
	public static WebDriver getdriver() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SING\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
     return driver;
	}
	public static void sendkey(WebElement Element, String l)
			
			{
		// TODO Auto-generated method stub
		Element.sendKeys(l); 

	}
	public static void geturl(String a) {
		// TODO Auto-generated method stub
     driver.get(a);
     driver.manage().window().maximize();
		
	}
	public static void getclick(WebElement ab) {
		// TODO Auto-generated method stub
		ab.click();

	}
	public static void actionclick(WebElement a1) {
		// TODO Auto-generated method stub
	      ac=new Actions(driver);
	      ac.click(a1).build().perform();
	      
		}
		private void contentclick(WebElement a2) {
			// TODO Auto-generated method stub
	     ac=new Actions(driver);
	     ac.contextClick(a2).build().perform();
	    
		}
		public static void getwindow() {
			// TODO Auto-generated method stub
        Set<String> wh = driver.getWindowHandles();
        for(String st:wh)
        {
        	String title = driver.switchTo().window(st).getTitle();
        	System.out.println(title);
        }
        	
		}
		public static void getwindowhandle(WebElement a3, WebElement a4) {
			// TODO Auto-generated method stub
			ac.moveToElement(a3).click().build().perform();
			ac.click(a4).build().perform();
			
		}
		public static void Jscriptexecutor(WebElement js) throws InterruptedException {
			// TODO Auto-generated method stub
			JavascriptExecutor j=(JavascriptExecutor) driver;
			j.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(2000);
			j.executeScript("arguments[0].scrollIntoView;",js);
			j.executeScript("window.scrollBy(0,-1000)");
			

		}
		
		
}
