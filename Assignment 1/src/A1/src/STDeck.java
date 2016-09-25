import java.util.ArrayList;
import java.util.Random;

public class STDeck {
    private static final int NUM_OF_DECK = 60;
    private ArrayList<STCard> cards;


    public STDeck(){
        cards = new ArrayList<STCard>(NUM_OF_DECK);
        for (int i = 0; i < cards.size(); i++) {
            cards.add(new STCard());
            //google how to create random array of integer
        }
    }

    public ArrayList<STCard> dealCards(int numCardsToDeal) {
        ArrayList<STCard> ret= new ArrayList<STCard>();
        int nCards = 0;
        for(int i = 0; 1 < nCards; i++){
            int id = new Random().nextInt(cards.size());
            STCard card =cards.remove(id);
            ret.add(card);
            System.out.println("\n card =" + card );
        }
        return ret;
    }
}
