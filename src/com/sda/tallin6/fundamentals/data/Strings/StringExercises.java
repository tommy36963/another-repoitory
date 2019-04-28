package com.sda.tallin6.fundamentals.data.Strings;

import java.util.Arrays;

public class StringExercises {

    public static void main(String[] args) {
        System.out.println("redivider is a Pallindrome word :" + isPallindrome("redivider"));

    }

    // String-Based Algorithms

    // find two strings that are anagram

    private static boolean isAnagram(String first, String second) {
        String sortedFirst = sort(first);
        String sortedSecond = sort(second);
        return sortedFirst.equals(sortedSecond);
    }

    private static String prepare(String text) {
        return text.toLowerCase()
                .trim()
                .replaceAll("\\s+", "");

    }

    private static String sort(String text) {
        char[] chars = prepare(text).toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }

    //how to reverse a string
    private static String reverseText (String input){
        return new StringBuilder(input).reverse().toString();
    }

    // check a string is a palindrome - redivider, deified, civic, madam

    public static boolean isPallindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return (reverse.toString()).equals(clean);
    }
}
