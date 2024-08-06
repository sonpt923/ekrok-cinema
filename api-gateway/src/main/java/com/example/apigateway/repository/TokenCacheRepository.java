package com.example.apigateway.repository;

import com.example.apigateway.model.redis.TokenCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenCacheRepository extends CrudRepository<TokenCache, String> {
}
