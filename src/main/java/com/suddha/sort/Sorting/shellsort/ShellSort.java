package com.suddha.sort.Sorting.shellsort;

import com.suddha.sort.Sorting.service.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@Component
public class ShellSort extends Sort {


    @Override
    public List<String> sort(Object[] arr, Comparator c) {

        List<String> logs = new ArrayList<>();

        int h = 1;
        while(h<arr.length/3) h = 3*h + 1;

        while (h>0){

            for(int i = h; i< arr.length; i++) {
                for (int j = i; j >=h && less(arr[j], arr[j - h],c); j-=h) {
                    swap(arr, j, j - h);
                }
                logs.add(Arrays.toString(arr));

            h/=3;
        }
        }


        return logs;
    }

    @Override
    public List<String> sort(Comparable[] arr) {

        int h = 1;
        while(h<arr.length/3) h = 3*h + 1;
        List<String> logs = new ArrayList<>();

        while (h>0){
            for(int i = h; i< arr.length; i++) {
                if(isSorted(arr,i))
                    break;
                logs.add(Arrays.toString(arr));
               for (int j = i; j >=h && less(arr[j], arr[j - h]); j-=h){
                    swap(arr, j, j - h);
                }
            }
            h/=3;
        }
        logs.add(Arrays.toString(arr));
        return logs;
    }
}
