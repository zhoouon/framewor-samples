package com.framework.shardingsphere.service;


import com.framework.shardingsphere.entity.DeviceInfo;

import java.util.List;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/2 15:39
 * @Version: 1.0.0
 **/
public interface DeviceInfoService {
    Integer add(DeviceInfo deviceInfo);

    List<DeviceInfo> selectAll();

    Integer deleteById(Long id);
}
