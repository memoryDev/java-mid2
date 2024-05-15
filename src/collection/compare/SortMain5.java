package collection.compare;

import java.util.Set;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        Set<MyUser> treeSet = new TreeSet<>();
        treeSet.add(myUser1);
        treeSet.add(myUser2);
        treeSet.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet);

        Set<MyUser> treeSet6 = new TreeSet<>(new IdComparator());
        treeSet6.add(myUser1);
        treeSet6.add(myUser2);
        treeSet6.add(myUser3);
        System.out.println("IdComparable 정렬");
        System.out.println(treeSet6);

    }
}
