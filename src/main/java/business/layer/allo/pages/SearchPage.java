package business.layer.allo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    @FindBy(id = "search-form__input")
    private WebElement search;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[2]/div/div[1]/div[2]/div[3]/div[1]")
    private WebElement openProduct;

    public void openProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(openProduct));
        openProduct.click();
    }


    public void findProducts(String productName, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.sendKeys(productName);
        search.submit();
    }
}
