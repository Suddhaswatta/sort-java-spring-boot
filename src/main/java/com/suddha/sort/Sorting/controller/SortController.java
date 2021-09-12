package com.suddha.sort.Sorting.controller;

import com.suddha.sort.Sorting.service.SortFactory;
import com.suddha.sort.Sorting.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/sort-api")
public class SortController {

    @Autowired
    SortFactory factory;


    @GetMapping(value = "/insertion-sort/{n}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> insertionSort(@PathVariable int n){

        Integer[] arr = Utils.randomArray(n);
        return Flux.fromIterable(
                        factory.getSortingAlgorithm("INSERTION_SORT").sort(arr)
                ).delayElements(Duration.ofSeconds(1));
    }

    @GetMapping(value = "/shell-sort/{n}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> shellSort(@PathVariable int n){

        Integer[] arr = Utils.generateIntegerArray(n,false);

        return Flux.fromIterable(
                factory.getSortingAlgorithm("SHELL_SORT").sort(arr)
        ).delayElements(Duration.ofSeconds(1));
    }


}
