import java.util.ArrayList;

public class STDeck {
    private static final int NUM_OF_DECK = 60;
    private ArrayList<STCard> cards;

    //todo: List of cards

    public STDeck(){
        cards = new ArrayList<STCard>(NUM_OF_DECK);
        for (int i = 0; i < cards.size(); i++) {
            cards.add(new STCard());
            //google how to create random array of integer
        }
    }

    public ArrayList<STCard> dealCards(int numCardsToDeal) {
        return null;
    }
}
