package com.sda.tallin6.fundamentals.data.DateTime;

public class Varargs {

    /**
     * Varargs allows the method to accept zero or multiple arguements
     * There can be only one variable arguement in a method
     * We use three dots (...) in the method signature to make it accept variable arguements
     * varargs parameter behaves like an array of the specified type
     */

    public static void main(String[] args) {
        printWhatYouGot(args);
        System.out.println(sum(1));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(2, 5, 0, 4, 1));

        int[] arr = new int[]{1,3,4,2};
        System.out.println(sum(arr));



    }

        private static int sum(int...elements) {
            int result = 0;
                    for (int i : elements) {
                        result +=i;
                    }
                    return result;
        }

        private static void printWhatYouGot(String... input){
            for (String elem:input) {
                System.out.println(elem);
            }
        }
    }

