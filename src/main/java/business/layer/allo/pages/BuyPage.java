package business.layer.allo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyPage {
    @FindBy(id = "product-buy-button")
    WebElement add;


    @FindBy(className = "comeback")
    WebElement closeWindow;

    public void addToBasket(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(add));
        add.click();
        wait.until(ExpectedConditions.elementToBeClickable(closeWindow));
        closeWindow.click();
    }
}
