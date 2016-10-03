import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class STGame {
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
        SelectDealer();
        deck = new STDeck();
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

    public int getNextPlayerID() {
        return nextPlayerID;
    }

    public int getLastPlayerID() {
        return lastPlayerID;
    }

    public List<STPlayer> getPlayers() {
        return players;
    }

    public STDeck getDeck() {
        return deck;
    }

    public STCard getLastPlayedCard() {
        return lastPlayedCard;
    }


    public void dealCardsToEachPlayer() {
    }
}