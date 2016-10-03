import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
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
        CardProperties();
    }

    private void CardProperties() {
        HashMap<String, List<String>> dct = new HashMap<>();
        try{
            File fXmlFile = new File("C:\\Users\\Sachini\\Documents\\GitHub\\Java-Programming-cp2406-\\Assignment 1\\src\\Supertrump\\src\\MstCards_151021.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

        } catch (Exception e){
            e.printStackTrace();
        }

        //this.LCards.get(cardIndex).setCardProperties(dct);
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
        int cardIndex = 5;
        System.out.println(getCards().get(cardIndex).getCardID());
        System.out.println(getCards().get(cardIndex).getCardType());
        System.out.println(getCards().get(cardIndex).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(cardIndex).getCardProperties();
            for (String key : dct.keySet())
            {
                System.out.println(key);
                System.out.println(getCards().get(cardIndex).getCardProperties().get(key));
            }
            System.out.println(getCards().get(cardIndex).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }
    public List<STCard> getCards(){
        return this.LCards;
    }
}
