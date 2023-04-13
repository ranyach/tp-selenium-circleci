package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage {

    By addToCartButton = By.cssSelector("input#add-to-cart-button");

    By NoThanksButton = By.cssSelector("#attachSiNoCoverage");

    By cartButton = By.cssSelector("#attach-sidesheet-view-cart-button");
    WebDriver driver;


    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void refuseInsurance(long duration){

        Utils.setExplicitWait(driver, duration);
        Utils.wait.until(ExpectedConditions.elementToBeClickable(NoThanksButton)).click(); //WebElement nonMerciButton =

    }
    public void goToCart(long duration){
        Utils.setExplicitWait(driver, duration);
        Utils.wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
    }
}
