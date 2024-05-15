package collection.compare.test;

import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {

        // 카드 생성
        Deck deck = new Deck();
        List<Card> cardList = deck.getCardList();

        //플레이어 추가
        Player player1 = new Player("플레이어1", cardList.subList(0, 5));
        player1.getCardList().sort(new CardComparator());
        Player player2 = new Player("플레이어2", cardList.subList(6, 11));
        player2.getCardList().sort(new CardComparator());

        System.out.println(player1);
        System.out.println(player2);
    }
}
