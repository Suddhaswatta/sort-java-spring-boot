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
            for (int j = i; j >=1; j--)
                if(less(arr[j], arr[j - 1],c))
                    swap(arr, j, j - 1);
                else
                    break;
        }
        logs.add(Arrays.toString(arr));
        return logs;
    }

    @Override
    public List<String> sort(Comparable[] arr) {
        List<String> logs = new ArrayList<>();
        boolean isSorted = false;
        for(int i = 1; i< arr.length; i++) {
            logs.add(Arrays.toString(arr));

            for (int j = i; j >=1 ; j--)
                if(less(arr[j], arr[j - 1]))
                    swap(arr, j, j - 1);
                else
                    isSorted = true;
            if(isSorted)
                break;
        }
        logs.add(Arrays.toString(arr));
        return logs;
    }

}
