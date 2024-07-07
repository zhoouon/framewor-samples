package com.framework.shardingsphere.service;

import com.framework.shardingsphere.entity.RouterConfig;

import java.util.List;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 14:39
 * @Version: 1.0.0
 **/
public interface RouterConfigService {

    Boolean add(RouterConfig routerConfig);

    Integer deleteById(Long id);

    RouterConfig selectById(Long id);

    List<RouterConfig> selectAll();
}
