import java.util.Collections;
import java.util.List;

/**
 * Created by Drew on 10/9/2018.
 */
class Shuffler {
    List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);

        return cards;
    }
}
