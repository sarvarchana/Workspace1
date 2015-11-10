package secondPackage01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrl {
	
	WebDriver d;
	
	@Before
	public void setup()

{
		
		d = new FirefoxDriver();
}
	@Test
	public void openselenium143() throws Exception
	{
		
		d.get("http://www.google.com");
		Thread.sleep(3000);
	}
	@After
	public void teardown()
	{
		d.quit();
	}
	
}
