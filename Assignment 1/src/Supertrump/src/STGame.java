import java.util.*;
import java.util.concurrent.SynchronousQueue;


public class STGame {
    private STCard.enumPlayingCategory playCategory;

    public static int playingCategory;

    private int numPlayers;
    private int dealerID;
    private int nextPlayerID;
    private int lastPlayerID = -1;
    private List<STPlayer> players;
    private STDeck deck;

    private STCard lastPlayedCard;

    public STGame(int numOfPlayers, STDeck deck) {
        this.numPlayers = numOfPlayers;
        players = InitialisePlayers();
        this.deck = deck;
        SelectDealer();
    }

    public int getNextPlayerID(){
        return this.nextPlayerID;
    }
    public void setNextPlayerID(int value){
        this.nextPlayerID = value;
    }

    private void SelectDealer() {
        Random rnd = new Random();
        this.dealerID = rnd.nextInt(numPlayers);
        //nextPlayerID = this.dealerID;
        setNextPlayerID(calculateNextPlayerID(dealerID));

        /*
        System.out.println("\nRandom dealer is "+this.dealerID);
        System.out.println("\nNext Player is "+this.nextPlayerID);
        //changeToPlayerID(dealerID);
        System.out.println("--------------------------------");
        */
    }
    public void printDealer(){
        System.out.println("\nDealer is "+this.dealerID);
    }
    private int calculateNextPlayerID(int p) {
        p++;
        if(p >= numPlayers) {
            p = 0;
        }
        return p;
    }
    public void printNextPlayer(){
        System.out.println("\nNext Player is "+ this.getNextPlayerID());
        System.out.println("--------------------------------");
    }

    public STCard.enumPlayingCategory getPlayCategory() {
        return playCategory;
    }
    public void setPlayCategory(STCard.enumPlayingCategory playCategory) {
        this.playCategory = playCategory;
    }

    public void DealCardsToEachPlayer(int numberOfCards){
        int p =  calculateNextPlayerID(getDealerID());
        for(int j = 0; j < numPlayers; j++)
        {
            List<STCard> c = new ArrayList<STCard>();  // arList<STCard>();
            for (int i = 0; i < numberOfCards; i++)
            {
                c.add(this.deck.getCards().get(i));
                this.deck.getCards().remove(i);     // .RemoveAt(i);
            }
            this.players.get(p).setCardsInHand(c);      // .CardsInHand = c;
            p = calculateNextPlayerID(p);
        }
    }

    private List<STPlayer> InitialisePlayers() {
        List<STPlayer> players = new ArrayList<STPlayer>();
        for (int i = 0; i < this.numPlayers; i++){
            STPlayer p = new STPlayer(i);
            players.add(p);
        }
        System.out.println();
        return players;
    }

