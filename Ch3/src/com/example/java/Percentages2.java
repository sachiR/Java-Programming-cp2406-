package com.example.java;
import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args){
        double NumberOne = getNumberOne();
        double NumberTwo = getNumberTwo();
        computePercentage(NumberOne, NumberTwo);
        computePercentage(NumberTwo, NumberOne);
    }
    public static double getNumberOne(){
        double NumberOne;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number" );
        NumberOne = input.nextDouble();
        return NumberOne;
    }
    public static double getNumberTwo() {
        double NumberTwo;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        NumberTwo = input.nextDouble();
        return NumberTwo;
    }
    public static void computePercentage(double x, double y){

        System.out.println(x + " is " + (x/y)*100 + " percentage of " + y);
    }
}