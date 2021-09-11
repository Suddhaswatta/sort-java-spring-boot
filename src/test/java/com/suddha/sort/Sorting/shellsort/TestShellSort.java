package com.suddha.sort.Sorting.shellsort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestShellSort {

    private ShellSort sort;

    @BeforeEach
    void setup(){
        sort = new ShellSort();

    }
    @Test
    void given_range_of_int(){

        int n = 20;
        Integer[] arr = IntStream.range(0, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        List<String> logs = this.sort.sort(arr);
        System.out.println(logs);

        Integer[] expected = IntStream.range(0, n)
                .boxed()
                .toArray(Integer[]::new);

        assertEquals(Arrays.toString(arr),Arrays.toString(expected));

    }


}
