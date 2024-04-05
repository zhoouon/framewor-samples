package com.framework.shardingsphere;

import com.framework.shardingsphere.entity.RouterConfig;
import com.framework.shardingsphere.service.RouterConfigService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 23:35
 * @Version: 1.0.0
 **/
@SpringBootTest
public class TestShardingSphere {

    @Autowired
    private RouterConfigService routerConfigService;

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
}
