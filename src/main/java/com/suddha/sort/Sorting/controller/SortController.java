package com.suddha.sort.Sorting.controller;

import com.suddha.sort.Sorting.service.SortFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/sort-api")
public class SortController {

    @Autowired
    SortFactory factory;


    @GetMapping("/insertion-sort")
    public List<String> triggerInsertionSort(){

        Integer[] arr = IntStream.range(0, 8)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        System.out.println();

        return factory.getSortingAlgorithm("INSERTION_SORT").sort(arr);
    }

    @GetMapping("/shell-sort")
    public List<String> shellSort(){

        Integer[] arr = IntStream.range(0, 8)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        return factory.getSortingAlgorithm("SHELL_SORT").sort(arr);
    }


}
