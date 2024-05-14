package collection.map.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        List<String> list = new ArrayList<>();

        for (String s : map.keySet()) {
            if (map.get(s) >= 1000) {
                list.add(s);
            }
        }

        System.out.println(list);
    }
}
