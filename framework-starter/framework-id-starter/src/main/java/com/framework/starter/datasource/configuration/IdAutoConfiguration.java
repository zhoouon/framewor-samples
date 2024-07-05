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

package com.framework.starter.datasource.configuration;

import com.framework.starter.datasource.core.DefaultIdGenerator;
import com.framework.starter.datasource.core.IdGenerator;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * ID生成器自动装配
 */
@SpringBootConfiguration
public class IdAutoConfiguration {

    /**
     * 注入ID生成器实现
     * @return see {@link com.jianzh5.dailymart.springboot.starter.id.core.DefaultIdGenerator}
     */
    @Bean
    @ConditionalOnMissingBean
    public IdGenerator idGenerator() {
        return new DefaultIdGenerator();
    }

}
