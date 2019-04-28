package com.sda.tallin6.fundamentals.data.classes;

public class InstanceOf {

    public static void main(String[] args) {
        Bicycle first = new Bicycle();
        boolean result = first instanceof Bicycle;
        Bicycle second = null;
        boolean result2 = second instanceof Bicycle;

        System.out.println("first is an instance of Bicycle" + result);
        System.out.println("second is an instance of Bicycle" + result2);

        boolean another = first instanceof Bicycle;
    }
}
