import java.util.HashMap;
import java.util.List;

public class STCard {
    private int _cardID;
    private String _cardType;
    private String _cardTitle;
    private HashMap<String,List<String>> _cardProperties;

    public int getCardID(){
        return this._cardID;
    }
    public String getCardType(){
        return this._cardType;
    }
    public String getCardTitle(){
        return this._cardTitle;
    }
    public void setCardTitle(String value){this._cardTitle = value;}
    public HashMap<String, List<String>> getCardProperties(){
        return this._cardProperties;
    }
    public void setCardProperties(HashMap<String,List<String>> cardProperty){
        this._cardProperties = cardProperty;
    }

    public STCard(int cardID, String cardType, String cardTitle){
        this._cardID = cardID;
        this._cardType = cardType;
        this._cardTitle = cardTitle;
    }


}