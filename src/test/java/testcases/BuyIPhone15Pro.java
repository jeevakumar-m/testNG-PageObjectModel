package testcases;

import com.google.common.annotations.VisibleForTesting;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import pages.BuyIPhone15PDP;
import pages.HomePage;

import java.time.Duration;

public class BuyIPhone15Pro {

    @Test
    public void testcase1_verify_BuyIphone15Pro_LandingPage() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        HomePage hp = new HomePage(driver);
        BuyIPhone15PDP buyIPhone15PDP = new BuyIPhone15PDP(driver);
        hp.loadPage();
        hp.clickBuyIPhone15ProLink();
        Thread.sleep(5000);
        Assert.isTrue(buyIPhone15PDP.verifyLandingPage("Buy iPhone 15 Pro"),"Expected Text not found");

    }


}
