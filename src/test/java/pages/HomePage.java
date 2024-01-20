package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    private static final By appleSiteBuyLink =By.xpath("//h2[contains(text(),'iPhone 15 Pro')]/parent::div/div/a[2]");
    private static final String homePageURL ="https://www.apple.com/in";
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void loadPage()
    {
        driver.get(homePageURL);
    }
    public void clickBuyIPhone15ProLink()
    {
        driver.findElement(appleSiteBuyLink).click();
    }


}
