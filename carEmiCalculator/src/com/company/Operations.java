package com.company;

import java.lang.Math;

public class Operations {
    private int downpayment;
    private String whichCar;
    static private final float rate = 8/(100*12f);

    Operations(int downpayment){
        this.downpayment = downpayment;
    }

    public static int loanAmount(int downpayment, int selectCarPrice){
        return  selectCarPrice - downpayment;
    }

    public static double calculateInterestPerMonth(int actualLoanTaken, int tenure){
        double powerPart = Math.pow((1+ rate), tenure);
        return Math.round((actualLoanTaken * rate * powerPart)/(powerPart-1)*100)/100.0;
    }

    public static double calculateTotalInterestOnPrincipal(double interestPerMonth, int actualLoanTaken, int year){
        double interestCalculatedPerYear = interestPerMonth * year;
        return Math.round((interestCalculatedPerYear - actualLoanTaken)*100) /100.0;
    }

}
