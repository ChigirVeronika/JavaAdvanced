package com.veronika.advanced.generics;

import java.util.HashMap;
import java.util.Map;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> i = new Gen<>(12);
        System.out.println(i.genType);
        //String s = i.getGenType();

        Gen g = new Gen("E");
        //Integer n = g.getGenType();

        //HashMap
        Object o;

    }
}
