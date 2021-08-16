package util.layer;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.*;
import java.io.*;

public class PropertieReader {
    @Test

        public static void reader()throws Exception {
            FileReader reader = new FileReader("src/main/resources/test.properties");

            Properties p = new Properties();
            p.load(reader);
            System.out.println(p.getProperty("browser"));
            System.out.println(p.getProperty("suite"));
        }
}
