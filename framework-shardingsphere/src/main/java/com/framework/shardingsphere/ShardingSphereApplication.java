package com.framework.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: zhoudong
 * @Description: 分库分表启动类
 * @Date: 2024/4/2 15:15
 * @Version: 1.0.0
 **/
@SpringBootApplication
@MapperScan("com.framework.shardingsphere.mapper")
public class ShardingSphereApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereApplication.class);
    }
}
