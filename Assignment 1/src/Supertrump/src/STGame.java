import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class STGame {
    private STCard.enumPlayingCategory playCategory;
    private int numPlayers;
    private int dealerID;
    public int nextPlayerID;
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

    private void SelectDealer() {
        Random rnd = new Random();
        this.dealerID = rnd.nextInt(numPlayers);
        //nextPlayerID = this.dealerID;
        nextPlayerID = GetNextPlayerID(this.dealerID);
        System.out.println("\nDealer is "+this.dealerID);
        /*
        System.out.println("\nRandom dealer is "+this.dealerID);
        System.out.println("\nNext Player is "+this.nextPlayerID);
        //changeToPlayerID(dealerID);
        System.out.println("--------------------------------");
        */
    }
    private int GetNextPlayerID(int p) {
        p++;
        if(p >= numPlayers) {
            p = 0;
        }
        return p;
    }
    public void printNextPlayer(){
        System.out.println("\nNext Player is "+nextPlayerID);
        System.out.println("--------------------------------");
    }

    public STCard.enumPlayingCategory getPlayCategory() {
        return playCategory;
    }
    public void setPlayCategory(STCard.enumPlayingCategory playCategory) {
        this.playCategory = playCategory;
    }

    public void DealCardsToEachPlayer(int numberOfCards){
        int p = GetNextPlayerID(getDealerID());
        for(int j = 0; j < numPlayers; j++)
        {
            List<STCard> c = new ArrayList<STCard>();  // arList<STCard>();
            for (int i = 0; i < numberOfCards; i++)
            {
                c.add(this.deck.getCards().get(i));
                this.deck.getCards().remove(i);     // .RemoveAt(i);
            }
            this.players.get(p).setCardsInHand(c);      // .CardsInHand = c;
            p = GetNextPlayerID(p);
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

    public STCard playCard(int nextPlayerID) {
        HashMap<String, List<String>> cp = new HashMap<>();
        STCard playCard = new STCard();
        int selectedCardID = 0;  //, j;

        if (getLastPlayedCard() == null ) {
            //j=0;
            for (STCard card : this.getPlayers().get(nextPlayerID).getCardsInHand()) {
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
                    this.setPlayCategory(STCard.enumPlayingCategory.values()[rnd]);
                    //System.out.println(cp.containsKey(st));
                    //System.out.println("---------------------------");
                    playCard = card;
                    break;
                }
                selectedCardID++;
            }
        } else {
            //Compare played card with cards in hand
            //Get the List of all possibles cards
            //if(Possible List == 0){
            // get a card from the Deck
            // Last played card doesnt change
            // return
            //}

            if(nextPlayerID == 0 ) {
                //Manually Select a Card from the List
                //playCard = selected card;
            } else {
                //Select Random card from the possible list
                //playCard = selected card;
            }
        }
        this.getPlayers().get(nextPlayerID).getCardsInHand().remove(selectedCardID);
        setLastPlayedCard(playCard);

        nextPlayerID = GetNextPlayerID(nextPlayerID);

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

    public String comapareCategory() {
        return null;
    }



}
