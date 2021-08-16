package dataprovider;

import org.testng.annotations.DataProvider;
import util.layer.ReaderForProvider;

import java.io.IOException;
import java.util.List;

public class DataProviderRozetka {

    static List <String> data;
    static ReaderForProvider read;

    @DataProvider(name = "providerRozetka")



    public static Object[][] dataProviderMethod() throws IOException {
        read = new ReaderForProvider();
        read.reader();
        data = read.getListRozetka();
        return new Object[][]{
                {data}
        };
    }
}
