package com.sandro;

public class gasCalc {

    private int gasInitialAmount;
    private int gasUsed;
    private int addGas;
    private boolean truck;
    private boolean car;


    public gasCalc(int gasInitialAmount, int gasUsed, int addGas, boolean truck, boolean car) {
        if (truck) {
            if (gasInitialAmount > -1 && gasInitialAmount <= 15) {
                this.gasInitialAmount = gasInitialAmount;
            } else {
                this.gasInitialAmount = 0;
                System.out.println("Trucks can only hold 0 to 15 gallons of gas");
            }
        }

        if (car) {
            if (gasInitialAmount > -1 && gasInitialAmount <= 12) {
                this.gasInitialAmount = gasInitialAmount;
            } else {
                this.gasInitialAmount = 0;
                System.out.println("Cars can only hold 0 to 12 gallons of gas");

            }
        }

        if (truck == true && car == true) {
            this.gasInitialAmount = 0;
            System.out.println("You cannot have both a truck and a car");
        }

        if (truck == false && car == false) {
            this.gasInitialAmount = 0;
            System.out.println("You need to either have a car or a truck");
        }


        this.gasUsed = gasUsed;
        this.addGas = addGas;
        this.truck = truck;
        this.car = car;

    }

    public int getGasInitialAmount() {
        return gasInitialAmount;
    }

    public int getGasUsed() {
        return gasUsed;
    }

    public int getAddGas() {
        return addGas;
    }

    public boolean isTruck() {
        return truck;
    }

    public boolean isCar() {
        return car;
    }

    public int gasCalculator() {
        if (car) {
            if (this.gasInitialAmount + this.addGas - this.gasUsed > 12) {
                System.out.println("You cannot add " + this.addGas + " gallons of gas as it exceeds car gallon capacity of 12");
                this.addGas = 0;

            }
        }

        if (truck) {
            if (this.gasInitialAmount + this.addGas - this.gasUsed > 15) {
                System.out.println("You cannot add " + this.addGas + " gallons of gas as it exceeds truck gallon capacity of 15");
                this.addGas = 0;
            }
        }


        if (car == true && truck == true) {
            this.addGas = 0;
        }

        if (car == false && truck == false) {
            this.addGas = 0;
        }
        int gasTotal = this.gasInitialAmount + this.addGas - this.gasUsed;
        return gasTotal;

    }

}
