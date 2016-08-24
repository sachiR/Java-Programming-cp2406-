package com.example.java;
import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final int adult = 7;
        final int child = 4;
        int adultOrder;
        int kidsOrder;
        int adultprice;
        int kidsprice;
        int total;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of adult meals ...");
        adultOrder = input.nextInt();
        adultprice = (adultOrder * adult );
        System.out.println("Enter the num of kids meals ...");
        kidsOrder = input.nextInt();
        kidsprice = (kidsOrder * child);
        total = kidsprice + adultprice;
        System.out.println(adultOrder+ " adult meals are $"+adultprice+" and "+kidsOrder+" kids meals are $"
                + kidsprice+". Total is $"+total);

    }
}
