/*
 * DailyMart is a microservice-based e-commerce project implemented
 * with Domain-Driven Design (DDD).
 * Copyright (C) 2023 Java日知录
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.framework.starter.common.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.framework.starter.common.spring.MartApplicationContextAware;
import com.framework.starter.common.toolkit.CustomJsonModule;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * 自动装配器
 */
@SpringBootConfiguration
public class BaseAutoConfiguration {

    // @Bean
    // @ConditionalOnMissingBean
    // public SpringContextHolder springContextHolder() {
    // return new SpringContextHolder();
    // }

    @Bean
    @ConditionalOnMissingBean
    public MartApplicationContextAware applicationContextAware() {
        return new MartApplicationContextAware();
    }

    @Bean
    @ConditionalOnMissingBean
    public ObjectMapper getObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        // 注册JSON 序列化对象
        objectMapper.registerModule(new CustomJsonModule());

        return objectMapper;
    }

}
