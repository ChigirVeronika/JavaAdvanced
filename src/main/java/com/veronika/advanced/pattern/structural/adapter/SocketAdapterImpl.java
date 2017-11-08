package com.veronika.advanced.pattern.structural.adapter;

public class SocketAdapterImpl implements SocketAdapter {

    protected Socket socket = new Socket();

    @Override
    public Volt get220Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get110Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 2);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 73);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts() / i);
    }
}
