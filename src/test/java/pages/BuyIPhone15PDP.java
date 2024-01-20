package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyIPhone15PDP {
    WebDriver driver;
 private static final By landingPageVerificationString = By.xpath("//div[@data-autom='bfe-header']/h1");

 public BuyIPhone15PDP(WebDriver driver)
 {
     this.driver=driver;
 }

 public boolean verifyLandingPage(String txt)
 {
     return driver.findElement(landingPageVerificationString).getText().equals(txt);
 }

}
