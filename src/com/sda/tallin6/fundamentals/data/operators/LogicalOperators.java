package com.sda.tallin6.fundamentals.data.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        // LOGICAL OPERATORS
        System.out.println("Logical Operators");
        // &, |, !, &&, ||
        int value1 = 1;
        int value2 = 2;
        if ((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        boolean test6 = (value1 == 1) && (value2 == 2);
        System.out.println("value 1 is 1 AND value2 is 2 :" + test6);

        if ((value1 == 1) || (value2 == 1)) {
            System.out.println();


            boolean test7 = (value1 == 1) || (value2 == 1);
            System.out.println("value1 is 1 or value2 is 1 : " + test7);
            // whats happening exactly ?
            // The && and || operators "short-circuit", meaing they dont evaluate
            // if it isnt necessary

            // & and | operators always evaluate both sides.
            boolean conditionalOr1 = (value1 ==1) | (value2+1 ==3);
            System.out.println("value1 is 1 or value2 plus 1 is 3 :" + conditionalOr1 );
        }
    }
}
