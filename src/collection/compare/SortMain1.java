package collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬 후");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
