package com.framework.shardingsphere.controller;

import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 14:38
 * @Version: 1.0.0
 **/
@RestController
@RequestMapping(value = "/api/router/config")
public class RouterConfigController {

    @Autowired
    private RouterConfigService routerConfigService;

    @PostMapping("/save")
    public Boolean add(@RequestBody RouterConfig routerConfig) {
        return routerConfigService.add(routerConfig);
    }

    @DeleteMapping("/deleteById")
    public Integer deleteById(@RequestParam Long id) {
        return routerConfigService.deleteById(id);
    }

    @PostMapping("/selectAll")
    public List<RouterConfig> selectAll() {
        return routerConfigService.selectAll();
    }

    @PostMapping("/selectById")
    public RouterConfig selectById(@RequestParam Long id) {
        return routerConfigService.selectById(id);
    }
}
