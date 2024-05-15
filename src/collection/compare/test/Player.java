package collection.compare.test;

import java.util.List;

public class Player {
    private String name; //플레이어 이름
    private List<Card> cardList;

    public Player(String name, List<Card> cardList) {
        this.name = name;
        this.cardList = cardList;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    @Override
    public String toString() {
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        sb.append(name + "의 카드: ");
        sb.append(name + "[");
        for (Card card : cardList) {
            if (idx != 0) {
                sb.append(", ");
            }
            sb.append(card.getCardNumber() + "(" + card.getPattern() + ")");

            idx++;
        }
        sb.append(name + "], 합계: 0");

        return sb.toString();
    }
}
