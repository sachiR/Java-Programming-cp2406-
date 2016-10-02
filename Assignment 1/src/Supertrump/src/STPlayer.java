import java.util.List;

/**
 * Created by Sachi on 2/10/2016.
 */
public class STPlayer {
    private List<STCard> cardsInHand;
    private int playerID;
    private String playerName;

    public STPlayer(int playerID) {
        this.playerID = playerID;
    }

    public List<STCard> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(List<STCard> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

}
