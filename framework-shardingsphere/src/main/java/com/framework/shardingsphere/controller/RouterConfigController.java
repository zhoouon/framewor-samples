package com.framework.shardingsphere.controller;

import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 路由器配置控制层
 * @Author: junqiang.lu
 * @Date: 2022/4/1
 */
@RestController
@RequestMapping(value = "/api/router/config")
public class RouterConfigController {

    @Autowired
    private RouterConfigService routerConfigService;

    /**
     * 路由器配置新增单条
     *
     * @param routerConfig
     * @return
     */
    @PostMapping(value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<RouterConfig> add(@RequestBody RouterConfig routerConfig) {
        return ResponseEntity.ok(routerConfigService.insert(routerConfig));
    }

    /**
     * 路由器配置查询单条
     *
     * @return
     */
    @GetMapping(value = "/findAll", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<RouterConfig> queryOne() {
        return routerConfigService.selectAll();
    }

    @DeleteMapping("/deleteById")
    public Integer delete(@RequestParam Long id) {
        return routerConfigService.deleteById(id);
    }

}
