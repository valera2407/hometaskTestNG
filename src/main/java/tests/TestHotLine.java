package tests;

import business.layer.hotline.pages.ComeToShopPage;
import business.layer.hotline.pages.LikedPage;
import business.layer.hotline.pages.SearchPage;
import dataprovider.DataProviderHotLine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

@Listeners(Listen.class)
public class TestHotLine {

    WebDriver webDriver;

    @BeforeClass
    public void openHotLine()
    {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeHotLine() {
        webDriver.quit();
    }

    @BeforeMethod
    public void beforeMethod(){
        webDriver.get("https://hotline.ua/");
    }


    @Test(dataProvider = "providerHotLine",
            dataProviderClass = DataProviderHotLine.class)
    public void searchAndAddToList(String product){
        SearchPage searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        LikedPage likedPage = PageFactory.initElements(webDriver, LikedPage.class);
        searchPage.findProducts(product, webDriver);
        searchPage.openProduct(webDriver);
        likedPage.addToList(webDriver);
    }


    @Test
    public void openShop(){
        SearchPage searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        ComeToShopPage comeToShop = PageFactory.initElements(webDriver, ComeToShopPage.class);
        searchPage.openProposition(webDriver);
        comeToShop.openShop(webDriver);
    }
}
