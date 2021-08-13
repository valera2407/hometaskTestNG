package business.layer.hotline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LikedPage {
    @FindBy(xpath = "//*[@id=\"__layout\"]/div/div[4]/div[2]/div[2]")
    WebElement buy;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[4]/div[2]/div[2]/div[3]/div/div[4]/div/button[2]")
    WebElement add;

    @FindBy (linkText = "Перейти до списку")
    WebElement continueSearch;

    public void addToList(WebDriver webDriver) {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(buy));
        buy.click();
        wait.until(ExpectedConditions.elementToBeClickable(add));
        add.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueSearch));
        continueSearch.click();
    }
}
