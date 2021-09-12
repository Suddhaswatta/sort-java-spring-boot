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
    public boolean isSorted(Object[] a,int idx,Comparator c){
        for(int i = idx ; i<a.length  ; i++){
            if(less(a[i],a[i-1],c))
                return false;
        }
        return true;
    }


    public boolean isSorted(Comparable[] a,int idx){
        for(int i = idx; i<a.length ; i++){
            if(less(a[i],a[i-1]))
                return false;
        }
        return true;
    }
    protected boolean less(Object u, Object v,Comparator c){
        return c.compare(u,v)<0;
    }
    protected boolean less(Comparable u,Comparable v){
        return u.compareTo(v)<0;
    }
}
