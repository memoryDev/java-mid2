package collection.compare.test;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {

        if (o1.getCardNumber() == o2.getCardNumber()) {
            return o1.getIdx() < o2.getIdx() ? -1: 1;
        } else {
            return o1.getCardNumber() < o2.getCardNumber() ? -1 : 1;
        }
    }
}
