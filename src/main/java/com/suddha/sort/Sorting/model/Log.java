package com.suddha.sort.Sorting.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Log implements Serializable {

    @Id
    String id;
    String log;
}
