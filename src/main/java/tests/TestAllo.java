package tests;

import business.layer.allo.pages.BuyPage;
import business.layer.allo.pages.ChangeLanguageAndTheme;
import business.layer.allo.pages.InfoWarantyPage;
import business.layer.allo.pages.SearchPage;
import dataprovider.DataProviderAllo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

@Listeners(Listen.class)
public class TestAllo {

    WebDriver webDriver;

    @BeforeClass
    public void openAllo()
    {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeAllo() {
        webDriver.quit();
    }

    @BeforeMethod
    public void beforeMethod(){
        webDriver.get("https://allo.ua/");
    }

    @Test(dataProvider = "providerAllo",
            dataProviderClass = DataProviderAllo.class)
    public void searh(String product){
        SearchPage searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        BuyPage buyPage = PageFactory.initElements(webDriver, BuyPage.class);
        searchPage.findProducts(product, webDriver);
        searchPage.openProduct(webDriver);
        buyPage.addToBasket(webDriver);
    }

    @Test
    public void waranty(){
        ChangeLanguageAndTheme change = PageFactory.initElements(webDriver, ChangeLanguageAndTheme.class);
        InfoWarantyPage waranty = PageFactory.initElements(webDriver, InfoWarantyPage.class);
        change.changeLanguage(webDriver);
        change.changeTheme(webDriver);
        waranty.infoCheck(webDriver);
        waranty.checkTryChange("04.08.2021", webDriver);
        waranty.checkFixStatus("2944-029684", webDriver);
    }
}
