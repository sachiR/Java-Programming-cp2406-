import jdk.nashorn.internal.ir.PropertyNode;

import java.util.*;

/**
 * Created by Sachi on 2/10/2016.
 */
public class STDeck {
    private static final int CARDS_LEFT_IN_THE_DECK = 0;
    private static final int NUMBER_OF_TIMES_TO_SHUFFLE = 500;
    private static final int NUMBER_OF_CARDS = 54;
    private static final int NUMBER_OF_TRUMP_CARDS = 6;
    private List<STCard> cards;

    public STDeck() {
        cards = new ArrayList<STCard>();
        for(int i = 0; i < NUMBER_OF_CARDS; i++){
            cards.add(new STCard(i,"Quartz","P",7,2.65,"poor/none","high","moderate"));
        }
        for (int i=0;i<NUMBER_OF_TRUMP_CARDS;i++){
            cards.add(new STCard(i,"Geogolist","T",0,0,"","",""));
        }
        System.out.print(cards);
    }

    public void ShuffleTheDeck() {
    }

}
