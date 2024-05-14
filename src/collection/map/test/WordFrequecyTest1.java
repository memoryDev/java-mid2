package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequecyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");

        Map<String, Integer> result = new HashMap<>();
        for (String s : textArr) {
            int num = 1;
            if (result.containsKey(s)) {
                num = result.get(s) + 1;
            }

           result.put(s, num);
        }

        System.out.println(result);
    }
}
