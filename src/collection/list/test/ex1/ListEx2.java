package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            list.add(num);
            sc.nextLine();
        }
        sc.close();

        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
        }
    }
}
