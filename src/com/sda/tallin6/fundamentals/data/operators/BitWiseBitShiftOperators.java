package com.sda.tallin6.fundamentals.data.operators;

public class BitWiseBitShiftOperators {
    public static void main(String[] args) {
        //BITWISE OPERATIONS
        System.out.println("Bitwise Operators");
        // &, |,

        // a=60 b = 13
        // bbinary representations
        // a = 0011 1100 b = 0000 1101
        int a = 0b0111100;
        System.out.println(a);
        int b= 0b0001101;
        System.out.println(b);

        System.out.println("a&b :" + (a+b));

        System.out.println("a | b:" + (a | b));

        System.out.println("a ^ b :" + (a ^ b));

        System.out.println("~a :" + ~a);

        // << (left shift)
        // Binary left shit
        System.out.println("a << 2 : " + (a << 2));

        // >> (right shift)
        // Binary right shit
        System.out.println("a >>>2 : " + (a>>>2));

    }
}
