package com.example.config;

import com.example.utils.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

//@Configuration
//@PropertySource("classpath:application.yaml")
public class RedisConfig {

//    @Value("${spring.data.redis.host}")
//    String host;
//
//    @Value("${spring.data.redis.port}")
//    Integer port;
//
//    @Value("${spring.data.redis.password}")
//    String password;
//
//    @Value("${spring.data.redis.havePassword}")
//    String havePassword;
//
//
//    @Bean
//    JedisConnectionFactory jedisConnectionFactory() {
//        JedisConnectionFactory jedisConFactory
//                = new JedisConnectionFactory();
//        jedisConFactory.setHostName(host);
//        jedisConFactory.setPort(port);
//        if (havePassword.equals(Constants.YES)) {
//            jedisConFactory.setPassword(password);
//        }
//        return jedisConFactory;
//    }
//
//    @Bean
//    public RedisTemplate<String, Object> redisTemplate() {
//        final RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setValueSerializer(new GenericToStringSerializer<Object>(Object.class));
//        return template;
//    }

}
