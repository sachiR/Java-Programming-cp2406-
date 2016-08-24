package com.example.java;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final int adult = 7;
        final int child = 4;
        final double adultMealMake = 4.35;
        final double kidMealMake = 3.10;
        int adultOrder;
        int kidsOrder;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the num of adult meals ...");
        adultOrder = input.nextInt();
        System.out.println("Enter the num of kids meals ...");
        kidsOrder = input.nextInt();

        checkingAdultPrice(adultOrder,adult);
        checkingKidPrice(child,kidsOrder);
        int adultPrice = checkingAdultPrice(adultOrder,adult);
        int kidsPrice = checkingKidPrice(child,kidsOrder);
        checkingTotalPrice(adultPrice, kidsPrice,adultOrder,kidsOrder);
        double ProfitAdult = pricingProfitAdult(adult,adultMealMake,adultOrder);
        double ProfitKids = pricingProfitKids(child, kidMealMake, kidsOrder);
        pricingTotalProfit(ProfitAdult, ProfitKids);
    }

    public static int checkingAdultPrice(int adultOrder,int adult){
        int adultprice;
        adultprice = (adultOrder * adult );
        return adultprice;
    }
    public static int checkingKidPrice(int child, int kidsOrder){
        int kidsprice;
        kidsprice = (kidsOrder * child);
        return  kidsprice;
    }
    public static int checkingTotalPrice(int adultPrice, int kidsPrice, int adultOrder,int kidsOrder){
        int total;
        total = kidsPrice + adultPrice;
        System.out.println(adultOrder+ " adult meals are $"+adultPrice+" and "+kidsOrder+" kids meals are $"
                + kidsPrice+". Total is $"+total);
        return total;
    }
    public static double pricingProfitAdult(int adult, double adultMealMake, int adultOrder){
        double profitAdult;
        double totalProfitAdult;
        profitAdult = adult - adultMealMake;
        totalProfitAdult = profitAdult * adultOrder;
        DecimalFormat TwoRound = new DecimalFormat("##.###");
        System.out.println("Total adult meal profit is $"+TwoRound.format(totalProfitAdult));
        return totalProfitAdult;
    }
    public static double pricingProfitKids(int child, double kidMealMake, int kidsOrder){
        double profitKids;
        double totalProfitKids;
        profitKids = child - kidMealMake;
        totalProfitKids = profitKids * kidsOrder;
        DecimalFormat TwoRound = new DecimalFormat("##.###");
        System.out.println("Total adult meal profit is $"+ TwoRound.format(totalProfitKids));
        return totalProfitKids;
    }
    public static void pricingTotalProfit(double ProfitAdult, double ProfitKids){
        double totalProfit;
        totalProfit = ProfitAdult + ProfitKids;
        DecimalFormat TwoRound = new DecimalFormat("##.###");
        System.out.println("The grand profit is $"+TwoRound.format(totalProfit));
    }
}

