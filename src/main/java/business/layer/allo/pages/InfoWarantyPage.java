package business.layer.allo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InfoWarantyPage {

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div/div[3]/ul/li[7]")
    WebElement info;

    @FindBy (xpath = "//div[4]/div[2]/div[2]/div/div/div[2]/div/div/ul/li[2]/a")
    WebElement changeBack14Days;

    @FindBy (id = "datepicker")
    WebElement controlDate;

    @FindBy (id = "check_date")
    WebElement check;

    @FindBy (xpath = "//div[4]/div[2]/div[2]/div/div/div[2]/div/div/ul/li[5]/a")
    WebElement checkStatus;

    @FindBy (className = "service-show-popup-link")
    WebElement checkAgain;


    public void infoCheck (WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(info));
        info.click();
    }

    public void checkTryChange (String buyDate, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(changeBack14Days));
        changeBack14Days.click();
        wait.until(ExpectedConditions.elementToBeClickable(controlDate));
        controlDate.sendKeys(buyDate);
        wait.until(ExpectedConditions.elementToBeClickable(check));
        check.click();
    }

    public void checkFixStatus (String actNumber, WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(checkStatus));
        checkStatus.click();
        wait.until(ExpectedConditions.elementToBeClickable(checkAgain));
        checkAgain.click();
    }
}
