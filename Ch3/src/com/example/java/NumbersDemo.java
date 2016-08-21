package com.example.java;

public class NumbersDemo {

    public static void main(String[] args){
        int NumberOne = 30;
        int NumberTwo = 20;
        displayTwiceTheNumber(NumberOne, NumberTwo);
        displayNumberPlusFive(NumberOne, NumberTwo);
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

