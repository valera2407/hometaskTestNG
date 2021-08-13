package dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderAllo {

    @DataProvider(name = "providerAllo")

    public static Object[][] dataProviderMethod()

    {

        return new Object[][] {
                {"Ноутбук acer"},
                {"Ноутбук asus"},
                {"Ноутбук lenovo"}};
    }
}
