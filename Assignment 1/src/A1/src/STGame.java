import java.util.ArrayList;
import java.util.Random;

public class STGame {

    private static final int NUM_CARDS_TO_DEAL = 8;
    private int randomDealer;
    private int numPlayers;
    private STPlayer[] players;
    private STDeck deck;
    int yourPlayerId;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers ;
        deck = new STDeck();
    }

    public int selectDealer() {
        Random rand = new Random();//randomly selecting a dealer
        randomDealer = rand.nextInt((5 - 3)+1)+3;
        System.out.println("random dealer = " + randomDealer);
        return randomDealer;
    }

    public void dealRandomCardsToEachPlayer() {
        players = new STPlayer[numPlayers];
        for(int i = 0; i < numPlayers; i++){
            players[i] = new STPlayer("player=" +i);
        }
        for (STPlayer player : players) {
            ArrayList<STCard> cards = deck.dealCards(NUM_CARDS_TO_DEAL);
            player.setCards(cards);
        }
    }

    public void selectYouAsPlayer() {
        yourPlayerId = 0 ;
    }

    public STPlayer getHumPlayer() {
        return players[yourPlayerId];
    }

    public void playTheGame() {
        boolean gameIsOn = true;
        while (gameIsOn){
            //for (int i = 0; i < players.length; i++) {
            //}
            //showTurnPlayer();

        }
    }

    private void showTurnPlayer() {
    }
}