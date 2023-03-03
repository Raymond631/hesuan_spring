/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50739 (5.7.39-log)
 Source Host           : localhost:3306
 Source Schema         : hesuan

 Target Server Type    : MySQL
 Target Server Version : 50739 (5.7.39-log)
 File Encoding         : 65001

 Date: 03/03/2023 23:13:55
*/

CREATE
DATABASE IF NOT EXISTS hesuan;
USE
hesuan;
SET NAMES utf8mb4;
SET
FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for location
-- ----------------------------
CREATE TABLE IF NOT EXISTS `location`
(
    `queue_id` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列id',
    `lat` decimal
(
    10,
    7
) NOT NULL COMMENT '纬度',
    `lng` decimal
(
    10,
    7
) NOT NULL COMMENT '经度',
    `province` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '省',
    `city` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '市',
    `district` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '县',
    `address` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '详细地址，手动输入',
    `distance` int
(
    11
) NOT NULL COMMENT '允许签到范围',
    PRIMARY KEY
(
    `queue_id`
) USING BTREE
    ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for queue
-- ----------------------------
CREATE TABLE IF NOT EXISTS `queue`
(
    `id` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列编号',
    `name` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列名称',
    `start_day` date NOT NULL COMMENT '起始日期',
    `end_day` date NOT NULL COMMENT '截止日期',
    `username` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布者名称',
    `phone` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布者联系方式',
    `person_num` int
(
    11
) NOT NULL COMMENT '现场实际排队人数（签到人数）',
    PRIMARY KEY
(
    `id`
) USING BTREE
    ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for queue_record
-- ----------------------------
CREATE TABLE IF NOT EXISTS `queue_record`
(
    `id` int
(
    11
) NOT NULL AUTO_INCREMENT,
    `username` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `queue_id` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列id',
    `day` date NOT NULL COMMENT '预约日期',
    `time_id` int
(
    11
) NOT NULL COMMENT '预约时间段id',
    `status` int
(
    11
) NOT NULL COMMENT '0未签到、1已签到、2已失效、3已完成',
    PRIMARY KEY
(
    `id`
) USING BTREE
    ) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for time
-- ----------------------------
CREATE TABLE IF NOT EXISTS `time`
(
    `id` int
(
    11
) NOT NULL AUTO_INCREMENT,
    `queue_id` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列id，一个队列多个时间段',
    `start_time` time NOT NULL,
    `end_time` time NOT NULL,
    `max_num` int
(
    11
) NOT NULL COMMENT '最大预约人数',
    PRIMARY KEY
(
    `id`
) USING BTREE
    ) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Table structure for user
-- ----------------------------
CREATE TABLE IF NOT EXISTS `user`
(
    `username` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `password` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    `phone` varchar
(
    255
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
    PRIMARY KEY
(
    `username`
) USING BTREE
    ) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

SET
FOREIGN_KEY_CHECKS = 1;
