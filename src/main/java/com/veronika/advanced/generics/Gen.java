package com.veronika.advanced.generics;

public class Gen<T> {
    T genType;

    public Gen(T genType){
        this.genType = genType;
    }

    public T getGenType() {
        return genType;
    }

    public void setGenType(T genType) {
        this.genType = genType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gen<?> gen = (Gen<?>) o;

        return genType != null ? genType.equals(gen.genType) : gen.genType == null;
    }

    @Override
    public int hashCode() {
        return genType != null ? genType.hashCode() : 0;
    }
}
