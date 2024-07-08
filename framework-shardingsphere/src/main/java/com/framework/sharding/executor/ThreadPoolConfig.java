package com.framework.sharding.executor;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-08 10:48
 * @Version: 1.0.0
 **/
public class ThreadPoolConfig {

    @Bean
    public ThreadPoolTaskExecutor AsyncThreadPoolExecutor(){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(33);
        threadPoolTaskExecutor.setMaxPoolSize(66);
        threadPoolTaskExecutor.setQueueCapacity(120);
        threadPoolTaskExecutor.setKeepAliveSeconds(30);
        threadPoolTaskExecutor.setThreadNamePrefix("batchSave_");
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
