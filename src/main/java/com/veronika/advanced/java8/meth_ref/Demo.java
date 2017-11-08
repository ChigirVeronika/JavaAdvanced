package com.veronika.advanced.java8.meth_ref;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer i = converter.convert("2345234");
        System.out.println(i);

        Converter<String, Integer> converter1 = Integer::valueOf;//ссылка на метод, т.е. обращение к методу без его выполенния
        Integer i1 = converter1.convert("9876589");
        System.out.println(i1);

        HashMap m;
        HashSet s = new HashSet();
        s.add("a");
        s.add("s");
        s.add("a");
        s.add("a");
        s.add("b");
        System.out.println(s.toString());


        Predicate<String> p = (s1) -> s1.length() > 0;
        boolean b = p.test("123");
        System.out.println(b);


        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;


        double a[] = {1,2,3};
        System.out.println(a.getClass().toString());
    }
}
