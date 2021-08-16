package tests;

import dataprovider.DataProviderRozetka;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import business.layer.rozetka.pages.AddToBusketPage;
import business.layer.rozetka.pages.CatalogPage;
import business.layer.rozetka.pages.SearchPage;
import business.layer.rozetka.pages.SortedPage;
import util.layer.Listen;

import java.util.List;

@Listeners(Listen.class)
public class TestRozetka {

    WebDriver webDriver;

    @BeforeClass
    public void openRozetka(){
        webDriver = new ChromeDriver();
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
    }

    @AfterClass
    public void closeRozetka() {
        webDriver.quit();
    }


    @Test(dataProvider = "providerRozetka",
            dataProviderClass = DataProviderRozetka.class)
    public void searchAndAddToBasket(List <String> products){
        SearchPage searchPage = PageFactory.initElements(webDriver, SearchPage.class);
        AddToBusketPage addToBusketPage = PageFactory.initElements(webDriver, AddToBusketPage.class);
        for (String product : products) {
            searchPage.findProducts(product, webDriver);
                searchPage.openProduct(webDriver);
                addToBusketPage.add(webDriver);
        }
    }

    @Test
    public void addMostPopular(){
        CatalogPage catalogPage = PageFactory.initElements(webDriver, CatalogPage.class);
        SortedPage sortedPage = PageFactory.initElements(webDriver, SortedPage.class);
        AddToBusketPage addToBusketPage = PageFactory.initElements(webDriver, AddToBusketPage.class);
        catalogPage.findTrampoline(webDriver);
        sortedPage.openTheMostPopular(webDriver);
        addToBusketPage.add(webDriver);
    }
}
