package com.suddha.sort.Sorting.utils;


import java.util.Collections;
import java.util.stream.IntStream;

public class Utils {

    public static Integer[] generateIntegerArray(int n, boolean reversed){
        if(reversed){
            return IntStream.range(0, n)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .toArray(Integer[]::new);

        }
        return IntStream.range(0, n)
                .boxed()
                .toArray(Integer[]::new);

    }
    public  static  Integer[] randomArray(int n){
        Integer[] array = generateIntegerArray(n, false);
        shuffle(array);
        return array;
    }

    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [0, i]
            int r = (int) (Math.random() * (i + 1));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
}
