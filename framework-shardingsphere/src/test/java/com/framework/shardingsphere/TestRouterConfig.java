package com.framework.shardingsphere;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.RandomUtil;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 14:59
 * @Version: 1.0.0
 **/
@Slf4j
@SpringBootTest
public class TestRouterConfig {

    @Resource
    private RouterConfigService routerConfigService;

    @Test
    public void save() {
        Snowflake snowflake = new Snowflake();
        for (int i = 0; i < 1000; i++) {
            RouterConfig routerConfig = new RouterConfig(
                    snowflake.nextId(),
                    "admin",
                    String.valueOf(RandomUtil.randomChinese()),
                    String.valueOf(RandomUtil.randomNumbers(20)),
                    1,
                    0,
                    String.valueOf(RandomUtil.randomNumbers(10)),
                    1);
            Boolean result = routerConfigService.add(routerConfig);
            log.info("第 {} 条数据保存状态是 {}", i, result);
        }
    }

    @org.junit.jupiter.api.Test
    public void getRouterConfig() {
        RouterConfig routerConfig = routerConfigService.selectById(982791022058668032L);
        log.info("查询出来的分库分表数据是: {}", routerConfig.toString());
    }
}
