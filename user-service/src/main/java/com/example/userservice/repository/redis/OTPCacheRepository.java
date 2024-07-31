package com.example.userservice.repository.redis;

import com.example.userservice.entity.redisCache.OTPCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OTPCacheRepository extends CrudRepository<OTPCache, String> {
}
