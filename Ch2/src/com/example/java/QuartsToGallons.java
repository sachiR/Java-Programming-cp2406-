package com.example.java;
public class QuartsToGallons {
    public static void main (String[] args){
        int quarts = 18;
        int gallon;
        int plusQuarts;
        gallon = quarts / 4;
        plusQuarts = quarts % 4;
        System.out.println("A job that needs " + quarts + " quarts requires " + gallon + " gallons plus " + plusQuarts + " quarts.");
    }
}
