package com.sda.tallin6.fundamentals.data.operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // RELATIONAL OPERATORS
        System.out.println("Relational Operators");
        // <, <=, >, >=, ==, !=
        int value1 = 1;
        int value2 = 2;
                if(value1 == value2) {
        System.out.println("value1 == value2");
    }

            boolean test1 = value1 == value2;
            System.out.println("value1 is equal to value2" + test1);

            if(value1 != value2){
            System.out.println("value1 != value2");
        }
            boolean test2 = value1 != value2;
        System.out.println("Value1 is not equal to value2: " +test2);

            if(value1 > value2){
                System.out.println("value1 > value2");
            }
        boolean test3 = value1 > value2;
        System.out.println("Value1 is bigger than value2: " +test3);
        }
}
