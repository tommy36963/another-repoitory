package com.sda.tallin6.fundamentals.data.operators;

public class OperatorsHomework {

    public static void main(String[] args) {
        // Try to evaluate the a value after each step then find the final result

        int a = 10;


        a = ++a + a + --a - --a + a++;

        System.out.println(a);

        int a1 = 10;
        int b1= 20;

        System.out.println(a1=b1);  // what it prints try to guess  without running the main method

        System.out.println(a1 == b1);  // what it prints try to guess  without running the main method

        int marks = 8;
        int total = 10;

        System.out.println("Short-circuit operators");

        System.out.println(total<marks && ++marks>5);
        System.out.println(marks);
        System.out.println(total == 10 || ++marks>5);
        System.out.println(marks);

        System.out.println("Long-circuit operators");

        System.out.println(total<marks & ++marks>5);
        System.out.println(marks);
        System.out.println(total == 10 | ++marks>5);
        System.out.println(marks);

    }
}
