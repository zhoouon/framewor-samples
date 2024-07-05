package com.framework.starter.datasource;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.framework.starter.datasource.toolkit.IdUtils;

/**
 * 统一ID生成器，使用自定义Id生成器替换掉Mybatis-plus的Id生成器
 */
public class CustomIdGenerator implements IdentifierGenerator {

    @Override
    public Number nextId(Object entity) {
        return IdUtils.nextId();
    }

}
