package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final static int CARD_MAXIMUM = 13;
    private List<Card> cardList;

    public Deck() {
        cardList = new ArrayList<Card>();
        createDeck();

        //카드 랜덤 섞기
        Collections.shuffle(cardList);
    }

    private void createDeck() {
        for (int i = 1; i <= CARD_MAXIMUM; i++) {
            cardList.add(new Card(0, i, "\u2660")); // 스페이드
            cardList.add(new Card(1, i, "\u2665")); // 하트
            cardList.add(new Card(2, i, "\u2666")); // 다이아몬드
            cardList.add(new Card(3, i, "\u2663")); // 클로버
        }
    }

    public List<Card> getCardList() {
        return cardList;
    }
}
