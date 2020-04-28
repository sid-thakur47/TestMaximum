package com.bl;

public class Maximum<T> {

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
}
