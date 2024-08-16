package com.example.apigateway.model.redis;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;


@RedisHash(value = "TOKEN", timeToLive = 60L)
public class TokenCache {

    @Id
    @Indexed
    private String key;

    private String token;

}
