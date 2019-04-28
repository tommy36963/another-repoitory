package com.sda.tallin6.fundamentals.data.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        int[] myarray2 = {7, 9, 55, 87, 12, 77};
                        //0, 1, 2,  3,  4,  5
        int tom = 0;
        while (tom < 5) {
            System.out.println(myarray2[tom]);
            tom++; // a loop so starts at 0(7) and goes up to less than 5 which is 12
        }
    }
}