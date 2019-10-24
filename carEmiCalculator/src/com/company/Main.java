    package com.company;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Car> carInfo = new ArrayList<Car>();
        Scanner scanner = new Scanner(System.in);
        int downpayment;
        int tenure1 = 12;
        int tenure2 = 24;
        int tenure3 = 60;

        int userEnteredCarId;

        Car car1 = new Car("scorpio", 1000000, "red", 5489);
        Car car2 = new Car("baleno", 1500000, "red", 5279);
        Car car3 = new Car("baleno", 1600000, "red", 3539);
        Car car4 = new Car("swift", 2000000, "red", 2165);

        carInfo.add(car1);
        carInfo.add(car2);
        carInfo.add(car3);
        carInfo.add(car4);

        CarDataPrintingToUser.dataPrinting(carInfo);

        System.out.println("\n \n Please Enter The Car ID: ");
        userEnteredCarId = scanner.nextInt();

        for(int i=0; i<carInfo.size(); i++){

            if(userEnteredCarId == carInfo.get(i).id){

                int valueOfI = i;
                int selectCarPrice =  carInfo.get(valueOfI).price;
                System.out.println("Enter Your Downpayment: ");
                downpayment = scanner.nextInt();
                Operations operation = new Operations(downpayment);

                int actualLoanTaken = operation.loanAmount(downpayment, selectCarPrice);

                double interestPerMonthFor1Year = operation.calculateInterestPerMonth(actualLoanTaken, tenure1);
                double interestPerMonthFor2Year = operation.calculateInterestPerMonth(actualLoanTaken, tenure2);
                double interestPerMonthFor5Year = operation.calculateInterestPerMonth(actualLoanTaken, tenure3);

                double interestAmountFor1Year = operation.calculateTotalInterestOnPrincipal(interestPerMonthFor1Year, actualLoanTaken, tenure1);
                double interestAmountFor2Year = operation.calculateTotalInterestOnPrincipal(interestPerMonthFor2Year, actualLoanTaken, tenure2);
                double interestAmountFor5Year = operation.calculateTotalInterestOnPrincipal(interestPerMonthFor5Year, actualLoanTaken, tenure3);

                System.out.println("Options -->            " + "Option1      " + "Option2     " + "Option3     ");
                System.out.println("Years -->              " + "1 Year       " + "2 Year      " + "5 Year      ");
                System.out.println("Interest Per Month --> " + interestPerMonthFor1Year + "     " + interestPerMonthFor2Year + "     " + interestPerMonthFor5Year);
                System.out.println("Total Interest  -->    " + interestAmountFor1Year + "      " + interestAmountFor2Year + "     " + interestAmountFor5Year);
            }
        }
    }
}
