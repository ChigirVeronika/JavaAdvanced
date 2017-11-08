package com.veronika.advanced.java8.meth_ref;
@FunctionalInterface
public interface Converter<F,T> {
    T convert (F from);
}
