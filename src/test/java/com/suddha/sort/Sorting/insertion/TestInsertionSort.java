package com.suddha.sort.Sorting.insertion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reactor.core.Disposable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestInsertionSort {

    private InsertionSort insertionSort;

    @BeforeEach
    void setup(){
        insertionSort = new InsertionSort();

    }

    @Test
    void given_range_of_int(){

        int n = 5;
        Integer[] arr = IntStream.range(0, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        List<String> logs = insertionSort.sort(arr);
        System.out.println(logs);

        Integer[] expected = IntStream.range(0, n)
                .boxed()
                .toArray(Integer[]::new);

        assertEquals(Arrays.toString(arr),Arrays.toString(expected));

    }


}
