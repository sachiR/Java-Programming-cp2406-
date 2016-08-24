package com.example.java;

public class InchesToFeet {
    public static void main(String[] args) {
        final int InchesToFoot = 12;
        int inches = 86;
        int foot;
        int plusInches;
        foot = inches / InchesToFoot;
        plusInches = inches % InchesToFoot;
        System.out.println(inches+ " is "+foot+" foot and "+ plusInches + " inches");
    }
}
