package com.bl;

public class ExtendedMaximum<E extends Comparable<E>> {
    E multipleArguments[];

    public ExtendedMaximum() {
    }
    public ExtendedMaximum(E... multipleArguments) {
        this.multipleArguments = multipleArguments;
    }
    public static <E extends Comparable> E findMaximum(E... multipleArguments) {
        E maximum = multipleArguments[0];
        for (int i = 1; i < multipleArguments.length; i++) {
            if (multipleArguments[i].compareTo( maximum ) > 0) {
                maximum = multipleArguments[i];
            }
        }
        return maximum;
    }
    public E testMaximum() {
        E number = findMaximum( multipleArguments );
        printMax( number );
        return number;
    }
    public <E> void printMax(E num) {
        System.out.println( num );
    }
}