package com.sda.tallin6.fundamentals.data.Casting;

public class PrimitiveCasting {

    public static void main(String[] args) {

        int myInt = 127;
        long myLong = 50;
        float myFLoat = myLong;
        double myDouble = myLong;

        float biggestFloat = Float.MAX_VALUE;
        double floatToDOuble = biggestFloat;
        System.out.println("int to long : " + myLong);
        System.out.println("long to float : " + myFLoat);
        System.out.println("float to double : " + myDouble);

        System.out.println("biggest float :" + biggestFloat);
        System.out.println("biggest float to double: " + floatToDOuble);

    }
}
