package com.company;


import java.util.ArrayList;

public class CarDataPrintingToUser {

    private static final int COLUMN_WIDTH= 15;

    public  static void dataPrinting(ArrayList<Car> carInfo){

        printTableCell("Car Name");
        printTableCell("Car Price");
        printTableCell("Car Color");
        printTableCell("Car ID");

        for(int i=0;i<carInfo.size();i++) {

            System.out.println("\n");

            printTableCell(carInfo.get(i).name);
            printTableCell(String.valueOf(carInfo.get(i).price));
            printTableCell(carInfo.get(i).color);
            printTableCell(String.valueOf(carInfo.get(i).id));
        }
    }

    static void printTableCell(String cellValue){

        if (cellValue.length()<COLUMN_WIDTH){
            System.out.print(cellValue);
            for (int s= cellValue.length(); s<=COLUMN_WIDTH; s++){
                System.out.print(" ");
            }
        }
    }

}
