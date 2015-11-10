package firstpackage01;


import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
public class sample{

    @Test
	public void login() throws Exception{
		FirefoxDriver a = new FirefoxDriver();
		
		a.get("http://www.netgrocer.com");
		Thread.sleep(3000);
	    a.findElementByXPath("a[contains(@id,'570_-1_-1_-1')]").click();
		a.findElementByXPath(".//*[@id='SiteTopBar00_QuickLinksContainer']/li[2]/a").click();
	}
	
}