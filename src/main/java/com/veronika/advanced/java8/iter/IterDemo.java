package com.veronika.advanced.java8.iter;

import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class IterDemo {
    public static void main(String[] args) {
        IntStream i = IntStream.of(1,2,3,4,5,6,7);
        PrimitiveIterator.OfInt o =  i.iterator();
        while(o.hasNext()){
            System.out.println(o.nextInt());
        }
    }
}
