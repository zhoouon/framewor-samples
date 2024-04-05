package com.framework.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 12:46
 * @Version: 1.0.0
 **/
/**
 * 设备信息
 */
@Data
@TableName(value = "sharding-sphere0.DEVICE_INFO")
public class DeviceInfo extends BaseEntity {
    /**
     * id
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 设备类型,1-路由器,2-音响,3-摄像头
     */
    @TableField(value = "`TYPE`")
    private Byte type;

    /**
     * 设备品牌
     */
    @TableField(value = "BRAND")
    private String brand;

    /**
     * 设备型号
     */
    @TableField(value = "MODEL")
    private String model;

    /**
     * 设备名称
     */
    @TableField(value = "`NAME`")
    private String name;
}
