package util.layer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderForProvider {

    List<String> listRozetka;
    List<String> listAllo;
    List<String> listHotLine;

    public void reader() throws IOException {
        File file = new File("src/main/resources/valuesForTests");
        BufferedReader br = new BufferedReader(new FileReader(file));

        listRozetka = new ArrayList<>();
        listAllo = new ArrayList<>();
        listHotLine = new ArrayList<>();
        String st;

        while ((st = br.readLine()) != null) {
            String key;
            String values;

            String[] array = st.split("\\ = ");
            key =  array[0];
            values =  array[1];

            if (key.equals("TestRozetka")){
                listRozetka.add(values);
            }
            if (key.equals("TestAllo")){
                listAllo.add(values);
            }
            if (key.equals("TestHotLine")){
                listHotLine.add(values);
            }
        }
    }

    public List<String> getListRozetka() {
        return listRozetka;
    }

    public List<String> getListAllo() {
        return listAllo;
    }

    public List<String> getListHotLine() {
        return listHotLine;
    }
}
