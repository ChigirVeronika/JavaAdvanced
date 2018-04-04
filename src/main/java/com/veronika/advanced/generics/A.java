package com.veronika.advanced.generics;

public class A {
    public static class X {


        public static class Y {
            private Y() {}
            public static String Z = "life is good";
        }

        public static C Y;
    }

    public static class C {
        public static String Z = "life is pain";
    }

    public static void main(String[] args) {
        System.out.println(X.Y.Z);

        System.out.println(new X.Y().Z);
        System.out.println(((X.Y)null).Z);
    }
}
