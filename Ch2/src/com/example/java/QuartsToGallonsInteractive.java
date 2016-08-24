package com.example.java;
import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main (String[] args){
        int quarts;
        int gallons;
        int plusQuarts;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of quarts...");
        quarts = input.nextInt();
        gallons = quarts / 4;
        plusQuarts = quarts % 4;
        System.out.println("A job that needs " + quarts + " quarts requires " + gallons + " gallons plus " + plusQuarts + " quarts.");
    }
}

