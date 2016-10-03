import java.util.*;

/**
 * Created by Sachi on 2/10/2016.
 */
public class STDeck {
    private static final int CARDS_LEFT_IN_THE_DECK = 0;
    private static final int NUM_OF_PLAYER_CARDS = 54;
    private static final int NUMBER_OF_TRUMP_CARDS = 6;
    private static final int NUMBER_OF_TIMES_TO_SHUFFLE = 500;
    private List<STCard> LCards = new ArrayList<STCard>();


    public STDeck() {
        LCards = new ArrayList<>();
        for (int i = 0; i < NUM_OF_PLAYER_CARDS; i++) {
            STCard c = new STCard(i,"P", "Title " + i);
            LCards.add(c);
        }
        for (int i = 0; i < NUMBER_OF_TRUMP_CARDS; i++) {
            STCard c = new STCard(i,"T", "Trump Card " + i);
            LCards.add(c);
        }
        CardProperties(5);
    }

    private void CardProperties(int cardIndex) {
        HashMap<String,List<String>> dct =  new HashMap<>();
        List<String> lst1 = new ArrayList<>();
        lst1.add("7");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.65");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("poor/none");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("igneous");
        lst4.add("metamorphic");
        lst4.add("sedimentary");

        dct.put("occurrence",lst4);

        this.LCards.get(cardIndex).setCardProperties(dct);
    }


    public void ShuffleTheDeck() {
        Random rnd = new Random();
        for(int i = 0; i< NUMBER_OF_TIMES_TO_SHUFFLE; i++)
        {
            int i1 = rnd.nextInt(60);
            int i2 = rnd.nextInt(60);

            Collections.swap(LCards,i1,i2);
        }
        System.out.println("...........................");
        //System.out.println(LCards);
    }

    public void cardAndProperties() {
        int i = 5;
        System.out.println(getCards().get(i).getCardID());
        System.out.println(getCards().get(i).getCardType());
        System.out.println(getCards().get(i).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(i).getCardProperties();
            for (String key : dct.keySet())
            {
                System.out.println(key);
                System.out.println(getCards().get(i).getCardProperties().get(key));
            }
            System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }
    public List<STCard> getCards(){
        return this.LCards;
    }
}
