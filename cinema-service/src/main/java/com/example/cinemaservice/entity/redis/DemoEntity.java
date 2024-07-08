package com.example.cinemaservice.entity.redis;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RedisHash(value = "demo", timeToLive = 100000L)
public class DemoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Indexed
    private String key;

    private Map value;

}
