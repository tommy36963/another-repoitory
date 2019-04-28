package com.sda.tallin6.fundamentals.data.loops;

public class forLoop {
    public static void main(String[] args) {


        for (int i = 1; i < 11; i++) {
            System.out.println("count is: " + i);
        }
            for (int i = 10; i > 0; i--) {
                System.out.println("Count is: " + i);
            }

            int ctr = 12;
            for (int j = 10, k = 4; j < k && ctr > 10; ++j, k = k - 1, ctr--) {
                System.out.println("j:" + j + "k:" + k + "ctr:" + ctr);
            }

            int num = 10;
            for (int i = 0; i < num; i++) {
                if (i > 5)
                    continue;
                System.out.println("i:" + i);
            }
            // break
            for (int i = 0; i < 10; i++) {
                if (i ==4) {
                    break;  // exit the loop
                }
                System.out.println(i);
            }
            // Nested for lopp

        for (int outer = 0; outer < 10; outer++) {
            for (int inner = 0; inner < 10; inner++) {
                System.out.println(" inner : " + inner + " outer : " + outer);

            }
            }
        }
    }

