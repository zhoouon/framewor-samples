package com.framework.shardingsphere;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 23:35
 * @Version: 1.0.0
 **/
@Slf4j
@SpringBootTest
public class TestShardingSphere {

    @Autowired
    private RouterConfigService routerConfigService;


    /**
     * @param
     * @return: void
     * @description: 批量插入200条数据，测试分库分表
     * @author: zhoudong
     * @date: 2024/4/5 12:44
     */
    @Test
    public void test(){
        for (int i = 0; i < 200; i++) {
            RouterConfig routerConfig = new RouterConfig();
            routerConfig.setDeviceId(1L);
            routerConfig.setWifiName("Zoie");
            routerConfig.setWifiPassword("oWCRA6nfduiWZNi");
            routerConfig.setWifiSwitch(Byte.valueOf("1"));
            routerConfig.setEncryptType(Byte.valueOf("1"));
            routerConfig.setAdminPassword("__2Z4NG6xvhpEQY");
            routerConfig.setHideSwitch(Byte.valueOf("1"));
            routerConfigService.insert(routerConfig);
        }
    }

    @Test
    public void getRouterConfig(){
        RouterConfig routerConfig = routerConfigService.findById(982791022058668032L);
        log.info("查询出来的分库分表数据是: {}", routerConfig.toString());
    }


    @Test
    public void findAll(){
        IPage<RouterConfig> routerConfigIPage = routerConfigService.selectAll(1, 5);
        log.info("查询出来的分库分表数据是: {}", routerConfigIPage.getRecords());

    }
}
