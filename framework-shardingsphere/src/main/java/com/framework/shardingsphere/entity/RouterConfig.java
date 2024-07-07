package com.framework.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024/4/4 12:47
 * @Version: 1.0.0
 **/
/**
 * 路由器配置信息
 */
@Data
@ToString
@TableName(value = "ROUTER_CONFIG")
public class RouterConfig extends BaseEntity {
    /**
     * 主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;

    /**
     * 设备id
     */
    @TableField(value = "DEVICE_ID")
    private Long deviceId;

    /**
     * wifi名称
     */
    @TableField(value = "WIFI_NAME")
    private String wifiName;

    /**
     * wifi密码
     */
    @TableField(value = "WIFI_PASSWORD")
    private String wifiPassword;

    /**
     * 加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK
     */
    @TableField(value = "ENCRYPT_TYPE")
    private Byte encryptType;

    /**
     * 管理员密码
     */
    @TableField(value = "ADMIN_PASSWORD")
    private String adminPassword;

    /**
     * wifi开关,0-关闭,1-开启
     */
    @TableField(value = "WIFI_SWITCH")
    private Byte wifiSwitch;

    /**
     * 是否隐藏 wifi,0-不隐藏,1-隐藏
     */
    @TableField(value = "HIDE_SWITCH")
    private Byte hideSwitch;

}
