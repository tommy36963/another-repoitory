package com.sda.tallin6.fundamentals.data.flow;

public class SwitchStatementBasic {

    public static void main(String[] args) {

        int score = 70;

        switch (score){

            case 100:
                System.out.println("This is very good");
                break;
            case 90:
                System.out.println("This is good");
                break;
            case 80:
                System.out.println("This is ok");
                break;
            case 70:
                System.out.println("This is not good");
                break;
            default:
                System.out.println("The number is not defined");


        }
    }
}
