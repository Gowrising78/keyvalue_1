package comalldata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Windowhandles;

public class Windowhandles_1 extends Windowhandles{
	public static void main(String[] args) {
		getdriver();
		geturl("https://www.nykaa.com/");
		action();
		WebElement fe1 = driver.findElement(By.xpath("//a[text()='appliances']"));
		WebElement fe2 = driver.findElement(By.xpath("//a[text()=' Hair Dryers']"));
		
		windowhandles(fe1,fe2);
		getwindow();
	}

}
