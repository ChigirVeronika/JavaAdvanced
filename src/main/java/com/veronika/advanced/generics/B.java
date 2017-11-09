package com.veronika.advanced.generics;

public class B {
    public static <T> T foo() {
        try {
            return (T) new Integer(42);
        } catch (ClassCastException e) {
            return (T) "habr";
        }
    }
    public static void main(String[] args) {
        System.out.println(B.<String>foo());
    }
}
