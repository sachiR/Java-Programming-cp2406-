
import java.util.*;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

public class STDeck {
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

    public STDeck() {
        for (int i = 0; i < 54; i++) {
            STCard c = new STCard(i, "Play", "Title " + i);
            LCards.add(c);
            LoadCardProperties(i);
        }
        for (int i = 0; i < 6; i++) {
            STCard c = new STCard(i, "Trump", "Trunp Card " + (i+54));
            LCards.add(c);
            LoadTrumpCardProperties(i+NUM_OF_PLAYER_CARDS);
        }
    }

    private void LoadTrumpCardProperties(int index) {
        HashMap<String, List<String>> cp = new HashMap<String, List<String>>();
        switch (index){
            case 54:
                cp = CardProperties54();
                break;
            case 55:
                cp = CardProperties55();
                break;
            case 56:
                cp = CardProperties56();
                break;
            case 57:
                cp = CardProperties57();
                break;
            case 58:
                cp = CardProperties58();
                break;
            case 59:
                cp = CardProperties59();
                break;
        }
        this.LCards.get(index).setCardProperties(cp);
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
            case 9:
                cp = CardProperties9();
                break;
            case 10:
                cp = CardProperties10();
                break;
            case 11:
                cp = CardProperties11();
                break;
            case 12:
                cp = CardProperties12();
                break;
            case 13:
                cp = CardProperties13();
                break;
            case 14:
                cp = CardProperties14();
                break;
            case 15:
                cp = CardProperties15();
                break;
            case 16:
                cp = CardProperties16();
                break;
            case 17:
                cp = CardProperties17();
                break;
            case 18:
                cp = CardProperties18();
                break;
            case 19:
                cp = CardProperties19();
                break;
            case 20:
                cp = CardProperties20();
                break;
            case 21:
                cp = CardProperties21();
                break;
            case 22:
                cp = CardProperties22();
                break;
            case 23:
                cp = CardProperties23();
                break;
            case 24:
                cp = CardProperties24();
                break;
            case 25:
                cp = CardProperties25();
                break;
            case 26:
                cp = CardProperties26();
                break;
            case 27:
                cp = CardProperties27();
                break;
            case 28:
                cp = CardProperties28();
                break;
            case 29:
                cp = CardProperties29();
                break;
            case 30:
                cp = CardProperties30();
                break;
            case 31:
                cp = CardProperties31();
                break;
            case 32:
                cp = CardProperties32();
                break;
            case 33:
                cp = CardProperties33();
                break;
            case 34:
                cp = CardProperties34();
                break;
            case 35:
                cp = CardProperties35();
                break;
            case 36:
                cp = CardProperties36();
                break;
            case 37:
                cp = CardProperties37();
                break;
            case 38:
                cp = CardProperties38();
                break;
            case 39:
                cp = CardProperties39();
                break;
            case 40:
                cp = CardProperties40();
                break;
            case 41:
                cp = CardProperties41();
                break;
            case 42:
                cp = CardProperties42();
                break;
            case 43:
                cp = CardProperties43();
                break;
            case 44:
                cp = CardProperties44();
                break;
            case 45:
                cp = CardProperties45();
                break;
            case 46:
                cp = CardProperties46();
                break;
            case 47:
                cp = CardProperties47();
                break;
            case 48:
                cp = CardProperties48();
                break;
            case 49:
                cp = CardProperties49();
                break;
            case 50:
                cp = CardProperties50();
                break;
            case 51:
                cp = CardProperties51();
                break;
            case 52:
                cp = CardProperties52();
                break;
            case 53:
                cp = CardProperties53();
                break;
        }
        this.LCards.get(index).setCardProperties(cp);

    }

    public void printCardAndProperties(STCard card) {
        System.out.println("---------------------------------");
        if(card==null){
            System.out.println("NOTHING TO PRINT");
            return;
        }
        System.out.println("---------------------------------");
        System.out.println("CardID\t\t: "+card.getCardID());
        System.out.println("CardTitle\t: "+card.getCardTitle());
        System.out.println("CardType\t:"+ card.getCardType());
        System.out.println("---------------------------------");


        try {
            HashMap<String,List<String>> dct = card.getCardProperties();
            String s=null;
            System.out.println("   ===== Card Properties ======");
            for (String key : dct.keySet())
            {
                if(s != key){
                    System.out.print(key + "\t");
                    s=key;
                }
                //System.out.println(key);
                System.out.println(": " + card.getCardProperties().get(key));
            }
            //System.out.println(getCards().get(i).getCardProperties().get("hardness"));
        }
        catch (Exception e){
            System.out.println("No Properties");
        }
    }
    public void printCardAndProperties(STCard card, STCard.enumPlayingCategory cat) {

        this.printCardAndProperties(card);
        if(card==null){return;}
        System.out.println("---------------------------------");
        System.out.println("Play Category\t:" + ((cat != null) ? cat : "No Selected Category"));
    }


    private HashMap<String, List<String>> CardProperties0(){


        LCards.get(0).setCardTitle("Quartz");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.65");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("poor/");
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
        //this.LCards.get(0).setCardProperties(dct);
    }
    private HashMap<String, List<String>> CardProperties1(){

        LCards.get(1).setCardTitle("Plagioclase");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6-6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6-2.8");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        //lst3.add("");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("very high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties2(){
        LCards.get(2).setCardTitle("Orthoclase");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6-6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.5-2.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        //lst3.add("");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties3(){
        LCards.get(3).setCardTitle("Biotite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5-3");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.7-3.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties4(){
        LCards.get(4).setCardTitle("Muscovite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5-3");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.8-2.9");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties5(){
        LCards.get(5).setCardTitle("Hornblende");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties6(){
        LCards.get(6).setCardTitle("Actinolite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties7(){
        LCards.get(7).setCardTitle("Glaucophane");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0-3.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties8(){
        LCards.get(8).setCardTitle("Olivine");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6.5-7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2-4.4");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties9(){
        LCards.get(9).setCardTitle("Garnet");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6-7.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.5-4.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties10(){
        LCards.get(10).setCardTitle("Titanite");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-5.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.4-3.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties11(){
        LCards.get(11).setCardTitle("Zircon");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("7.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.6-4.7");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties12(){
        LCards.get(12).setCardTitle("Augite");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5.5-6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2-3.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties13(){
        LCards.get(13).setCardTitle("Orthopyroxene");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5-6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2-3.9");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("high");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties14(){
        LCards.get(14).setCardTitle("Chlorite");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2-3");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6-3.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties15(){
        LCards.get(15).setCardTitle("Antigorite");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3.5-4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties16(){
        LCards.get(16).setCardTitle("Talc");
        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("1");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6-2.8");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties17(){
        LCards.get(17).setCardTitle("Kaolinite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("1.5-2.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6-2.7");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties18(){
        LCards.get(18).setCardTitle("Andalusite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6.5-7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.15");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties19(){
        LCards.get(19).setCardTitle("Kyanite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5.5-7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.5-3.7");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties20(){
        LCards.get(20).setCardTitle("Sillimanite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6.5-7.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.25");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties21(){
        LCards.get(21).setCardTitle("Staurolite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.7-3.8");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties22(){
        LCards.get(22).setCardTitle("Epidote");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6 - 6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2 - 3.5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("trivial");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties23(){
        LCards.get(23).setCardTitle("Tourmaline");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("7 - 7.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0 - 3.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties24(){
        LCards.get(24).setCardTitle("Topaz");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("8");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.5 - 3.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("ultratrace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties25(){
        LCards.get(25).setCardTitle("Beryl");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("7.5 - 8");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.6 - 2.9");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties26(){
        LCards.get(26).setCardTitle("Pyrite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6 - 6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties27(){
        LCards.get(27).setCardTitle("Pyrrhotite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3.5 4.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties28(){
        LCards.get(28).setCardTitle("Chalcopyrite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3.5 - 4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.1 - 4.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("very high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties29(){
        LCards.get(29).setCardTitle("Galena");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("7.5 - 7.6");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties30(){
        LCards.get(30).setCardTitle("Sphalerite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3.5 - 4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.9 - 4.1");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("6 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties31(){
        LCards.get(31).setCardTitle("Molybdenite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("1 - 1.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.7");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties32(){
        LCards.get(32).setCardTitle("Gold");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5 - 3");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("19.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("ultratrace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("I'm rich!");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties33(){
        LCards.get(33).setCardTitle("Diamond");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("10");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("4 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("ultratrace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("I'm rich!");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties34(){
        LCards.get(34).setCardTitle("Graphite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("1 - 2");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties35(){
        LCards.get(35).setCardTitle("Halite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties36(){
        LCards.get(36).setCardTitle("Fluorite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("4 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties37(){
        LCards.get(37).setCardTitle("Gypsum");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties38(){
        LCards.get(38).setCardTitle("Barite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3 - 3.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.5");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 perfect, 1 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties39(){
        LCards.get(39).setCardTitle("Apatite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.1 - 3.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties40(){
        LCards.get(40).setCardTitle("Monazite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("5.0 - 5.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 good, 1 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties41(){
        LCards.get(41).setCardTitle("Calcite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.7");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties42(){
        LCards.get(42).setCardTitle("Dolomite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("3.5 - 4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.9");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("low");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties43(){
        LCards.get(43).setCardTitle("Magnesite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("4");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("3.0");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties44(){
        LCards.get(44).setCardTitle("Siderite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("4 - 4.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("3 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties45(){
        LCards.get(45).setCardTitle("Magnetite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5.5 - 6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("5.2");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("very high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties46(){
        LCards.get(46).setCardTitle("Hematite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5 - 6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("5.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties47(){
        LCards.get(47).setCardTitle("Chromite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.5 - 5.1");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties48(){
        LCards.get(48).setCardTitle("Ilmenite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5 - 6");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.7 - 4.8");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties49(){
        LCards.get(49).setCardTitle("Rutile");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6 - 6.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("2 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties50(){
        LCards.get(50).setCardTitle("Corundum");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("9");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.0");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("none");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties51(){
        LCards.get(51).setCardTitle("Cassiterite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("6 - 7");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("6.9 - 7.1");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 good, 1 poor");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("trace");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties52(){
        LCards.get(52).setCardTitle("Gibbsite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("2.5 - 3.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("2.4");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("low");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("high");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);


        return  dct;

    }
    private HashMap<String, List<String>> CardProperties53(){
        LCards.get(53).setCardTitle("Goethite");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("5 - 5.5");
        dct.put(STCard.enumPlayingCategory.values()[0].toString(),lst1);

        List<String> lst2 = new ArrayList<>();
        lst2.add("4.3");
        dct.put(STCard.enumPlayingCategory.values()[1].toString(),lst2);

        List<String> lst3 = new ArrayList<>();
        lst3.add("1 perfect, 1 good");
        dct.put(STCard.enumPlayingCategory.values()[2].toString(),lst3);

        List<String> lst4 = new ArrayList<>();
        lst4.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[3].toString(),lst4);

        List<String> lst5 = new ArrayList<>();
        lst5.add("moderate");
        dct.put(STCard.enumPlayingCategory.values()[4].toString(),lst5);

        return  dct;

    }
    //6 trump cards
    private HashMap<String, List<String>> CardProperties54(){
        LCards.get(54).setCardTitle("The Miner");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Economic value");
        dct.put("subtitle",lst1);

        return  dct;

    }
    private HashMap<String, List<String>> CardProperties55(){
        LCards.get(55).setCardTitle("The Petrologist");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Crustal abundance");
        dct.put("subtitle",lst1);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties56(){
        LCards.get(56).setCardTitle("The Gemmologist");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Hardness");
        dct.put("subtitle",lst1);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties57(){
        LCards.get(57).setCardTitle("The Mineralogist");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Cleavage");
        dct.put("subtitle",lst1);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties58(){
        LCards.get(58).setCardTitle("The Geophysicist");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Specific gravity");
        dct.put("subtitle",lst1);

        return  dct;
    }
    private HashMap<String, List<String>> CardProperties59(){
        LCards.get(59).setCardTitle("The Geologist");

        HashMap<String,List<String>> dct =  new HashMap<>();

        List<String> lst1 = new ArrayList<>();
        lst1.add("Change to trumps category of your choice");
        dct.put("subtitle",lst1);

        return  dct;
    }
}





