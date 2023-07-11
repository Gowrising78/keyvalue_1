package comalldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import com.Nybase;
import com.Nykaabase;

public class Nykaa_1 extends Nybase {
	
	public static void main(String[] args) {
		
		getdriver();
		geturl("https://www.amazon.com/");
		WebElement fe = driver.findElement(By.xpath("//span[text()= 'Hello, sign in']"));
	    getclick(fe);
	    
		Nykaabase nb=new Nykaabase(driver);
		getwindow();
		sendkey(nb.getEmail(), "gowri.sing@gmail.com");
		WebElement pro = driver.findElement(By.id("continue"));
		getclick(pro);
		sendkey(nb.getPassword(),"1234567");
		WebElement sub = driver.findElement(By.id("signInSubmit"));
		getclick(sub);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the otp:");
		String otp=sc.next();
		WebElement fe1= driver.findElement(By.name("code"));
		fe1.sendKeys(otp);
		

		WebElement fe2 = driver.findElement(By.xpath("//a[text()='Books']"));
		fe2.click();
		
	WebElement fe3 = driver.findElement(By.xpath("//a[text()='Summer Reading']"));
	fe3.click();
	WebElement fe4 = driver.findElement(By.xpath("//img[@alt='Best books of June']"));
  fe4.click();
   WebElement fe5 = driver.findElement(By.xpath("//img[@alt='Loot: A novel']"));
   fe5.click();
   WebElement fe6 = driver.findElement(By.id("one-click-button"));
      fe6.click();
      WebElement fe7 = driver.findElement(By.xpath("//span[text()='Hardcover']"));
      fe7.click();
      WebElement fe8 = driver.findElement(By.xpath("//input[@type='submit'][7]"));
      fe8.click();
      
      
	}
	

}
