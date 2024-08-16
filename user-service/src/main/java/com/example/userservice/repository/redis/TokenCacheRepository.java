package com.example.userservice.repository.redis;

import com.example.userservice.entity.redisCache.SecurityCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenCacheRepository extends CrudRepository<SecurityCache, String> {
}
