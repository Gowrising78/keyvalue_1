package com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandles {
    public static WebDriver driver;
    public static Actions ac;
	public static void getdriver() {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\Users\\SING\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
      driver=new ChromeDriver();
	}
	public static void geturl(String a) {
		// TODO Auto-generated method stub
    driver.get(a);
    driver.manage().window().maximize();
	}
	public static void action() {
		// TODO Auto-generated method stub
 ac=new Actions(driver);
	}
	
	public static void windowhandles(WebElement b, WebElement c) {
		// TODO Auto-generated method stub
      
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		ac.moveToElement(b).build().perform();
		ac.click(c).build().perform();
					
	}
	public static void getwindow() {
		// TODO Auto-generated method stub
                  Set<String> wh1 = driver.getWindowHandles();
                  for(String st:wh1)
                  {
                	  String title = driver.switchTo().window(st).getTitle();
                	  System.out.println(title);
                  }
		
		
	}
	
}
