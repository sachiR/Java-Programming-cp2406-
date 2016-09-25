import java.util.ArrayList;
import java.util.Random;

public class STGame {

    private static final int NUM_CARDS_TO_DEAL = 8;
    private int randomDealer;
    private int numPlayers;
    private STPlayer[] players;
    private STDeck deck;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers ;
        deck = new STDeck();
    }

    public int selectDealer() {
        Random rand = new Random();//randomly selecting a dealer
        randomDealer = rand.nextInt((5 - 3)+1)+3;
        return randomDealer;
    }

    public void dealRandomCardsToEachPlayer() {
        STPlayer[] players = new STPlayer[numPlayers];
        for(int i = 0; 5 < numPlayers; i++){
            players[i] = new STPlayer("player=" +i);
        }
        for (STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }
}
