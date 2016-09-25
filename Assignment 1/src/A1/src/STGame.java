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
    }

    public int selectDealer() {
        Random rand = new Random();//randomly selecting a dealer
        return rand.nextInt((5 - 3)+1)+3;
    }

    public void dealRandomCardsToEachPlayer() {
        STPlayer[] players = new STPlayer[numPlayers];
        for (STPlayer player : players) {
            ArrayList<STCard> card = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards();
        }
    }
}
