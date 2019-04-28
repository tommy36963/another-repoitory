package com.sda.tallin6.fundamentals.data.Arrays;

public class ArrayHomework {

    public static void main(String[] args) {

        int[] firstArray = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int[] secondArray = {0, 11, 13, 6};

        for (int i = 0; i < firstArray.length; i++) {

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i] == secondArray[j]) {

                    System.out.println(firstArray[i]);
                }

            }
        }



    }
}
