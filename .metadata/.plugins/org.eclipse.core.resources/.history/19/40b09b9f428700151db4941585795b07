package TestCases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {
	@Test
	public void Facesignup() throws Exception{
		FirefoxDriver d = new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.id("u_0_b")).clear();
		d.findElement(By.id("u_0_b")).sendKeys("fsjlkfj");
		
		d.findElement(By.id("u_0_d")).clear();
		d.findElement(By.id("u_0_d")).sendKeys("snbfsn");
		
		d.findElement(By.id("u_0_f")).clear();
		d.findElement(By.id("u_0_f")).sendKeys("ar@gmail.com");
		
		d.findElement(By.id("u_0_i")).clear();
		d.findElement(By.id("u_0_i")).sendKeys("ar@gmail.com");
		
		d.findElement(By.id("u_0_k")).clear();
		d.findElement(By.id("u_0_k")).sendKeys("saibaba18");
		
	
		Select uiMonth = new Select(d.findElementById("month"));
		uiMonth.selectByVisibleText("Feb");
		
		Select uiDay = new Select(d.findElementById("day"));
		uiDay.selectByVisibleText("2");
		
		
		Select uiYear = new Select(d.findElementById("year"));
		uiYear.selectByVisibleText("1982");
		
		Thread.sleep(2000);
		
		String sOption = "Male";
		if(sOption.equals("Female"))
			d.findElementById("u_0_n").click();
		else if(sOption.equals("Male"))
			d.findElementById("u_0_o").click();
		
	
		d.findElementById("u_0_s").click();
		
		
		
			
	}

}
