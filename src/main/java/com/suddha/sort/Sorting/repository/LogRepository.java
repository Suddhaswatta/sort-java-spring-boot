package com.suddha.sort.Sorting.repository;

import com.suddha.sort.Sorting.model.Log;
import org.springframework.data.redis.core.ReactiveRedisOperations;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LogRepository {

    ReactiveRedisTemplate<String, Log> template;

    public LogRepository(ReactiveRedisTemplate<String, Log> template) {
        this.template = template;
    }


}
