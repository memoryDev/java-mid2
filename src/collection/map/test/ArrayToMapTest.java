package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][]  productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성
        Map<String, Integer> map = new HashMap<>();
        for (String[] arr : productArr) {
            String productName = arr[0];
            int price = Integer.parseInt(arr[1]);

            map.put(productName, price);
        }

        // Map의 모든 데이터 출력 - 코드 작성
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
