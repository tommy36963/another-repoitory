package com.sda.tallin6.fundamentals.data.task1;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        System.out.println("Welcome stranger please enter your full name");
        Scanner input = new Scanner(System.in);


        String user;
        user = input.nextLine();


        if(user.equals("James Bond")) {
            System.out.println("Welcome 007");
        } else {
            System.out.println("Please keep out");
        }


    }
}
