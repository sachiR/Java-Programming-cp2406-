import java.util.ArrayList;
import java.util.Random;

public class STDeck {
    private static final int NUM_OF_DECK = 5;
    private ArrayList<STCard> cards;


    public STDeck(){
        cards = new ArrayList<STCard>();
        for (int i = 0; i < NUM_OF_DECK; i++) {
            cards.add(new STCard(i));
        }
    }

    public ArrayList<STCard> dealCards(int nCards) {
        ArrayList<STCard> ret = new ArrayList<STCard>();
        for(int i = 0; i < nCards; i++) {
              int id = new Random().nextInt(cards.size());
              STCard card = cards.remove(id);
              ret.add(card);
              System.out.println("\n card = " + card);
        }
        return ret;
    }
}
