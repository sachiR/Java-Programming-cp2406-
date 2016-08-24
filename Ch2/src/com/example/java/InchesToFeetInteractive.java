package com.example.java;

import java.util.Scanner;
public class InchesToFeetInteractive {
    public static void main(String[] args) {
            final int InchesToFoot = 12;
            Scanner input = new Scanner(System.in);
            int inches;
            int foot;
            int plusInches;
            System.out.println("Enter the value of inches...");
            inches = input.nextInt();
            foot = inches / InchesToFoot;
            plusInches = inches % InchesToFoot;
            System.out.println(inches+ " is "+foot+" foot and "+ plusInches + " inches");
        }
    }

