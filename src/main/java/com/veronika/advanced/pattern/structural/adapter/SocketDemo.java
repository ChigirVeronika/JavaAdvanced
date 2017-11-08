package com.veronika.advanced.pattern.structural.adapter;

/**
 * Created by Veranika on 11/8/2017.
 */
public class SocketDemo {
    public static void main(String[] args) {
        SocketAdapter sockAdapter = new SocketAdapterImpl();
        Volt v3 = getVolt(sockAdapter, 3);
        Volt v12 = getVolt(sockAdapter, 110);
        Volt v120 = getVolt(sockAdapter, 220);
        System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
        System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
        System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i) {
            case 3:
                return sockAdapter.get3Volt();
            case 110:
                return sockAdapter.get110Volt();
            case 220:
                return sockAdapter.get220Volt();
            default:
                return sockAdapter.get220Volt();
        }
    }
}
