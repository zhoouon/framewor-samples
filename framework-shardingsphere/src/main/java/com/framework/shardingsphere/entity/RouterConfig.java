package com.framework.shardingsphere.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: zhoudong
 * @Description: TODO
 * @Date: 2024-07-06 17:51
 * @Version: 1.0.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@TableName(value = "router_config")
public class RouterConfig {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField(value = "repay_no")
    private String repayNo;

    @TableField(value = "wifi_name")
    private String wifiName;

    @TableField(value = "wifi_password")
    private String wifiPassword;

    @TableField(value = "wifi_switch")
    private Integer wifiSwitch;

    @TableField(value = "encrypt_type")
    private Integer encryptType;

    @TableField(value = "admin_password")
    private String adminPassword;

    @TableField(value = "hide_switch")
    private Integer hideSwitch;

}
