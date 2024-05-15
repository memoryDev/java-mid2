package collection.compare.test;

public class Card{
    private int idx = 0;    // 카드순서
    private int cardNumber; // 카드번호
    private String pattern; // 카드문양

    public Card(int idx, int cardNumber, String pattern) {
        this.idx = idx;
        this.cardNumber = cardNumber;
        this.pattern = pattern;
    }

    public int getIdx() {
        return idx;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber=" + cardNumber +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
