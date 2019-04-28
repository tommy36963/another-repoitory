package com.sda.tallin6.fundamentals.data.classes;

public class BicycleDemo2 {
    public static void main(String[] args) {
        // create two different objects
        // com.sda.tallin6.fundamentals.data.classes.Bicycle objects



        Bicycle2 myBike = new Bicycle2(10, 0, 1,"Storm");
                //new bicycle2(10,0,1);

        Bicycle2 yourBike = new Bicycle2("Hello");

        yourBike.printStates();
    }

}

