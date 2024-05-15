package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());

        foreach(list);
        foreach(set);

    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass() );
        while (iterator.hasNext()) {
            System.out.println("iterator.next() = " + iterator.next());
        }
    }

    private static void foreach(Iterable<Integer> iterable) {
        System.out.println("foreach = " + iterable.getClass() );
        for (Integer value : iterable) {
            System.out.println("value = " + value);
        }
    }
}
