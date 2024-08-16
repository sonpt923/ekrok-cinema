package com.example.userservice.entity.redisCache;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash(value = "OTP")
public class OTPCache {

    @Id
    @Indexed
    private String key;

    @TimeToLive
    private Long expirationSeccond;

    private String value;

}
