import java.util.Dictionary;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Sachi on 2/10/2016.
 */
public class STCard {
    private int cardID;
    private String cardTitle;
    private String cardType;
    private int hardness;
    private double specificGravity;
    private String cleavage;
    private String crustalAbundance;
    private String economicValue;


    public STCard(int cardID, String cardTitle, String cardType, int hardness, double specificGravity, String cleavage, String crustalAbundance, String economicValue) {
        this.cardID = cardID;
        this.cardTitle = cardTitle;
        this.cardType = cardType;
        this.hardness = hardness;
        this.specificGravity = specificGravity;
        this.cleavage = cleavage;
        this.crustalAbundance = crustalAbundance;
        this.economicValue = economicValue;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCrustalAbundance() {
        return crustalAbundance;
    }

    public void setCrustalAbundance(String crustalAbundance) {
        this.crustalAbundance = crustalAbundance;
    }

    public String getEconomicValue() {
        return economicValue;
    }

    public void setEconomicValue(String economicValue) {
        this.economicValue = economicValue;
    }

    public String getCleavage() {
        return cleavage;
    }

    public void setCleavage(String cleavage) {
        this.cleavage = cleavage;
    }

    public String toString(){
        return "id = "+ cardID;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }

    public double getSpecificGravity() {
        return specificGravity;
    }

    public void setSpecificGravity(double specificGravity) {
        this.specificGravity = specificGravity;
    }
}