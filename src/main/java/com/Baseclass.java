package com;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Baseclass {
	         public static  WebDriver driver;
	         public static JavascriptExecutor js;
             public static void getdriver()
                {
                	System.setProperty("webdriver.chrome.driver","C:\\Users\\SING\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
                	 driver=new ChromeDriver();
                }
             public static void geturl(String a)
             {
            	 driver.get(a);
            	 driver.manage().window().maximize();
             }
			public static void getts(String d) throws IOException	
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				File sc = ts.getScreenshotAs(OutputType.FILE);
				File dc=new File("C:\\Users\\SING\\eclipse-workspace\\Maven\\screenshot\\"+d+ " .png");
				FileUtils.copyFile(sc, dc);
			}
			
			public static void inputkey(WebElement a,String b)
			{
				a.sendKeys(b);
			
			}
			public static void clickkey(WebElement k) {
				// TODO Auto-generated method stub             
				k.click();

			}
			
			
			
}
 