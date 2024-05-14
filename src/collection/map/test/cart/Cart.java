package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int quantity) {

        int oldQuantity = 0;

        if (cartMap.containsKey(product)) {
            oldQuantity = cartMap.get(product);
        }

        cartMap.put(product, quantity + oldQuantity);
    }

    public void minus(Product product, int quantity) {

        int oldQuantity = 0;

        if (cartMap.containsKey(product)) {
            oldQuantity = cartMap.get(product);
        }

        if (oldQuantity - quantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, oldQuantity - quantity);
        }

    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }
}
