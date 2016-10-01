import java.util.ArrayList;
import java.util.Random;

public class STDeck {
    private static final int NUM_OF_DECK = 60;
    private ArrayList<STCard> cards;


    public STDeck(){
        cards = new ArrayList<STCard>();
        for (int i = 0; i < NUM_OF_DECK; i++) {
            cards.add(new STCard(i));
        }
    }

    public ArrayList<STCard> dealCards(int nCards) {
        ArrayList<STCard> ret = new ArrayList<STCard>();
        Random rand = new Random();
        for(int i = 0; i < nCards; i++) {
            if (cards.size() > 0) {
                int idx = rand.nextInt(cards.size());
                STCard card = cards.remove(idx);
                ret.add(card);
                System.out.println("card = " + card);
            } else {
                return null;
            }
        }
        return ret;
    }
}