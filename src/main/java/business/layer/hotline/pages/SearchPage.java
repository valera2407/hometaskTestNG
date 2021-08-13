package business.layer.hotline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
    @FindBy(id = "searchbox")
    WebElement search;

    @FindBy (xpath = "//*[@id=\"page-search\"]/div[2]/div/div[1]/div/div[3]/div/ul/li[1]/div[2]/p/a")
    WebElement product;

    @FindBy (xpath = "//*[@id=\"page-index\"]/div[1]/div[1]/div[1]/div/div/div/div[1]/div[2]/div[1]/div/div[1]/div/div/img")
    WebElement proposition;

    @FindBy (xpath = "//*[@id=\"page-index\"]/div[1]/div[1]/div[1]/div/div/div/div[1]/div[1]/div[1]/div/div[4]/div/div/a/picture/img")
    WebElement propositionClick;

    @FindBy (xpath = "//*[@id=\"catalog-products\"]/div/ul/li[1]/div[3]/p/a")
    WebElement openProposition;

    public void openProposition(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(proposition));
        proposition.click();
        wait.until(ExpectedConditions.elementToBeClickable(propositionClick));
        propositionClick.click();
        wait.until(ExpectedConditions.elementToBeClickable(openProposition));
        openProposition.click();
    }

    public void openProduct(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(product));
        product.click();
    }


    public void findProducts(String productName, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(search));
        search.clear();
        search.sendKeys(productName);
        search.submit();
    }
}
