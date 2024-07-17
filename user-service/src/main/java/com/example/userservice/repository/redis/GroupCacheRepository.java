package com.example.userservice.repository.redis;

import com.example.userservice.entity.redisCache.GroupCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupCacheRepository extends CrudRepository<GroupCache, Long> {
}
