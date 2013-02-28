/*
MySQL Data Transfer
Source Host: localhost
Source Database: rss_system
Target Host: localhost
Target Database: rss_system
Date: 2013-2-25 17:59:56
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY  (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'wukong', '111111');
INSERT INTO `users` VALUES ('2', 'james', '123456');
