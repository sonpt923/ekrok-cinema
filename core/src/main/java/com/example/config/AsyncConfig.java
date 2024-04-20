package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig {

    @Bean(name = "mailAsyncTask")
    public TaskExecutor mailAsyncTask() {
        ThreadPoolTaskExecutor threadPoolExecutor = new ThreadPoolTaskExecutor();
        threadPoolExecutor.setCorePoolSize(10);
        threadPoolExecutor.setQueueCapacity(500); //so lenh co the cho torng hang doi
        threadPoolExecutor.setThreadNamePrefix("MailAsyncTask");
        threadPoolExecutor.afterPropertiesSet();
        return threadPoolExecutor;
    }

}
