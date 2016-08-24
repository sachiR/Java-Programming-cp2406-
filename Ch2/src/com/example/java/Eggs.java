package com.example.java;
import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final double dozen = 3.25;
        final double anEgg = 0.45;
        int numEgg;
        int numDozen;
        int numAnEgg;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of Eggs...");
        numEgg = input.nextInt();
        numDozen = numEgg / 12;
        numAnEgg = numEgg % 12;
        total = (numDozen * dozen) + (numAnEgg * anEgg);
        System.out.println("You ordered "+numEgg+" eggs. That's "+numDozen+" dozen at $"+dozen+" per dozen and "
        +numAnEgg +" loose eggs at $"+anEgg+" cents each for a total of $"+total);
    }
}

