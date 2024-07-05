package com.framework.shardingsphere.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.framework.shardingsphere.entity.DeviceInfo;
import com.framework.shardingsphere.mapper.DeviceInfoMapper;
import com.framework.shardingsphere.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/2 15:41
 * @Version: 1.0.0
 **/
@Service
public class DeviceInfoServiceImpl extends ServiceImpl<DeviceInfoMapper, DeviceInfo> implements DeviceInfoService {

    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public Integer add(DeviceInfo deviceInfo) {
        return deviceInfoMapper.insert(deviceInfo);
    }

    @Override
    public List<DeviceInfo> selectAll() {
        LambdaQueryWrapper<DeviceInfo> queryWrapper = new LambdaQueryWrapper();
        return deviceInfoMapper.selectList(queryWrapper);
    }

    @Override
    public Integer deleteById(Long id) {
        LambdaQueryWrapper<DeviceInfo> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.eq(DeviceInfo::getId, id);
        return deviceInfoMapper.delete(queryWrapper);
    }
}
