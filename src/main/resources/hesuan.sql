/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : hesuan

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 10/03/2023 23:11:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for location
-- ----------------------------
DROP TABLE IF EXISTS `location`;
CREATE TABLE `location`  (
  `queue_id` int NOT NULL COMMENT '队列id',
  `lat` decimal(10, 7) NOT NULL COMMENT '纬度',
  `lng` decimal(10, 7) NOT NULL COMMENT '经度',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '省',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '市',
  `district` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '县',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '详细地址，手动输入',
  `distance` int NOT NULL COMMENT '允许签到范围',
  PRIMARY KEY (`queue_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of location
-- ----------------------------
INSERT INTO `location` VALUES (2, 28.1367030, 121.2319150, '浙江省', '台州市', '玉环市', '玉环市人民政府(东城路北)', 300);

-- ----------------------------
-- Table structure for queue
-- ----------------------------
DROP TABLE IF EXISTS `queue`;
CREATE TABLE `queue`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '队列编号',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '队列名称',
  `start_day` date NOT NULL COMMENT '起始日期',
  `end_day` date NOT NULL COMMENT '截止日期',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布者名称',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布者联系方式',
  `person_num` int NOT NULL COMMENT '现场实际排队人数（签到人数）',
  `num_update_time` datetime NULL DEFAULT NULL COMMENT '现场人数更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of queue
-- ----------------------------
INSERT INTO `queue` VALUES (2, '123456', '2023-01-31', '2023-02-01', 'test-01', '12345678900', 0, '2023-03-10 21:07:13');

-- ----------------------------
-- Table structure for queue_record
-- ----------------------------
DROP TABLE IF EXISTS `queue_record`;
CREATE TABLE `queue_record`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `queue_id` int NOT NULL COMMENT '队列id',
  `day` date NOT NULL COMMENT '预约日期',
  `time_id` int NOT NULL COMMENT '预约时间段id',
  `status` int NOT NULL COMMENT '0未签到、1已签到、2已失效、3已完成',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of queue_record
-- ----------------------------

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `queue_id` int NOT NULL COMMENT '队列id，一个队列多个时间段',
  `start_time` time NOT NULL,
  `end_time` time NOT NULL,
  `max_num` int NOT NULL COMMENT '最大预约人数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of time
-- ----------------------------
INSERT INTO `time` VALUES (11, 2, '08:00:00', '11:00:00', 200);
INSERT INTO `time` VALUES (12, 2, '14:00:00', '17:00:00', 150);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '腾讯服务器返回的用户id',
  `last_login_time` datetime NOT NULL COMMENT '最近的登录时间',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
