package business.layer.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortedPage {
    @FindBy(xpath = "//div/main/rz-catalog/div/rz-catalog-settings/div/rz-sort/select")
    WebElement sort;

    @FindBy (xpath = "//div/main/rz-catalog/div/rz-catalog-settings/div/rz-sort/select/option[4]")
    WebElement popular;

    @FindBy (xpath = "//div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/app-goods-tile-default/div/div[2]")
    WebElement mostPopular;

    public void openTheMostPopular(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(sort));
        sort.click();
        wait.until(ExpectedConditions.elementToBeClickable(popular));
        popular.click();
        wait.until(ExpectedConditions.elementToBeClickable(mostPopular));
        mostPopular.click();
    }
}
