package com.sda.tallin6.fundamentals.data.loops;

public class WhileLoopBasic {

    public static void main(String[] args) {

        int z = 20;

        while (z >= 1)  // while loop first evaluates the condition then if condition is true then it executes your statement
        {
            System.out.println(z);
            z--; // minus one each time from 20 to 1 as z is 20 and equal to or greater than 1
        }
        System.out.println("--------------------------");
        int x = 0;

        do {  // executes statement first then evaluates your condition if true or false
            System.out.println(x);
            x++;

        } while (x <= 19);
    }
}
