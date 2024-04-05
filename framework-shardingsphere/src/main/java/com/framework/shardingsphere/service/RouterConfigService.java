package com.framework.shardingsphere.service;

import com.framework.shardingsphere.entity.DeviceInfo;
import com.framework.shardingsphere.entity.RouterConfig;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 12:53
 * @Version: 1.0.0
 **/
public interface RouterConfigService {

    RouterConfig insert(RouterConfig routerConfig);

    List<RouterConfig> selectAll();

    Integer deleteById(Long id);

}
