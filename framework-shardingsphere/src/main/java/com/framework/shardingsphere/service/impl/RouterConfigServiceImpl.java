package com.framework.shardingsphere.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.mapper.RouterConfigMapper;
import com.framework.shardingsphere.service.RouterConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Boolean add(RouterConfig routerConfig) {
        return this.save(routerConfig);
    }

    @Override
    public Integer deleteById(Long id) {
        return this.deleteById(id);
    }

    @Override
    public RouterConfig selectById(Long id) {
        return this.selectById(id);
    }

    @Override
    public List<RouterConfig> selectAll() {
        return this.list();
    }
}
