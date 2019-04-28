package com.sda.tallin6.fundamentals.data.operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        // CONDITIONAL OPERATOR
        // ? :
        // In other word : ternary

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        // if some condition is true then value1 else value2
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
