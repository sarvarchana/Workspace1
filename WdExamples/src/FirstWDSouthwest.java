package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstWDSouthwest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.southwest.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testFirstWDSouthwest() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Enroll")).click();
    driver.findElement(By.id("js-customer-first-name")).clear();
    driver.findElement(By.id("js-customer-first-name")).sendKeys("abc");
    driver.findElement(By.id("js-customer-middle-name")).clear();
    driver.findElement(By.id("js-customer-middle-name")).sendKeys("d");
    driver.findElement(By.id("js-customer-last-name")).clear();
    driver.findElement(By.id("js-customer-last-name")).sendKeys("efg");
    new Select(driver.findElement(By.id("js-customer-birth-month"))).selectByVisibleText("Nov");
    new Select(driver.findElement(By.id("js-customer-birth-day"))).selectByVisibleText("21");
    new Select(driver.findElement(By.id("js-customer-birth-year"))).selectByVisibleText("1997");
    new Select(driver.findElement(By.id("js-customer-gender"))).selectByVisibleText("Female");
    new Select(driver.findElement(By.id("js-country"))).selectByVisibleText("BAHAMAS");
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
