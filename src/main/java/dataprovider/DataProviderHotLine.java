package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderHotLine {

    @DataProvider(name = "providerHotLine")

    public static Object[][] dataProviderMethod()

    {

        return new Object[][] {
                {"Холодильник"},
                {"Микроволновка"},
                {"Вытяжка"}};
    }
}
