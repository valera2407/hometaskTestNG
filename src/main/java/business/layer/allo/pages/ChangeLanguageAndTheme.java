package business.layer.allo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeLanguageAndTheme {
    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div/div[2]/div")
    WebElement theme;

    @FindBy (xpath = "//*[@id=\"__layout\"]/div/div[1]/div[1]/div[1]/div/div[4]/span[2]/div")
    WebElement language;

    public void changeLanguage(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(language));
        language.click();
    }

    public void changeTheme(WebDriver webDriver){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(theme));
        theme.click();
    }
}
