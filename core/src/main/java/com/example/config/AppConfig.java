package com.example.config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppConfig {

    @Value("${cloudiary.cloud_name}")
    private String cloudName;

    @Value("${cloudiary.api_key")
    private String apiKey;

    @Value("${cloudiary.secure}")
    private String secure;

    @Value("${cloudiary.api_secret}")
    private String apiSecret;


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ExecutorService executorService() {
        return Executors.newFixedThreadPool(10);
    }

    @Bean
    public Cloudinary getCloudiary() {

        Map config = new HashMap();
        config.put("cloud_name", cloudName);
        config.put("api_key", apiKey);
        config.put("api_secret", apiSecret);
        config.put("secure", secure);
        return new Cloudinary(config);
    }

}
