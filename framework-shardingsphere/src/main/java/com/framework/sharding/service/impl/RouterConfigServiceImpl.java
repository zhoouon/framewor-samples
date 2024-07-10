package com.framework.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.framework.sharding.entity.RouterConfig;
import com.framework.sharding.mapper.RouterConfigMapper;
import com.framework.sharding.service.RouterConfigService;
import com.framework.starter.common.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 14:39
 * @Version: 1.0.0
 **/
@Service
public class RouterConfigServiceImpl extends ServiceImpl<RouterConfigMapper, RouterConfig> implements RouterConfigService {

    @Autowired
    private RouterConfigMapper routerConfigMapper;

    @Autowired
    private BaseMapper baseMapper;

    @Override
    public Integer add(RouterConfig routerConfig) {
        return baseMapper.insert(routerConfig);
    }

    @Override
    public Integer deleteById(Long id) {
        return this.deleteById(id);
    }

    @Override
    public RouterConfig selectById(Long id) {
        LambdaQueryWrapper<RouterConfig> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RouterConfig::getId, id);
        RouterConfig config = this.getOne(queryWrapper);
        if (Objects.isNull(config)) {
            throw new BaseException("0202B052", id);
        }
        return config;
    }

    @Override
    public List<RouterConfig> selectAll() {
        return this.list();
    }

    @Async("AsyncThreadPoolExecutor")
    @Override
    public void batchSave(List<RouterConfig> routerConfigs, CountDownLatch countDownLatch) {
        try {
            this.saveBatch(routerConfigs);
        }finally {
            countDownLatch.countDown();
        }
    }
}
