package com.framework.shardingsphere.service.impl;

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

    @Override
    public List<RouterConfig> selectAll() {
        return routerConfigMapper.selectList(null);
    }

    @Override
    public Integer deleteById(Long id) {
        return routerConfigMapper.deleteById(id);
    }
}
