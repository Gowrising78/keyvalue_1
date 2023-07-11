package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static WebDriver driver;
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
	

}
