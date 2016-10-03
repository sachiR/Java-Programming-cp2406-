
import java.util.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class STDeck {
    private static final int CARDS_LEFT_IN_THE_DECK = 0;
    private static final int NUM_OF_PLAYER_CARDS = 54;
    private static final int NUMBER_OF_TRUMP_CARDS = 6;
    private static final int NUMBER_OF_TIMES_TO_SHUFFLE = 500;
    private List<STCard> LCards = new ArrayList<STCard>();

    public void ShuffleTheDeck() {
        Random rnd = new Random();
        for(int i = 0; i< NUMBER_OF_TIMES_TO_SHUFFLE; i++)
        {
            int i1 = rnd.nextInt(60);
            int i2 = rnd.nextInt(60);

            Collections.swap(LCards,i1,i2);
        }
        System.out.println("...........................");
    }


    public List<STCard> getCards(){
        return this.LCards;
    }

    public STDeck(){
        for(int i = 0; i<54 ; i++){
            STCard c = new STCard(i,"P", "Title " + i);
            LCards.add(c);
        }
        for(int i = 0; i<6 ; i++){
            STCard c = new STCard(i,"T", "Trunp Card " + i);
            LCards.add(c);
        }
        CardProperties0();
        cardAndProperties0();
        CardProperties1();
        cardAndProperties1();
        CardProperties2();
        cardAndProperties2();
    }

    private void CardProperties0(){

        HashMap<String,List<String>> dct =  new HashMap<>();
        List<String> lst0 = new ArrayList<>();
        lst0.add("Quartz");
        dct.put("Title",lst0);

        List<String> lst1 = new ArrayList<>();
        lst1.add("7");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.65");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("poor/");
        lst3.add("none");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);


        this.LCards.get(0).setCardProperties(dct);
    }

    public void cardAndProperties0() {
        int i = 0;
        System.out.println("---------------------------------");
        System.out.println("CardID:"+getCards().get(i).getCardID());
        System.out.println("CardType:"+getCards().get(i).getCardType());
        //s
        // System.out.println("CardTitle:"+getCards().get(i).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(i).getCardProperties();
            for (String key : dct.keySet())
            {
                System.out.println(key);
                System.out.println(getCards().get(i).getCardProperties().get(key));
            }
            //System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }
    private void CardProperties1(){

        HashMap<String,List<String>> dct =  new HashMap<>();
        List<String> lst0 = new ArrayList<>();
        lst0.add("Plagioclase");
        dct.put("Title",lst0);

        List<String> lst1 = new ArrayList<>();
        lst1.add("6");
        lst1.add("6.5");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6");
        lst2.add("2.8");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        lst3.add("1 good");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("veryhigh");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);


        this.LCards.get(1).setCardProperties(dct);
    }

    public void cardAndProperties1() {
        int i = 1;
        System.out.println("---------------------------------");
        System.out.println("CardID:"+getCards().get(i).getCardID());
        System.out.println("CardType:"+getCards().get(i).getCardType());
        //s
        // System.out.println("CardTitle:"+getCards().get(i).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(i).getCardProperties();
            for (String key : dct.keySet())
            {
                System.out.println(key);
                System.out.println(getCards().get(i).getCardProperties().get(key));
            }
            //System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }private void CardProperties2(){

        HashMap<String,List<String>> dct =  new HashMap<>();
        List<String> lst0 = new ArrayList<>();
        lst0.add("Orthoclase");
        dct.put("Title",lst0);

        List<String> lst1 = new ArrayList<>();
        lst1.add("6");
        lst1.add("6.5");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.5");
        lst2.add("2.6");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        lst3.add("1 good");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);


        this.LCards.get(2).setCardProperties(dct);
    }

    public void cardAndProperties2() {
        int i = 2;
        System.out.println("---------------------------------");
        System.out.println("CardID:"+getCards().get(i).getCardID());
        System.out.println("CardType:"+getCards().get(i).getCardType());
        //s
        // System.out.println("CardTitle:"+getCards().get(i).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(i).getCardProperties();
            for (String key : dct.keySet())
            {
                System.out.println(key);
                System.out.println(getCards().get(i).getCardProperties().get(key));
            }
            //System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }
}
