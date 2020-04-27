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
    public float findMaximum(float first, float second, float third) {
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
    public String findMaximum(String first, String second, String third) {
        if (first.length() > second.length()) {
            if (first.length() > third.length()) {
                return first;
            } else {
                return third;
            }
        } else if (second.length() > third.length()) {
            return second;
        }
        return third;
    }
}
