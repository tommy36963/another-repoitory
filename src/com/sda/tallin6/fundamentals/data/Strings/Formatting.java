package com.sda.tallin6.fundamentals.data.Strings;

public class Formatting {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println();


        System.out.printf("Hello %s!%n", "World");

        System.out.format("the %s jumped over the %s, %d times", "");
    }
}
