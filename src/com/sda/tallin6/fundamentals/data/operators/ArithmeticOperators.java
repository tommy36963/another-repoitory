package com.sda.tallin6.fundamentals.data.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operators");

        int result = 0;
        double d = 4.2 + 3;

        System.out.println("result : " + result);
        System.out.println("d : " + d);

        result = result + 5;
        System.out.println("0 + 5 = 5 - result : " + result);

        result = result - 1;
        System.out.println(" 5 - 1 = 4 - result : " + result);

        result = result *2;
        System.out.println(" 4*2  = 8 - result : " + result);

        result = result /4;
        System.out.println(" 8/4  = 2 - result : " + result);

        result = result %6;
        System.out.println(" 2%6 = 2 - result : " + result);

        int unary = +1;

        System.out.println(unary);

        int y = 10;
        y=+1;

        System.out.println("y=+1 result is:" +y);
        unary = 0;

        unary--;
        System.out.println(unary);

        unary++;

        System.out.println(unary);

        boolean success = false;

        System.out.println(success);

        System.out.println(!success);
        // prefix/postfix unary increment operators
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);

        ++i;
        // prints 5
        System.out.println(i);

        // prints 6
        System.out.println(++i);

        // prints 6
        System.out.println(i++);

        // prints 7
        System.out.println(i);


    }
}
