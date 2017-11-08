package com.veronika.advanced.java8.meth_ref;

public interface MyI {

    default void m(){
        System.out.println("from interfase!");
    }

    default void m1(){
        System.out.println("from interfase!");
    }
}
