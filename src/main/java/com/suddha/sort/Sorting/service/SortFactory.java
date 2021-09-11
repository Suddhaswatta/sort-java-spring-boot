package com.suddha.sort.Sorting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SortFactory {

    @Autowired
    @Qualifier("insertionSort")
    Sort insertionSort;

    @Autowired
    @Qualifier("shellSort")
    Sort shellShort;

    private SortFactory(){

    }

    public Sort getSortingAlgorithm(String Algo){
        switch (Algo)
        {
            case "INSERTION_SORT": return insertionSort;
            case "SHELL_SORT": return shellShort;
        }
        return null;
    }

}
