package com.sda.tallin6.fundamentals.data.classes;

import com.sda.tallin6.fundamentals.data.operators.ArithmeticOperators;

public class Bicycle2 {

    /**
     * What is an access modifier?
     * What is a constructor
     */
    private final String colour = "Red";
    private int cadence;
    private int gear;
    private int speed;
    private final String name;
    private boolean isBicycle;

    ArithmeticOperators operators;

    public Bicycle2(int cadence, int gear, int speed, String name) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
        this.name = name;
    }

    // private final String name; // final keyword

    public Bicycle2(String name) {
        this.name = name;
    }



    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear
                + " isBicycle:" + isBicycle);
    }
}

