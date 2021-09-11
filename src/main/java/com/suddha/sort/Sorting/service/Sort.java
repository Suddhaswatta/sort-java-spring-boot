package com.suddha.sort.Sorting.service;

import java.util.Comparator;
import java.util.List;

public abstract class Sort {

    public abstract List<String> sort(Object[] arr, Comparator c);

    public abstract List<String> sort(Comparable[] arr);


    protected void swap(Object[] a, int i, int j){
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;


    }

    protected boolean less(Object u, Object v,Comparator c){
        return c.compare(u,v)<0;
    }
    protected boolean less(Comparable u,Comparable v){
        return u.compareTo(v)<0;
    }
}
