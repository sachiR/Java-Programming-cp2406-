import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


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
        //deck = new STDeck();
    }

    private void SelectDealer() {
        Random rnd = new Random();
        this.dealerID = rnd.nextInt(numPlayers);
        nextPlayerID = this.dealerID;
        changeToNextPlayerID();
        System.out.println("\nRandom dealer is "+nextPlayerID);
        System.out.println("--------------------------------");
    }

    private void changeToNextPlayerID() {
        nextPlayerID++;
        if(nextPlayerID >= numPlayers){
            nextPlayerID = 0;
        }
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

    public void printCardsInHand(int playerid){
        //for (STCard card : this.players.get(playerid).CardsInHand)

        for(int i = 0; i<this.players.get(playerid).CardsInHand.size(); i++ )
        {
            System.out.println(" Card ID \t :" + this.players.get(playerid).getCardsInHand().get(i).getCardID());
            System.out.println(" Card Title \t :" + this.players.get(playerid).getCardsInHand().get(i).getCardTitle());
            System.out.println(" Card Type \t :" + this.players.get(playerid).getCardsInHand().get(i).getCardType());
        }

    }
    public void setLastPlayedCard(STCard lastPlayedCard) {
        this.lastPlayedCard = lastPlayedCard;
    }
}