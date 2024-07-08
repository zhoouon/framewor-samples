package com.framework.shardingsphere;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.RandomUtil;
import com.alibaba.fastjson.JSONObject;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-07 17:34
 * @Version: 1.0.0
 **/
@SpringBootTest
@Slf4j
public class TestRouterConfig {

    @Autowired
    private RouterConfigService routerConfigService;

    @Test
    public void save(){
        Snowflake snowflake = new Snowflake();
        for (int i = 0; i < 10; i++) {
            RouterConfig routerConfig = new RouterConfig();
            routerConfig.setRepayNo(snowflake.nextIdStr());
            routerConfig.setWifiName(RandomUtil.randomString(8));
            routerConfig.setWifiPassword(RandomUtil.randomString(10));
            routerConfig.setWifiSwitch(RandomUtil.randomInt(2));
            routerConfig.setEncryptType(RandomUtil.randomInt(2));
            routerConfig.setAdminPassword(RandomUtil.randomString(20));
            routerConfig.setHideSwitch(RandomUtil.randomInt(2));
            Integer add = routerConfigService.add(routerConfig);
            log.info("数据: {} 添加成功的状态是: {}", JSONObject.toJSONString(routerConfig), add);
        }
    }

    @Test
    public void selectById(){
        RouterConfig routerConfig = routerConfigService.selectById(1809892430437163011L);
        log.info("分表查询出来的数据是: {}",JSONObject.toJSONString(routerConfig));

    }

}
