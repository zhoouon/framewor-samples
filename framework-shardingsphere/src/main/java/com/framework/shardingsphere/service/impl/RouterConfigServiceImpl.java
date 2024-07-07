package com.framework.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.mapper.RouterConfigMapper;
import com.framework.shardingsphere.service.RouterConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 12:53
 * @Version: 1.0.0
 **/
@Service("routerConfigService")
public class RouterConfigServiceImpl extends ServiceImpl<RouterConfigMapper, RouterConfig> implements RouterConfigService {

    @Autowired
    private RouterConfigMapper routerConfigMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public RouterConfig insert(RouterConfig routerConfig) {
        routerConfigMapper.insert(routerConfig);
        return routerConfig;
    }

    /**
     * @param
     * @return: java.util.List<com.framework.shardingsphere.entity.RouterConfig>
     * @description: 分页查询
     * @author: zhoudong
     * @date: 2024/4/5 12:50
     */
    @Override
    public IPage<RouterConfig> selectAll(Integer pageNum, Integer pageSize) {
        Page<RouterConfig> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<RouterConfig> wrapper = Wrappers.lambdaQuery();
        wrapper.orderBy(true, false, RouterConfig::getUpdateTime);
        return this.page(page,wrapper);
    }

    @Override
    public Integer deleteById(Long id) {
        return routerConfigMapper.deleteById(id);
    }

    @Override
    public RouterConfig findById(Long id) {
        return routerConfigMapper.selectById(id);
    }

}
