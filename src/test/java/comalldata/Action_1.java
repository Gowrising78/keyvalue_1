package comalldata;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Actionbaseclass;

public class Action_1 extends Actionbaseclass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		getdriver();
		geturl("https://www.amazon.in/");
		WebElement fe1 = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		action(fe1);
		WebElement fe2 = driver.findElement(By.xpath("//img[@alt='Headphones'][1]"));
		javascriptexecutor(fe2);
		contextclick(fe2);
		robot();
		WebElement fe3 = driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Accessories')]"));
	  WebElement fe4 = driver.findElement(By.xpath("//a[text()='Cases & Covers']"));
	  windowhandles(fe3,fe4);
	}

}