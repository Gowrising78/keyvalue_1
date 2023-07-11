package comalldata;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Baseclass;
import com.loginpom;

public class Base_1 extends Baseclass {
	
	public static void main(String[] args) throws IOException  {
		
		getdriver();
		geturl("https://www.instagram.com/");
//		WebElement fe = driver.findElement(By.id("email"));
//		inputkey(fe,"mithran");
//		
//		WebElement fe1 = driver.findElement(By.name("pass"));
//		inputkey(fe1,"1234");
//	
//		WebElement fe2 = driver.findElement(By.name("login"));
//		clickkey(fe2);
//		getts();

		loginpom l=new loginpom(driver);
		l.getUsername().sendKeys("Gowri");
	   l.getPassword().sendKeys("1234");

        
	}
	
}
