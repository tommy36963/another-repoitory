package com.sda.tallin6.fundamentals.data.Regex;

import java.util.SortedMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    /**
     * A regular expression defines a search pattern for strings
     * The search pattern can be anything from a simple character,
     * a fixed string or a complex expression containing special
     * characters describing the pattern
     * The pattern defined by the regex may match one or several
     * times or not at all for a given string
     * Regular expressions can be used to search, edit and manipulate text
     *
     * x The character x
     * \\ The backslash character
     * \t The tab character
     * \n The newline (line feed) character
     * \r The carriage-return character
     * \f The form-feed character
     */

    public static void main(String[] args) {

        //. means any char -<([{\
        System.out.println("AbcDef .cD - means it can be any char before cD");
        System.out.println(isMatch(".cD", "AbcDef"));
        System.out.println(isMatch(".cD", "Ab*cDef"));
        System.out.println(isMatch(".cD", "Ab/cDef"));
        System.out.println("AbcDef cD. - means it can be any "+" char after cD");
        System.out.println(isMatch(".cD", "Ab*cD/ef"));
        System.out.println(isMatch(".cD", "Ab/cDe_f"));

        System.out.println(" y [xyz] - means it can be any "+" matches in braces");
        System.out.println(isMatch("[xyz]", "y"));
        System.out.println(isMatch("[xyz]", "z"));
        System.out.println(isMatch("[xyz]", "xyz"));
        System.out.println(isMatch("[xyz]", "t"));
        /////////////////////////////////////////

        System.out.println("[xyz]Me xMe/xMe yMe zMe matches "+" all combinations");
        System.out.println(isMatch("[xyz]Me", "xMe"));
        System.out.println(isMatch("[xyz]Me", "xMe yMe zMe"));

        System.out.println("Matche no combination in "+" any of xyz - [^xyz]");
        System.out.println(isMatch("[^xyz]", "k1"));
        System.out.println(isMatch("[^xyz]", "x"));

        //Check upper case
        System.out.println(isMatch("[A-Z]", "aankdnc dcdvfdsb"));

        //Check lower case
        System.out.println(isMatch("[a-z]", "ABMCKDMVFJV"));

        //both case
        System.out.println(isMatch("[a-zA-Z]", "EsncmO"));

        //number range
        System.out.println(isMatch("[1-5]", "d8hgnk3"));

        //char classes
        //
        System.out.println(isMatch("\\d", "123"));

        System.out.println(isMatch("(\\d\\d", "1212"));

        System.out.println(isMatch("[tT]rue", "True"));

        System.out.println(isMatch("[tT]rue|[yY]es", "XyxTrue"));
        System.out.println(isMatch("[tT]rue|[yY]es", "YesXdv"));
        System.out.println(isMatch(".*true.*", "hellotrueHello"));

        System.out.println(isMatch("[a-zA-Z]{3}", "Abwenc"));

        //if it does not have a number at the beginning
        System.out.println(isMatch("^[^\\d].*", "Abc12cff"));
        System.out.println(isMatch("^[^\\d].*", "12cff"));

        // check phone number
        System.out.println(isMatch("\\d{3}\\s\\d{7}", "372 85666665"));


    }

    public static boolean isMatch(String regex, String text){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int matches = 0;
        while (matcher.find())  {
            matches++;
        }
        return matches > 0;
    }
}

