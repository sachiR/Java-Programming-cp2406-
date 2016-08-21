package com.example.java;
import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String[] args){
        int NumberOne = getNumberOne();
        int NumberTwo = getNumberTwo();
        displayTwiceTheNumber(NumberOne, NumberTwo);
        displayNumberPlusFive(NumberOne, NumberTwo);
    }

    public static int getNumberOne(){
       int NumberOne;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number" );
       NumberOne = input.nextInt();
       return NumberOne;
    }
    public static int getNumberTwo(){
        int NumberTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number" );
        NumberTwo = input.nextInt();
        return NumberTwo;
    }
    public static void displayTwiceTheNumber(int NumberOne, int NumberTwo){
        System.out.println(NumberOne + " * 2 = " + (NumberOne * 2));
        System.out.println(NumberTwo + " * 2 = " + (NumberTwo * 2));
    }

    public static void displayNumberPlusFive(int NumberOne, int NumberTwo){
        System.out.println(NumberOne + " + 5 = " + (NumberOne + 5));
        System.out.println(NumberTwo + " + 5 = " + (NumberTwo * 5));
    }
}
