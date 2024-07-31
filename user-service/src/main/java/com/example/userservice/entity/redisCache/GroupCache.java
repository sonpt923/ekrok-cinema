package com.example.userservice.entity.redisCache;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value = "group", timeToLive = 5L * 60L /* seccond */)
public class GroupCache implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Indexed
    private String key;

    private List<String> group;

}
