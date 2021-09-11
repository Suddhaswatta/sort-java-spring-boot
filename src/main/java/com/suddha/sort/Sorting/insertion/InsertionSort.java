package com.suddha.sort.Sorting.insertion;

import com.suddha.sort.Sorting.service.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
public class InsertionSort extends Sort {

    @Override
    public List<String> sort(Object[] arr, Comparator c) {
        List<String> logs = new ArrayList<>();
        for(int i = 1; i< arr.length; i++) {
            logs.add(Arrays.toString(arr));
            for (int j = i; j >=1 && less(arr[j], arr[j - 1],c); j--)
                swap(arr, j, j - 1);
        }
        logs.add(Arrays.toString(arr));
        return logs;
    }

    @Override
    public List<String> sort(Comparable[] arr) {
        List<String> logs = new ArrayList<>();
        for(int i = 1; i< arr.length; i++) {
            logs.add(Arrays.toString(arr));
            for (int j = i; j >=1 && less(arr[j], arr[j - 1]); j--)
                swap(arr, j, j - 1);
        }
        logs.add(Arrays.toString(arr));
        return logs;
    }

}
