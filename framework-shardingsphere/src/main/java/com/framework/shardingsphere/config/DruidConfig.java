package com.framework.shardingsphere.config;

import com.alibaba.druid.support.jakarta.StatViewServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-05 14:35
 * @Version: 1.0.0
 **/
@Configuration
public class DruidConfig {
    /**
     * Druid监控
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();//这是配置的druid监控的登录密码
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        //默认就是允许所有访问
//        initParams.put("allow","127.0.0.1");
        //黑名单IP
//        initParams.put("deny","192.168.15.21");
        bean.setInitParameters(initParams);
        return bean;
    }
}
