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
}
