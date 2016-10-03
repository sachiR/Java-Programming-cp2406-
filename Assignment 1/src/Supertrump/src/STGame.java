import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class STGame {
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
        nextPlayerID = this.dealerID;
        System.out.println("\nRandom dealer is "+nextPlayerID);
        changeToPlayerID(dealerID);
        System.out.println("--------------------------------");
    }

    private void changeToPlayerID(int dealerID) {
        dealerID++;
        if(dealerID >= numPlayers){
            dealerID = 0;
        }
        System.out.println("Next player is "+ dealerID);
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

    private int GetNextPlayerID(int p) {
        p++;
        if(p >= numPlayers) {
            p = 0;
        }
        return p;
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

    public static STCard PlayCard() {
        //STCard c = new STCard();
        //int cardToPlay = new Random.next(this.players[next]);
        return null;
    }

    public int drawCardFromDeck() {
        int rnd = new Random().nextInt(this.deck.getCards().size());
        return rnd;
    }
}
