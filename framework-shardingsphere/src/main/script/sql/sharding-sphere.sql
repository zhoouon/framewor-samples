/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80300 (8.3.0)
 Source Host           : localhost:3306
 Source Schema         : sharding-sphere

 Target Server Type    : MySQL
 Target Server Version : 80300 (8.3.0)
 File Encoding         : 65001

 Date: 04/04/2024 23:54:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for DEVICE_INFO
-- ----------------------------
DROP TABLE IF EXISTS `DEVICE_INFO`;
CREATE TABLE `DEVICE_INFO` (
                               `ID` bigint unsigned NOT NULL COMMENT 'id',
                               `TYPE` tinyint DEFAULT NULL COMMENT '设备类型,1-路由器,2-音响,3-摄像头',
                               `BRAND` varchar(32) DEFAULT NULL COMMENT '设备品牌',
                               `MODEL` varchar(32) DEFAULT NULL COMMENT '设备型号',
                               `NAME` varchar(32) DEFAULT NULL COMMENT '设备名称',
                               `CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                               `UPDATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                               PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='设备信息';

-- ----------------------------
-- Table structure for ROUTER_CONFIG_0
-- ----------------------------
DROP TABLE IF EXISTS `ROUTER_CONFIG_0`;
CREATE TABLE `ROUTER_CONFIG_0` (
                                   `ID` bigint unsigned NOT NULL COMMENT '主键',
                                   `DEVICE_ID` bigint DEFAULT NULL COMMENT '设备id',
                                   `WIFI_NAME` varchar(32) DEFAULT NULL COMMENT 'wifi名称',
                                   `WIFI_PASSWORD` varchar(64) DEFAULT NULL COMMENT 'wifi密码',
                                   `ENCRYPT_TYPE` tinyint DEFAULT '0' COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
                                   `ADMIN_PASSWORD` varchar(64) DEFAULT NULL COMMENT '管理员密码',
                                   `WIFI_SWITCH` tinyint DEFAULT '1' COMMENT 'wifi开关,0-关闭,1-开启',
                                   `HIDE_SWITCH` tinyint DEFAULT '0' COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
                                   `CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `UPDATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='路由器配置信息';

-- ----------------------------
-- Table structure for ROUTER_CONFIG_1
-- ----------------------------
DROP TABLE IF EXISTS `ROUTER_CONFIG_1`;
CREATE TABLE `ROUTER_CONFIG_1` (
                                   `ID` bigint unsigned NOT NULL COMMENT '主键',
                                   `DEVICE_ID` bigint DEFAULT NULL COMMENT '设备id',
                                   `WIFI_NAME` varchar(32) DEFAULT NULL COMMENT 'wifi名称',
                                   `WIFI_PASSWORD` varchar(64) DEFAULT NULL COMMENT 'wifi密码',
                                   `ENCRYPT_TYPE` tinyint DEFAULT '0' COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
                                   `ADMIN_PASSWORD` varchar(64) DEFAULT NULL COMMENT '管理员密码',
                                   `WIFI_SWITCH` tinyint DEFAULT '1' COMMENT 'wifi开关,0-关闭,1-开启',
                                   `HIDE_SWITCH` tinyint DEFAULT '0' COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
                                   `CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `UPDATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='路由器配置信息';

-- ----------------------------
-- Table structure for ROUTER_CONFIG_2
-- ----------------------------
DROP TABLE IF EXISTS `ROUTER_CONFIG_2`;
CREATE TABLE `ROUTER_CONFIG_2` (
                                   `ID` bigint unsigned NOT NULL COMMENT '主键',
                                   `DEVICE_ID` bigint DEFAULT NULL COMMENT '设备id',
                                   `WIFI_NAME` varchar(32) DEFAULT NULL COMMENT 'wifi名称',
                                   `WIFI_PASSWORD` varchar(64) DEFAULT NULL COMMENT 'wifi密码',
                                   `ENCRYPT_TYPE` tinyint DEFAULT '0' COMMENT '加密类型,0-不加密,1-WPA-PSK,2-WPA2-PSK,3-WPA/WPA2-PSK',
                                   `ADMIN_PASSWORD` varchar(64) DEFAULT NULL COMMENT '管理员密码',
                                   `WIFI_SWITCH` tinyint DEFAULT '1' COMMENT 'wifi开关,0-关闭,1-开启',
                                   `HIDE_SWITCH` tinyint DEFAULT '0' COMMENT '是否隐藏 wifi,0-不隐藏,1-隐藏',
                                   `CREATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `UPDATE_TIME` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='路由器配置信息';

SET FOREIGN_KEY_CHECKS = 1;
