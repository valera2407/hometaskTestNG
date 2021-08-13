package business.layer.hotline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ComeToShopPage {
    @FindBy(xpath = "//*[@id=\"tabs\"]/div/div[3]/div/div[3]/div[2]/div[2]/div/div[4]/a[2]")
    WebElement comeToShop;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/header/div/div/div[2]/div[3]/div/div")
    WebElement element;

    public void openShop(WebDriver webDriver){
        Actions actions = new Actions(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        actions.moveToElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(comeToShop));
        comeToShop.click();
    }
}
