/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50519
Source Host           : localhost:3306
Source Database       : mybatis-plus

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2018-04-03 15:13:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `addTime` datetime DEFAULT NULL,
  `version` int(255) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '张三', '11', null, '1');
INSERT INTO `person` VALUES ('2', '张三', '11', '2018-03-30 16:09:26', '1');
INSERT INTO `person` VALUES ('3', '王五', '15', '2018-03-30 16:22:23', '1');

-- ----------------------------
-- Table structure for person1
-- ----------------------------
DROP TABLE IF EXISTS `person1`;
CREATE TABLE `person1` (
  `id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of person1
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL COMMENT '用户ID',
  `name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `age` int(3) DEFAULT NULL COMMENT '用户年龄',
  `type` tinyint(1) DEFAULT '0' COMMENT '0、禁用 1、正常',
  `ctime` datetime DEFAULT NULL COMMENT '自定义填充的创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户表';

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('974098539348602881', '张三', '15', '0', '2018-03-15 09:42:44');
INSERT INTO `sys_user` VALUES ('974103358733910017', '王五', '15', '0', '2018-03-15 10:01:53');
INSERT INTO `sys_user` VALUES ('974104067936190466', '张晓', '15', '0', '2018-03-15 10:04:42');
INSERT INTO `sys_user` VALUES ('974105964210339842', '海鲜', '15', '0', '2018-03-15 10:12:14');
INSERT INTO `sys_user` VALUES ('974123819559649282', '我也', '15', '0', '2018-03-15 11:23:11');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(11) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `ageEnum` int(11) DEFAULT NULL,
  `isDelete` tinyint(255) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('980625248575127554', '王五', '6', null, '0');
INSERT INTO `teacher` VALUES ('980625795218767874', '王五', '3', null, '0');
INSERT INTO `teacher` VALUES ('980627883134910466', '王五', '3', null, '1');
INSERT INTO `teacher` VALUES ('980707741617725442', null, '1', '1', '0');
