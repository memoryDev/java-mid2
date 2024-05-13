package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<E extends Item> {

    private List<E> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(E item) {
        items.add(item);
    }

    public void displayItems() {
        int sum = 0;

        System.out.println("장바구니 상품 출력");
        for (E item : items) {
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
            sum += item.getTotalPrice();
        }
        System.out.println("전체 가격 합:" + sum);
    }
}