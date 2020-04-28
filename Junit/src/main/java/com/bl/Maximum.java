package com.bl;

public class Maximum<T extends Comparable<T>> {
    T first, second, third;

    public Maximum(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Maximum() {
    }

    public static <T extends Comparable> T findMaximum(T first, T second, T third) {
        T maximum = first;
        if (second.compareTo( maximum ) > 0) {
            maximum = second;
        }
        if (third.compareTo( maximum ) > 0) {
            maximum = third;
        }
        return maximum;
    }
    public T testMaximum() {
        T number = findMaximum( first, second, third );
        printMax( number );
        return number;
    }

    public <T> void printMax(T num) {
        System.out.println( num );
    }
}