package com.bl;

public class Maximum {

    public int findMaximum(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                return first;
            } else {
                return third;
            }
        } else if (second > third) {
            return second;
        }
        return third;
    }
}
