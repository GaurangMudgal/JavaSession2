package com.gaurang.session2;

import java.util.Arrays;

public class Main {
    public static final ArrayProcessor a1 = (arr) -> {
        double max = Arrays.stream(arr).max().getAsDouble();
        return max;
    };

    public static final ArrayProcessor a2 = (arr) -> {
        double min = Arrays.stream(arr).min().getAsDouble();
        return min;
    };

    public static final ArrayProcessor a3 = (arr) -> {
        double sum = Arrays.stream(arr).sum();
        return sum;
    };

    public static final ArrayProcessor a4 = (arr) -> {
        double avg = Arrays.stream(arr).sum()/arr.length;
        return avg;
    };

    public static ArrayProcessor counter(double value) {
        ArrayProcessor a = (arr) -> {
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == value) {
                    count++;
                }
            }
            return count;
        };
        return a;
    }

    public static void main(String[] args) {
        double arr[] = new double[5];
        arr[0] = 1.0;
        arr[1] = 2.0;
        arr[2] = 4.0;
        arr[3] = 4.0;
        arr[4] = 4.1;

        System.out.println(a1.apply(arr));
        System.out.println(a2.apply(arr));
        System.out.println(a3.apply(arr));
        System.out.println(a4.apply(arr));
        System.out.println((int)counter(4.0).apply(arr));
    }

}
