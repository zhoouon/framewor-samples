package com.framework.shardingsphere.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping(value = "/findAllByPage", produces = {MediaType.APPLICATION_JSON_VALUE})
    public IPage<RouterConfig> findAllByPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        return routerConfigService.selectAll(pageNum, pageSize);
    }

    @DeleteMapping("/deleteById")
    public Integer delete(@RequestParam Long id) {
        return routerConfigService.deleteById(id);
    }

}
