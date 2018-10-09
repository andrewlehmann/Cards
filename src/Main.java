import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Drew on 10/9/2018.
 */
public class Main {
    public static void main(String[] args) {
        List<Card> deck = new ArrayList<>();

        for (int i = 0; i < 52; i++) {
            for (Suit suit : Suit.values()) {
                deck.add(new Card(i, suit));
            }
        }

        Shuffler shuffler = new Shuffler();

        List<String> shuffledDeck =
            shuffler.shuffle(deck).stream()
                .map(Card::toString)
                .collect(Collectors.toList());

        System.out.println(shuffledDeck);
    }
}
