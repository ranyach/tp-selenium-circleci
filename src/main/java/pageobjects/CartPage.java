package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    By checkoutButton = By.cssSelector("input[name=proceedToRetailCheckout]");

    By productTitleLocator = By.cssSelector("span.a-truncate-cut");
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean proceedToCheckoutButtonVisibility() {
        return driver.findElement(checkoutButton).isDisplayed();
    }

    public String getProductTitle(){
       return  driver.findElement((productTitleLocator)).getText();
    }
}
