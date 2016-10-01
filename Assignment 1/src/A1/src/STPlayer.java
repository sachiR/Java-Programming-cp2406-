import java.util.ArrayList;

public class STPlayer {
    private ArrayList<STCard> cards;
    private String playerId;

    public STPlayer(String playerId) {
        this.playerId = playerId;
    }

    public void setCards( ArrayList<STCard> cards) {
        this.cards = cards;
    }
    public String toString(){
        return "PlayerId = " + playerId +"\nCards:" + cards;
    }

}