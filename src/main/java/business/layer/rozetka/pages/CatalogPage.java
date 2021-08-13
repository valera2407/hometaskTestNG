package business.layer.rozetka.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CatalogPage {

    @FindBy (id = "fat-menu")
    WebElement catalog;

    @FindBy (xpath = "//app-root/div/div/rz-header/header/div/div/rz-header-fat-menu/fat-menu/div/ul/li[9]/a")
    WebElement sport;

    @FindBy (xpath = "//app-root/div/div/rz-header/header/div/div/rz-header-fat-menu/fat-menu/div/ul/li[9]/div/div[2]/div[1]/div[1]/ul[1]/li/a")
    WebElement fitness;

    @FindBy (xpath = "//div/main/div[1]/rz-widget-auto-portal/div/ul/li[2]/a")
    WebElement trampoline;


    public void findBatutes(WebDriver webDriver){
        Actions actions = new Actions(webDriver);
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(catalog));
        catalog.click();
        actions.moveToElement(sport).perform();
        wait.until(ExpectedConditions.elementToBeClickable(fitness));
        fitness.click();
        wait.until(ExpectedConditions.elementToBeClickable(trampoline));
        trampoline.click();
    }
}
