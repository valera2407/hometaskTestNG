package business.layer.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToBusketPage {
    @FindBy(xpath = "//*[@id=\"#scrollArea\"]/div[1]/div[2]/rz-product-main-info/div[1]/div/ul/li[1]/app-product-buy-btn/app-buy-button/button")
    WebElement buy;


    @FindBy(xpath = "//app-root/single-modal-window/div[2]/div[2]/rz-shopping-cart/div/div[1]/a")
    WebElement closeWindow;

    public void add(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buy));
        buy.click();
        wait.until(ExpectedConditions.elementToBeClickable(closeWindow));
        closeWindow.click();
    }
}
