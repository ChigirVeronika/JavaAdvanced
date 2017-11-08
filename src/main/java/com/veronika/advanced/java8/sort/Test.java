package com.veronika.advanced.java8.sort;
import java.lang.Comparable;

public class Test {
    String value = new String("Strings are immutable");
    public static void main(String args[]) {
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutableStr");
        String str3 = new String("Strings are immutable");

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);
    }
}
