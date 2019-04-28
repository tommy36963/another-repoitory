package com.sda.tallin6.fundamentals.data.classes.statics;

import javax.jws.soap.SOAPBinding;

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle( 50, 1, 20);
        System.out.println(Bicycle.count);
        System.out.println(bike.instanceCount);

        Bicycle anotherBike = new Bicycle( 20, 3, 10);
        System.out.println(Bicycle.count);
        System.out.println(anotherBike.instanceCount);

        System.out.println(Bicycle.TEMPERATURE_BOILING_WATER);
        System.out.println(Bicycle.PI);

    }
}
