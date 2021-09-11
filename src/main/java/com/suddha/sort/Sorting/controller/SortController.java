package com.suddha.sort.Sorting.controller;

import com.suddha.sort.Sorting.service.SortFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Collections;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/sort-api")
public class SortController {

    @Autowired
    SortFactory factory;


    @GetMapping("/insertion-sort/{n}")
    public Flux<String> triggerInsertionSort(@PathVariable int n){

        Integer[] arr = IntStream.range(0, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        return Flux
                .fromIterable(
                        factory.getSortingAlgorithm("INSERTION_SORT").sort(arr)
                ).delayElements(Duration.ofSeconds(1));
    }

    @GetMapping("/shell-sort/{n}")
    public Flux<String> shellSort(@PathVariable int n){

        Integer[] arr = IntStream.range(0, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);

        return Flux.fromIterable(
                factory.getSortingAlgorithm("SHELL_SORT").sort(arr)
        ).delayElements(Duration.ofSeconds(1));
    }


}
