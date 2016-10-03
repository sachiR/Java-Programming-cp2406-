
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
            STCard c = new STCard(i,"Play", "Title " + i);
            LCards.add(c);
            LoadCardProperties(i);
        }
        for(int i = 0; i<6 ; i++){
            STCard c = new STCard(i,"Trump", "Trunp Card " + i);
            LCards.add(c);
        }
    }

    private void LoadCardProperties(int index){
        HashMap<String, List<String>> cp = new HashMap<String, List<String>>();
        switch (index){
            case 0:
                cp = CardProperties0();
                break;
            case 1:
                cp = CardProperties1();
                break;
            case 2:
                cp = CardProperties2();
                break;
            case 3:
                cp = CardProperties3();
                break;
            case 4:
                cp = CardProperties4();
                break;
            case 5:
                cp = CardProperties5();
                break;
            case 6:
                cp = CardProperties6();
                break;
            case 7:
                cp = CardProperties7();
                break;
            case 8:
                cp = CardProperties8();
                break;

        }
        this.LCards.get(index).setCardProperties(cp);

    }

    public void printCardAndProperties(int index) {
        //int i = 0;
        System.out.println("---------------------------------");
        System.out.println("CardID\t\t: "+getCards().get(index).getCardID());
        System.out.println("CardType\t:"+getCards().get(index).getCardType());
        //s
        // System.out.println("CardTitle:"+getCards().get(i).getCardTitle());
        try {
            HashMap<String,List<String>> dct = getCards().get(index).getCardProperties();
            String s=null;
            System.out.println("   ===== Card Properties ======");
            for (String key : dct.keySet())
            {
                if(s != key){
                    System.out.print(key + "\t");
                    s=key;
                }
                //System.out.println(key);
                System.out.println(": " + getCards().get(index).getCardProperties().get(key));
            }
            //System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }


    private HashMap<String, List<String>> CardProperties0(){

        LCards.get(0).setCardTitle("Quartz");
        HashMap<String,List<String>> dct =  new HashMap<>();

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

        return  dct;
        //this.LCards.get(0).setCardProperties(dct);
    }
    private HashMap<String, List<String>> CardProperties1(){

        LCards.get(1).setCardTitle("Plagioclase");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6-6.5");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6-2.8");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        //lst3.add("");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("very high");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties2(){
        LCards.get(1).setCardTitle("Orthoclase");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6-6.5");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.5-2.6");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        //lst3.add("");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties3(){
        LCards.get(1).setCardTitle("Biotite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5-3");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.7-3.3");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties4(){
        LCards.get(1).setCardTitle("Muscovite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5-3");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.8-2.9");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties5(){
        LCards.get(1).setCardTitle("Hornblende");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-6");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.5");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties6(){
        LCards.get(1).setCardTitle("Actinolite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-6");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.5");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties7(){
        LCards.get(1).setCardTitle("Glaucophane");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.2");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put("Economic Value",lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties8(){
        LCards.get(1).setCardTitle("Olivine");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6.5-7");
        dct.put("hardness",lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2-4.4");
        dct.put("specific_gravity",lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put("cleavage",lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put("Crustal Abundance",lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put("Economic Value",lst5);

        return  dct;

    }

}





