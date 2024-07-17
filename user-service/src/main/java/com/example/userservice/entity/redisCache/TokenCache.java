package com.example.userservice.entity.redisCache;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "token", timeToLive = 5L * 60L /* secconds */)
public class TokenCache implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Indexed
    private String key;

    private String token;

}
