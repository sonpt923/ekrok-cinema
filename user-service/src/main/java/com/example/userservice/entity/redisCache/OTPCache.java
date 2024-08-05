package com.example.userservice.entity.redisCache;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash(value = "OTP", timeToLive = 60)
public class OTPCache {

    @Id
    @Indexed
    private String key;

    private String value;

}
