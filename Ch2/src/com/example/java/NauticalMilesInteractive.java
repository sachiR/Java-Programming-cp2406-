package com.example.java;
import java.util.Scanner;

public class NauticalMilesInteractive {
    public  static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double nuticalMile;
        double numKilometers;
        System.out.println("Enter nautical mile vaue...");
        nuticalMile = input.nextInt();
        numKilometers = nuticalMile / 1.852;
        System.out.println(nuticalMile+" nutical miles have "+numKilometers+" kilometers.");
        double numMiles;
        numMiles = nuticalMile / 1.150779;
        System.out.println(nuticalMile+" nutical miles have "+numMiles+" miles.");
    }
}

