package academy.devdojo.maratonajava.javacore.Xgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("França");
        list.add("Senegal");
        list.add("Paris");

        for (String e : list) {
            System.out.println(e);
        }
    }
}
