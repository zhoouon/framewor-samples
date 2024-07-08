package com.framework.sharding.service;

import com.framework.sharding.entity.RouterConfig;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 14:39
 * @Version: 1.0.0
 **/
public interface RouterConfigService {

    Integer add(RouterConfig routerConfig);

    Integer deleteById(Long id);

    RouterConfig selectById(Long id);

    List<RouterConfig> selectAll();

    void batchSave(List<RouterConfig> routerConfigs, CountDownLatch countDownLatch);
}
