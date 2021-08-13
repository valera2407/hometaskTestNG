package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderRozetka {

    @DataProvider(name = "providerRozetka")

    public static Object[][] dataProviderMethod()

    {

        return new Object[][] {
                {"Iphone"},
                {"Samsung"},
                {"Xiaomi"}};
    }
}
