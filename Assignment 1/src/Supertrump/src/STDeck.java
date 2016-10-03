import jdk.nashorn.internal.ir.PropertyNode;

import java.util.*;

/**
 * Created by Sachi on 2/10/2016.
 */
public class STDeck {
    private static final int CARDS_LEFT_IN_THE_DECK = 0;
    private static final int NUMBER_OF_TIMES_TO_SHUFFLE = 500;
    private static final int NUM_OF_PLAYER_CARDS = 54;
    private static final int NUMBER_OF_TRUMP_CARDS = 6;
    private List<STCard> cards;


    public STDeck() {
        cards = new ArrayList<>();
        for (int i = 0; i < NUM_OF_PLAYER_CARDS; i++) {
            cards.add(new STCard(0,"Quataz","P"));
            cards.add(new STCard(1,"Plagioclase","P"));
            cards.add(new STCard(2,"Orthoclase","P"));
            cards.add(new STCard(3,"Biotite","P"));
            cards.add(new STCard(4,"Muscovite","P"));
            cards.add(new STCard(5,"Hornblende","P"));
            cards.add(new STCard(6,"Actinolite","P"));
            cards.add(new STCard(7,"Glaucophane","P"));
            cards.add(new STCard(8,"Olivine","P"));
            cards.add(new STCard(9,"Garnet","P"));
            cards.add(new STCard(10,"Titanite","P"));
            cards.add(new STCard(11,"Zircon","P"));
            cards.add(new STCard(12,"Augite","P"));
            cards.add(new STCard(13,"Orthopyroxene","P"));
            cards.add(new STCard(14,"Chlorite","P"));
            cards.add(new STCard(15,"Antigorite","P"));
            cards.add(new STCard(16,"Talc","P"));
            cards.add(new STCard(17,"Kaolinite","P"));
            cards.add(new STCard(18,"Andalusite","P"));
            cards.add(new STCard(19,"Kyanite","P"));
            cards.add(new STCard(20,"Sillimanite","P"));
            cards.add(new STCard(21,"Staurolite","P"));
            cards.add(new STCard(22,"Epidote","P"));
            cards.add(new STCard(23,"Tourmaline","P"));
            cards.add(new STCard(24,"Topaz","P"));
            cards.add(new STCard(25,"Beryl","P"));
            cards.add(new STCard(26,"Pyrite","P"));
            cards.add(new STCard(27,"Pyrrhotite","P"));
            cards.add(new STCard(28,"Chalcopyrite","P"));
            cards.add(new STCard(29,"Galena","P"));
            cards.add(new STCard(30,"Sphalerite","P"));
            cards.add(new STCard(31,"Molybdenite","P"));
            cards.add(new STCard(32,"Gold","P"));
            cards.add(new STCard(33,"Diamond","P"));
            cards.add(new STCard(34,"Graphite","P"));
            cards.add(new STCard(35,"Halite","P"));
            cards.add(new STCard(36,"Fluorite","P"));
            cards.add(new STCard(37,"Gypsum","P"));
            cards.add(new STCard(38,"Barite","P"));
            cards.add(new STCard(39,"Apatite","P"));
            cards.add(new STCard(40,"Monazite","P"));
            cards.add(new STCard(41,"Calcite","P"));
            cards.add(new STCard(42,"Dolomite","P"));
            cards.add(new STCard(43,"Magnesite","P"));
            cards.add(new STCard(44,"Siderite","P"));
            cards.add(new STCard(45,"Magnetite","P"));
            cards.add(new STCard(46,"Hematite","P"));
            cards.add(new STCard(47,"Chromite","P"));
            cards.add(new STCard(48,"Ilmenite","P"));
            cards.add(new STCard(49,"Rutile","P"));
            cards.add(new STCard(50,"Corundum","P"));
            cards.add(new STCard(51,"Cassiterite","P"));
            cards.add(new STCard(52,"Gibbsite","P"));
            cards.add(new STCard(53,"Goethite","P"));
        }
        for (int i = 0; i < NUMBER_OF_TRUMP_CARDS; i++) {
            cards.add(new STCard(0,"The Miner","T","Economic value"));
            cards.add(new STCard(1,"The Petrologist","T","Crustal abundance"));
            cards.add(new STCard(2,"The Gemmologist","T","Hardness"));
            cards.add(new STCard(3,"The Mineralogist","T","Cleavage"));
            cards.add(new STCard(4,"The Geophysicist","T","Specific gravity"));
            cards.add(new STCard(5,"The Geologist","T","Change to trumps category of your choice"));

        }
        System.out.println(cards);
    }


    public void ShuffleTheDeck() {
    }

}
