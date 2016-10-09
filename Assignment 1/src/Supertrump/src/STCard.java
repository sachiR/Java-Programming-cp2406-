import java.util.*;


public class STCard {

    public enum enumPlayingCategory{
        hardness,
        specific_gravity,
        cleavage,
        Crustal_Abundance,
        Economic_Value
    }

    private int _cardID;
    private String _cardType;
    private String _cardTitle;
    private HashMap<String,List<String>> _cardProperties;

    private HashMap<Integer, String> _cleavage =  new HashMap<Integer, String>();
    private HashMap<Integer, String> _crustal_Abundance = new HashMap<Integer, String>();
    private HashMap<Integer, String> _economic_Value = new HashMap<Integer, String>();

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


    public String getPlayCategoryValue(String propType){
        String retval = null;
        String strval = null;
        double temp = -1;
        switch (propType){
            case "hardness" :
                try {
                    retval = this.getCardProperties().get("hardness").get(0);

                }
                catch (Exception ex){

                }
                break;
            case "specific_gravity" :
                try {
                    retval = this.getCardProperties().get("specific_gravity").get(0);

                    for (String t: retval.split("-")) {
                        if(Double.parseDouble(t) > temp){temp = Double.parseDouble(t);}
                        System.out.println(t);
                    }
                }
                catch (Exception ex){

                }
                retval = String.valueOf(temp);
                break;
            case "cleavage" :
                try {
                    strval = this.getCardProperties().get("cleavage").get(0).toString();  // getCardProperties().get("cleavage");
                    for (int key: _cleavage.keySet()) {
                        if(_cleavage.get(key).equalsIgnoreCase(strval)){
                            retval = String.valueOf(key);
                            break;
                        }
                    }
                }
                catch (Exception ex){

                }
                break;
            case "Crustal_Abundance" :
                try {
                    strval = this.getCardProperties().get("Crustal_Abundance").get(0).toString();
                    for (int key: _crustal_Abundance.keySet()) {
                        if(_crustal_Abundance.get(key).equalsIgnoreCase(strval)){
                            retval = String.valueOf(key);
                            break;
                        }
                    }
                }
                catch (Exception ex){

                }
                break;
            case "Economic_Value" :
                try {
                    strval = this.getCardProperties().get("Economic_Value").get(0).toString();
                    for (int key: _economic_Value.keySet()) {
                        if(_economic_Value.get(key).equalsIgnoreCase(strval)){
                            retval = String.valueOf(key);
                            break;
                        }
                    }
                }
                catch (Exception ex){

                }
                break;

        }

        return retval;
    }


    public String getHardness(){
        return this.getCardProperties().get("hardness").get(0);
    }

    public String getSpecificGravity(){
        return this.getCardProperties().get("specific_gravity").get(0);
    }

    public int getCleavage(){
        int retval = -1;
        String strval = this.getCardProperties().get("cleavage").get(0).toString();  // getCardProperties().get("cleavage");

        for (int key: _cleavage.keySet()) {
            if(_cleavage.get(key).equalsIgnoreCase(strval)){
                retval = key;
                break;
            }
        }
        return retval;
    }
    public int getCrustalAbundance(){
        int retval = -1;
        String strval = this.getCardProperties().get("Crustal_Abundance").get(0).toString();
        for (int key: _crustal_Abundance.keySet()) {
            if(_crustal_Abundance.get(key).equalsIgnoreCase(strval)){
                retval = key;
                break;
            }
        }
        return retval;
    }
    public int getEconomicValue(){
        int retval = -1;
        String strval = this.getCardProperties().get("Economic_Value").get(0).toString();
        for (int key: _economic_Value.keySet()) {
            if(_economic_Value.get(key).equalsIgnoreCase(strval)){
                retval = key;
                break;
            }
        }
        return retval;
    }

    public HashMap<String, List<String>> getCardProperties(){
        return this._cardProperties;
    }
    public void setCardProperties(HashMap<String,List<String>> cardProperty){
        this._cardProperties = cardProperty;
    }

    public STCard(){
        _cleavage.put(0,"none");
        _cleavage.put(1,"poor/none");
        _cleavage.put(2,"1 poor");
        _cleavage.put(3,"2 poor");
        _cleavage.put(4,"1 good");
        _cleavage.put(5,"1 good, 1 poor");
        _cleavage.put(6,"2 good");
        _cleavage.put(7,"3 good");
        _cleavage.put(8,"1 perfect");
        _cleavage.put(9,"1 perfect, 1 good");
        _cleavage.put(10,"1 perfect, 2 good");
        _cleavage.put(11,"2 perfect, 1 good");
        _cleavage.put(12,"3 perfect");
        _cleavage.put(13,"4 perfect");
        _cleavage.put(14,"6 perfect");

        _crustal_Abundance.put(0,"ultratrace");
        _crustal_Abundance.put(1,"trace");
        _crustal_Abundance.put(2,"low");
        _crustal_Abundance.put(3,"moderate");
        _crustal_Abundance.put(4,"high");
        _crustal_Abundance.put(5,"very high");

        _economic_Value.put(0,"trivial");
        _economic_Value.put(1,"low");
        _economic_Value.put(2,"moderate");
        _economic_Value.put(3,"high");
        _economic_Value.put(4,"very high");
        _economic_Value.put(5,"i'm rich");
    }
    public STCard(int cardID, String cardType, String cardTitle){
        this();
        this._cardID = cardID;
        this._cardType = cardType;
        this._cardTitle = cardTitle;
    }
}