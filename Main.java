package com.sandro;

public class Main {

    public static void main(String[] args) {

        //call the gasCalculator() method to calculate total amount gas in tank
        //Gas is measured in whole gallons.

        gasCalc car1 = new gasCalc(15, 0, 0, true, false); // returns: You have 15 gallons left in the tank
        System.out.println("You have " + car1.gasCalculator() + " gallons left in the tank");

        gasCalc car2 = new gasCalc(12, 0, 0, false, true); // returns: You have 12 gallons left in the tank
        System.out.println("You have " + car2.gasCalculator() + " gallons left in the tank");

        gasCalc car3 = new gasCalc(12, 0, 0, false, false); // returns: You need to either have a car or a truck

        gasCalc car4 = new gasCalc(12, 0, 0, true, true); //returns: You cannot have both a truck and a car

        gasCalc car5 = new gasCalc(12, 10, 5, false, true); //returns: You have 7 gallons left in the tank (12-10)+5 = 7
        System.out.println("You have " + car5.gasCalculator() + " gallons left in the tank");

        gasCalc car6 = new gasCalc(8,5,10,true,false); //You have 13 gallons left in the tank
        System.out.println("You have " + car6.gasCalculator()+" gallons left in the tank");

        gasCalc car7 = new gasCalc(8,5,10,false,true); //You cannot add 10 gallons of gas as it exceeds car gallon capacity of 12
        System.out.println("You still have " +car7.gasCalculator()+" gallons left in the tank"); //You still have 3 gallons left in the tank


    }
}
