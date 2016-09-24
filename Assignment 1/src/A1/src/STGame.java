import java.util.Random;

public class STGame {
    private int numPlayers;
    private int randomDealer;

    public STGame(int numPlayers) {
        this.numPlayers = numPlayers ;
    }

    public int selectDealer() {
        Random rand = new Random();
        int randomDealer = rand.nextInt((5 - 3)+1)+3;
        return randomDealer;
    }

    public void dealRandomCards() {
    }
}
