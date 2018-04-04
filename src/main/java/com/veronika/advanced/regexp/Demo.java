package com.veronika.advanced.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String s = "123-456";
        Pattern p = Pattern.compile("\\d{3}[-\\]\\d{3}]");
        Matcher m = p.matcher(s);
        //System.out.println(m.matches());

        Class c;
    }

}