    public STPlayer getPlayerID(int id){
        return players.get(id);
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getDealerID() {
        return dealerID;
    }

    public void setDealerID(int dealerID) {
        this.dealerID = dealerID;
    }

    public int getLastPlayerID() {
        return lastPlayerID;
    }

    public List<STPlayer> getPlayers() {
        return players;
    }

    public STDeck getDeck() {
        return this.deck;
    }

    public STCard getLastPlayedCard() {
        return lastPlayedCard;
    }

    public void setLastPlayedCard(STCard lastPlayedCard) {
        this.lastPlayedCard = lastPlayedCard;
    }

    public STCard playCard(int id) {
        //this id is Player ID
        //HashMap<String, List<String>> cp = new HashMap<>();
        //HashMap<Integer , STCard> plaiedCard = new HashMap<>();

        //Map<String, Objects> tt = new Map<>();
        List<Object> plaiedCard =  new ArrayList<>();

        STCard playCard = new STCard();
        int selectedCardID = 0;  //, j;

        if (getLastPlayedCard() == null ) {
            //j=0;
            for (STCard card : this.getPlayers().get(id).getCardsInHand()) {
                if (card.getCardType().equalsIgnoreCase("Play")) {
                    /*
                    System.out.println("CardID\t\t: " + card.getCardID());
                    System.out.println("CardTitle\t: " + card.getCardTitle());
                    System.out.println("CardType\t: " + card.getCardType());
                    System.out.println();

                    cp = card.getCardProperties();
                    */
                    //--- Generate Random number to find playig Category 0 - 5
                    int rnd = new Random().nextInt(5);
                    String st = STCard.enumPlayingCategory.values()[rnd].toString();
                    playingCategory = rnd;
                    this.setPlayCategory(STCard.enumPlayingCategory.values()[rnd]);
                    //System.out.println(cp.containsKey(st));
                    //System.out.println("---------------------------");
                    //playCard = card;

                    //plaiedCard.add(selectedCardID);
                    //plaiedCard.add(card);

                    playCard = card;

                    //plaiedCard.put(selectedCardID, card);
                    break;
                }
                selectedCardID++;
            }
        } else {
            plaiedCard = comapareCategory();
            if(plaiedCard.size()==0){
                playCard = (STCard)plaiedCard.get(1);
                selectedCardID = (int)plaiedCard.get(0);
            }

            //Compare played card with cards in hand
            //Get the List of all possibles cards
            //if(Possible List == 0){
            // get a card from the Deck
            // Last played card doesnt change
            // return
            //}

            /*  ========= IF OPERATOR IS PLAYING============
            if(id == 0 ) {
                //Manually Select a Card from the List
                //playCard = selected card;
            } else {
                //Select Random card from the possible list
                //playCard = selected card;
            }
            */

        }

        if(plaiedCard != null){
            this.getPlayers().get(id).getCardsInHand().remove(selectedCardID);
            setLastPlayedCard(playCard);
        } else {
            getPlayers().get(getNextPlayerID()).getCardsInHand().add(drawCardFromDeck(getNextPlayerID()));
        }

        setNextPlayerID(calculateNextPlayerID(id));

        //nextPlayerID = nextPlayerID(id);

        return playCard;
    }

    public STCard drawCardFromDeck(int playerID) {
        STCard c= new STCard();
        if(this.deck.getCards().size()>0){
            c = this.deck.getCards().get(0);
            this.players.get(playerID).getCardsInHand().add(c);
            this.deck.getCards().remove(0);
        }
        return c;
    }

    public STCard compareCard(int playerID,STCard card,String compareCategory) {
        STCard c = new STCard();
        //todo: compare the given card to players hand with the given category adn if found return a card other wise pass
        return c;
    }

    public List<Object> comapareCategory() {


        //STCard c = new STCard();
        List<Object> matchingCard =  new ArrayList<>();



        /*
        HashMap<Integer,String> h = new HashMap<>();
        int cat = this.getPlayCategory().ordinal();
        */
        String category = this.getPlayCategory().toString();
        double chkval = Double.parseDouble(this.getLastPlayedCard().getPlayCategoryValue(this.getPlayCategory().toString()));
        double temp = -1;


        System.out.println("Playing Category Type  : " + category);
        System.out.println("  Value =====          : " + chkval);

        for(int rank = 0 ; rank < this.getPlayers().get(getNextPlayerID()).getCardsInHand().size(); rank++ ){
            try {
                System.out.println("----Playing Category Type  : " + this.getPlayCategory());
                temp = Double.parseDouble(this.getPlayers().get(getNextPlayerID()).getCardsInHand().get(rank).getPlayCategoryValue(this.getPlayCategory().toString()));
                System.out.println("  Value =====          : " + temp);
                if( temp > chkval){
                    matchingCard.add(rank);
                    matchingCard.add(this.getPlayers().get(getNextPlayerID()).getCardsInHand().get(rank));
                    break;
                }
            }
            catch (Exception ex){
            }
        }

        /*
        System.out.println("  Value                : " + this.getLastPlayedCard().getCardProperties().get(this.getPlayCategory().toString()).get(0));
        System.out.println("  hardness          : " + this.getLastPlayedCard().getCardProperties().get("hardness").get(0));
        System.out.println("  specific_gravity  : " + this.getLastPlayedCard().getCardProperties().get("specific_gravity").get(0));
        System.out.println("  cleavage          : " + this.getLastPlayedCard().getCardProperties().get("cleavage").get(0));
        System.out.println("  Crustal_Abundance : " + this.getLastPlayedCard().getCardProperties().get("Crustal_Abundance").get(0));
        System.out.println("  Economic_Value    : " + this.getLastPlayedCard().getCardProperties().get("Economic_Value").get(0));

        System.out.println("  hardness          : " + this.getLastPlayedCard().getHardness());
        System.out.println("  specific_gravity  : " + this.getLastPlayedCard().getSpecificGravity());
        System.out.println("  cleavage          : " + this.getLastPlayedCard().getCleavage());
        System.out.println("  Crustal_Abundance : " + this.getLastPlayedCard().getCrustalAbundance());
        System.out.println("  Economic_Value    : " + this.getLastPlayedCard().getEconomicValue());
        */


        /*
        System.out.println("Playing Category Value : " + this.getLastPlayedCard().getCleavage());
        STCard lastcard = getLastPlayedCard()

        switch (cat){
            case 0:     //hardness
                break;
            case 1:     //specific_gravity
                break;
            case 2:     //cleavage
                h = c.getCleavage();
                break;
            case 3:     //Crustal_Abundance
                h = c.getCrustalAbundance();
                break;
            case 4:     //Economic_Value
                h = c.getEconomicValue();
                break;
        }


        if(cat>1){
            for (int i: h.keySet())
            {
                System.out.println(i);
                System.out.println(h.get(i));
                for(int j=0; j<)
            }
        }
        */
        //System.out.println();
        return matchingCard;
    }



}
