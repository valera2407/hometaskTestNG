package business.layer.rozetka.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    @FindBy (xpath = "//input")
    WebElement search;

    @FindBy (xpath = "//rz-header/header/div/div/div/form/button")
    WebElement find;

    @FindBy (xpath = "//section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]")
    WebElement openProduct;

    public void openProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        Actions actions = new Actions(webDriver);
        wait.until(ExpectedConditions.elementToBeClickable(openProduct));
        openProduct.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//rz-product-top/div/div[2]/a")));
        actions.moveToElement(webDriver.findElement(By.xpath("//rz-product-top/div/div[2]/a"))).perform();
    }

    public void findProducts(String productName, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.sendKeys(productName);
        wait.until(ExpectedConditions.elementToBeClickable(find));
        find.click();
    }
}
