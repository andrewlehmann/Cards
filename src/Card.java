/**
 * Created by Drew on 10/9/2018.
 */
public class Card {
    private int value;

    private Suit suit;

    Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s-%s", value, suit);
    }
}
