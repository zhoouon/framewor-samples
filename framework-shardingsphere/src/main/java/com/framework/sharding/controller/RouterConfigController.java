package com.framework.sharding.controller;

import com.framework.sharding.entity.RouterConfig;
import com.framework.sharding.service.RouterConfigService;
import com.framework.starter.common.action.Function;
import com.framework.starter.common.result.BaseRequestParam;
import com.framework.starter.common.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Function(descreption = "路由器配置信息-保存")
    @PostMapping("/save")
    public BaseResult<Integer> add(@RequestBody BaseRequestParam<RouterConfig> param) {
        return BaseResult.buildSuccessData(routerConfigService.add(param.getRequestBody()));
    }

    @Function(descreption = "路由器配置信息-刪除")
    @DeleteMapping("/deleteById")
    public BaseResult<Integer> deleteById(@RequestBody BaseRequestParam<Long> param) {
        return BaseResult.buildSuccessData(routerConfigService.deleteById(param.getRequestBody()));
    }

    @Function(descreption = "路由器配置信息-查询所有")
    @PostMapping("/selectAll")
    public BaseResult<List<RouterConfig>> selectAll() {
        return BaseResult.buildSuccessData(routerConfigService.selectAll());
    }

    @Function(descreption = "路由器配置信息-详情")
    @PostMapping("/selectById")
    public BaseResult<RouterConfig> selectById(@RequestBody BaseRequestParam<Long> param) {
        return BaseResult.buildSuccessData(routerConfigService.selectById(param.getRequestBody()));
    }
}
