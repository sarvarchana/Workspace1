package TestCases;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	@Test
	public void facebooklogin(){
		
		FirefoxDriver d = new FirefoxDriver();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.id("email")).clear();
		d.findElement(By.id("email")).sendKeys();
		
		d.findElement(By.id("pass")).clear();
		d.findElement(By.id("pass"));
		
		d.findElement(By.id("u_0_x")).click();
		
		
		
	}
}
