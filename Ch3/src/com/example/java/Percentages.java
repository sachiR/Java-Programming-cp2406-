package com.example.java;

public class Percentages {

    public static void main(String[] args){
        double NumberOne = 2.0, NumberTwo = 5.0;
        computePercentage(NumberOne, NumberTwo);
        computePercentage(NumberTwo, NumberOne);
    }

    public static void computePercentage(double x, double y){

        System.out.println(x + " is " + (x/y)*100 + " percentage of " + y);
    }
}

