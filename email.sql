/*
Navicat MySQL Data Transfer

Source Server         : jdbc
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : email

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-03-06 16:16:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminID` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员ID',
  `name` varchar(64) DEFAULT NULL,
  `passward` varchar(64) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for admin_permissions
-- ----------------------------
DROP TABLE IF EXISTS `admin_permissions`;
CREATE TABLE `admin_permissions` (
  `adminPerID` int(16) NOT NULL AUTO_INCREMENT,
  `adminID` int(16) DEFAULT NULL,
  `permissions_id` int(16) DEFAULT NULL,
  PRIMARY KEY (`adminPerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_permissions
-- ----------------------------

-- ----------------------------
-- Table structure for annex
-- ----------------------------
DROP TABLE IF EXISTS `annex`;
CREATE TABLE `annex` (
  `annexID` int(12) NOT NULL AUTO_INCREMENT,
  `annexName` varchar(200) DEFAULT NULL COMMENT '附件名称',
  `annexAddr` varchar(200) DEFAULT NULL COMMENT '附件地址',
  `annexSign` varchar(32) DEFAULT NULL COMMENT '附件标识',
  `size` int(10) DEFAULT NULL COMMENT '附件类型',
  `big` varchar(0) DEFAULT NULL COMMENT '大小',
  PRIMARY KEY (`annexID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of annex
-- ----------------------------

-- ----------------------------
-- Table structure for permissions
-- ----------------------------
DROP TABLE IF EXISTS `permissions`;
CREATE TABLE `permissions` (
  `permissionsID` int(12) NOT NULL AUTO_INCREMENT,
  `img` varchar(64) DEFAULT NULL,
  `name` varchar(60) DEFAULT NULL COMMENT '权限名称',
  `log` varchar(100) DEFAULT NULL COMMENT '日志',
  PRIMARY KEY (`permissionsID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permissions
-- ----------------------------

-- ----------------------------
-- Table structure for receive_email
-- ----------------------------
DROP TABLE IF EXISTS `receive_email`;
CREATE TABLE `receive_email` (
  `receiveEmailID` int(10) NOT NULL AUTO_INCREMENT,
  `userPhone` varchar(30) DEFAULT NULL COMMENT '收信人Phone',
  `sendPhone` varchar(30) DEFAULT NULL COMMENT '发送人Phone',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `message` longtext COMMENT '正文',
  `isRead` int(2) DEFAULT '0' COMMENT '是否被读',
  `isDel` int(2) DEFAULT '0' COMMENT '是否删除',
  `isSave` int(2) DEFAULT '0' COMMENT '是否保存',
  `sendTime` datetime DEFAULT NULL COMMENT '发送时间',
  `sign` varchar(32) DEFAULT NULL COMMENT '来往信件标记',
  `type` int(11) DEFAULT NULL COMMENT 'email类型',
  PRIMARY KEY (`receiveEmailID`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of receive_email
-- ----------------------------
INSERT INTO `receive_email` VALUES ('1', '18883993870', '18883993871', '你好', '<p>414141<img src=\"/ueditor/jsp/upload/image/20180131/1517386083933004478.jpg\" title=\"1517386083933004478.jpg\" alt=\"1517362624878099879.jpg\"/><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p>', '1', '0', '0', '2018-01-31 16:08:11', '1', null);
INSERT INTO `receive_email` VALUES ('3', '18883993870', '18883993870', '拟好', '<p>4545</p>', '1', '1', '0', '2018-01-31 16:11:41', null, null);
INSERT INTO `receive_email` VALUES ('4', '18883993471', '18883993870', '我擦', '<p>4545</p>', '0', '0', '0', '2018-01-31 16:11:41', null, null);
INSERT INTO `receive_email` VALUES ('5', '18883993741', '18883993870', '你好', '<p>水水水水<img src=\"/ueditor/jsp/upload/image/20180131/1517387082537070061.jpg\" title=\"1517387082537070061.jpg\" alt=\"1517383974715019685.jpg\"/><img src=\"http://img.baidu.com/hi/babycat/C_0006.gif\"/></p>', '0', '0', '0', '2018-01-31 16:24:49', null, null);
INSERT INTO `receive_email` VALUES ('6', '18883993870', '18883993870', '你好', '<p>水水水水<img src=\"/ueditor/jsp/upload/image/20180131/1517387082537070061.jpg\" title=\"1517387082537070061.jpg\" alt=\"1517383974715019685.jpg\"/><img src=\"http://img.baidu.com/hi/babycat/C_0006.gif\"/></p>', '1', '1', '0', '2018-01-31 16:24:49', null, null);
INSERT INTO `receive_email` VALUES ('12', '18883993871', '18883993870', '回复主题: 你好', '<p>1111</p>', '0', '0', '0', '2018-02-08 10:27:13', '1', null);
INSERT INTO `receive_email` VALUES ('14', '809945250', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:24:18', 'e161168fa59a492bad3f0f8374ab5b68', null);
INSERT INTO `receive_email` VALUES ('16', '809945250', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:31:49', '2b7bcca4e91c4d2dbbacd5edd4bc1f39', null);
INSERT INTO `receive_email` VALUES ('17', '18883993870', '18883993870', '', '', '1', '1', '0', '2018-02-28 09:37:58', '55ad5417d1a4417499c3b9d04196a752', null);
INSERT INTO `receive_email` VALUES ('18', '18883993871', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:37:58', '55ad5417d1a4417499c3b9d04196a752', null);
INSERT INTO `receive_email` VALUES ('20', '18883993871', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:38:24', '320e528fb52447f09c5583030325cc85', null);
INSERT INTO `receive_email` VALUES ('21', '18883993870', '18883993870', 'hello', '<p>1111</p>', '1', '0', '0', '2018-02-28 09:54:26', '6c2c01589fa54bce90d23202f45dfada', null);
INSERT INTO `receive_email` VALUES ('22', '18883993871', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:54:26', '6c2c01589fa54bce90d23202f45dfada', null);
INSERT INTO `receive_email` VALUES ('23', '18883993872', '18883993870', '', '', '0', '0', '0', '2018-02-28 09:54:26', '6c2c01589fa54bce90d23202f45dfada', null);
INSERT INTO `receive_email` VALUES ('24', '18883993870', '18883993870', '', '', '1', '0', '0', '2018-02-28 09:54:32', 'b21aef103c8f4628a227ff8748f079bd', null);
INSERT INTO `receive_email` VALUES ('25', '18883993870', '18883993870', '', '', '1', '0', '0', '2018-02-28 09:56:13', 'f84ad5f7e200452ba429963dcbafe698', null);
INSERT INTO `receive_email` VALUES ('26', '18883993870', '18883993870', null, '', '0', '0', '0', '2018-02-28 14:35:22', '4f7bd6a4dd574bf9a5bf0f03881a4a36', null);
INSERT INTO `receive_email` VALUES ('27', '18883993870', '18883993870', '', '', '1', '1', '0', '2018-03-01 11:33:04', 'aed99b9919074c7f90b35d40f8e755ac', null);
INSERT INTO `receive_email` VALUES ('29', '18883993870', '18883993870', null, '', '1', '1', '0', '2018-03-01 14:58:09', 'f55bad943bea4fed9cea23bfc8bce968', null);
INSERT INTO `receive_email` VALUES ('30', '18797819797', '18883993870', null, '', '0', '0', '0', '2018-03-01 14:58:09', 'f55bad943bea4fed9cea23bfc8bce968', null);
INSERT INTO `receive_email` VALUES ('32', '18883993540', '18883993870', null, '<p>你好</p>', '0', '0', '0', '2018-03-01 15:12:23', '11b2a7986d144f609e78d254d1b2444a', null);
INSERT INTO `receive_email` VALUES ('33', '18883993681', '18883993870', '111', '<p style=\"line-height: 16px;\"><br/></p><p>1111<br/></p>', '0', '0', '0', '2018-03-01 15:29:42', '3f4881962844499087693d7845e3f136', null);
INSERT INTO `receive_email` VALUES ('34', '18883993681', '18883993870', '111', '<p>1111</p>', '0', '0', '0', '2018-03-01 15:38:10', '6a918112612343b2a85ca2c6c62b233b', null);
INSERT INTO `receive_email` VALUES ('35', '18883993681', '18883993870', '111', '<p style=\"line-height: 16px;\"><img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519890487624047310/新建文本文档.txt\" title=\"新建文本文档.txt\">新建文本文档.txt</a></p><p>11111<br/></p>', '0', '0', '0', '2018-03-01 15:48:12', '2980af467fd941d99d9dc2fcf5bea42e', null);
INSERT INTO `receive_email` VALUES ('36', '18883993870', '18883993870', '111', '<p>转发邮件</p><p>发件人: 18883993871@193.com;</p><p>邮件内容:</p><p>414141<img src=\"/ueditor/jsp/upload/image/20180131/1517386083933004478.jpg\" title=\"1517386083933004478.jpg\" alt=\"1517362624878099879.jpg\"/><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p><hr/><p>转发邮件</p><p>发件人: 18883993870@193.com;</p><p>邮件内容:</p><p>1111</p><hr/><p><br/></p>', '0', '0', '0', '2018-03-02 15:45:09', 'e8a594ed829a45b88219401e95041cf1', null);

-- ----------------------------
-- Table structure for send_email
-- ----------------------------
DROP TABLE IF EXISTS `send_email`;
CREATE TABLE `send_email` (
  `sendEmailID` int(10) NOT NULL AUTO_INCREMENT,
  `userID` int(12) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `message` longtext COMMENT '正文',
  `isSuccess` int(2) DEFAULT '0' COMMENT '发送状态 1成功 2失败',
  `isDel` int(2) DEFAULT '0' COMMENT '是否被删除 1被删除 ',
  `isSave` int(2) DEFAULT '0' COMMENT '是否保存至草稿箱 1保存',
  `sendTime` datetime DEFAULT NULL COMMENT '发送时间',
  `receivePerson` varchar(200) DEFAULT NULL COMMENT '收信人',
  `sign` varchar(32) DEFAULT NULL COMMENT '来往件标识',
  PRIMARY KEY (`sendEmailID`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of send_email
-- ----------------------------
INSERT INTO `send_email` VALUES ('3', '9', '123456', '<p>11</p>', '0', '0', '0', '2018-01-31 10:18:38', '18883993681@179.com;18883994546@179.com;', null);
INSERT INTO `send_email` VALUES ('4', '9', '拟好', '<p>君子</p>', '0', '1', '0', '2018-01-31 10:35:17', '18883993877@193.com', null);
INSERT INTO `send_email` VALUES ('5', '9', '4444', '<p>1111</p>', '0', '0', '0', '2018-01-31 14:44:52', '18883993871@179.com;1986583471@179.com;1878951234@179.com;', null);
INSERT INTO `send_email` VALUES ('7', '9', '14234', '<p>147</p>', '0', '0', '0', '2018-01-31 14:55:28', '18883993870@193.com;18883993870@193.com;', null);
INSERT INTO `send_email` VALUES ('8', '9', '123', '<p>1234</p>', '0', '0', '0', '2018-01-31 14:58:46', '18883993870@193.com;18883993870@193.com;', null);
INSERT INTO `send_email` VALUES ('9', '9', '123', '<p>1234</p>', '0', '0', '0', '2018-01-31 15:00:04', '18883993870@193.com;18883993870@193.com;', null);
INSERT INTO `send_email` VALUES ('10', '9', '123', '<p>1234</p>', '0', '0', '0', '2018-01-31 15:00:46', '18883993870@193.com;18883993870@193.com;', null);
INSERT INTO `send_email` VALUES ('12', '9', '12346', '<p>111</p>', '0', '0', '0', '2018-01-31 15:04:12', '18883993870@193.com;18883993870@193.com;', null);
INSERT INTO `send_email` VALUES ('13', '9', '44444', '<p>44444<img src=\"/ueditor/jsp/upload/image/20180131/1517383974715019685.jpg\" title=\"1517383974715019685.jpg\" alt=\"1517362624878099879.jpg\"/></p>', '0', '0', '0', '2018-01-31 15:32:57', '18883993870@193.com;18886586510@193.com;', null);
INSERT INTO `send_email` VALUES ('14', '9', '4141', '<p>414141<img src=\"/ueditor/jsp/upload/image/20180131/1517386083933004478.jpg\" title=\"1517386083933004478.jpg\" alt=\"1517362624878099879.jpg\"/><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p>', '0', '0', '0', '2018-01-31 16:08:11', '18883993874@193.com;18883993475@193.com;', null);
INSERT INTO `send_email` VALUES ('16', '9', '你好', '<p>水水水水<img src=\"/ueditor/jsp/upload/image/20180131/1517387082537070061.jpg\" title=\"1517387082537070061.jpg\" alt=\"1517383974715019685.jpg\"/><img src=\"http://img.baidu.com/hi/babycat/C_0006.gif\"/></p>', '0', '1', '1', '2018-01-31 16:24:49', '18883993741@193.com;18883993471@193.com', null);
INSERT INTO `send_email` VALUES ('21', '9', '回复主题: 你好', '<p>1</p>', '0', '0', '0', '2018-02-08 10:14:34', '18883993871@193.com', '1');
INSERT INTO `send_email` VALUES ('22', '9', '回复主题: 你好', '<p>1111</p>', '0', '0', '0', '2018-02-08 10:27:13', '18883993871@193.com', '1');
INSERT INTO `send_email` VALUES ('23', '1', '222', '2222', '0', '0', '0', null, null, null);
INSERT INTO `send_email` VALUES ('24', '9', '', '', '0', '0', '0', '2018-02-28 09:11:44', '18883993681@193.com;', 'aae857a7537744bb83525a1122fb87be');
INSERT INTO `send_email` VALUES ('25', '9', '', '', '0', '0', '0', '2018-02-28 09:18:55', '18883993870@193.com;', '3cf75e34a0784976b4a181d57615f29e');
INSERT INTO `send_email` VALUES ('26', '9', '', '', '0', '0', '0', '2018-02-28 09:20:34', '18883993870@193.com;', '30ca583e89394db7b68ea879f6afb9c3');
INSERT INTO `send_email` VALUES ('27', '9', '', '', '0', '0', '0', '2018-02-28 09:24:18', '18883993870@193.com;809945250@193.com;', 'e161168fa59a492bad3f0f8374ab5b68');
INSERT INTO `send_email` VALUES ('28', '9', '', '', '0', '0', '0', '2018-02-28 09:31:49', '18883993870@193.com;809945250@193.com;', '2b7bcca4e91c4d2dbbacd5edd4bc1f39');
INSERT INTO `send_email` VALUES ('29', '9', '', '', '0', '0', '0', '2018-02-28 09:32:16', '18883993870@193.com;', 'b53e69abd23c408781d8720b9d193a98');
INSERT INTO `send_email` VALUES ('30', '9', '', '', '0', '0', '0', '2018-02-28 09:33:08', '18883993870@193.com;', '421c1240251941a28d4c7f3525b1b75c');
INSERT INTO `send_email` VALUES ('31', '9', '', '', '0', '0', '0', '2018-02-28 09:37:58', '18883993870@193.com;18883993871@qq.com;18883993851@193.com;', '55ad5417d1a4417499c3b9d04196a752');
INSERT INTO `send_email` VALUES ('32', '9', '', '', '0', '0', '0', '2018-02-28 09:38:24', '18883993870@193.com;18883993871@193.com;18883993851@193.com;', '320e528fb52447f09c5583030325cc85');
INSERT INTO `send_email` VALUES ('33', '9', '', '', '0', '0', '0', '2018-02-28 09:44:48', '18883993870@193.com;809945250@193.com;188839415112@193.com;', 'd0f1685538b14fee937c4a6b19f285d0');
INSERT INTO `send_email` VALUES ('34', '9', '', '', '0', '0', '0', '2018-02-28 09:48:29', '18883993870@193.com;809945250@193.com;188839415112@193.com;', '6fe5d5d27af94c8a80f02a706f28fc5b');
INSERT INTO `send_email` VALUES ('35', '9', '', '', '0', '0', '0', '2018-02-28 09:54:26', '18883993870@193.com;18883993871@193.com;18883993872@193.com;', '6c2c01589fa54bce90d23202f45dfada');
INSERT INTO `send_email` VALUES ('36', '9', '', '', '0', '0', '0', '2018-02-28 09:54:32', '18883993870@193.com;', 'b21aef103c8f4628a227ff8748f079bd');
INSERT INTO `send_email` VALUES ('37', '9', '', '', '0', '0', '0', '2018-02-28 09:56:13', '18883993870@193.com;', 'f84ad5f7e200452ba429963dcbafe698');
INSERT INTO `send_email` VALUES ('38', '9', null, '', '0', '0', '0', '2018-02-28 14:34:17', null, '8ca3e2b5aeb345b3b56cf4a1e52728d6');
INSERT INTO `send_email` VALUES ('39', '9', null, '', '0', '0', '0', '2018-02-28 14:35:22', '18883993870@193.com;', '4f7bd6a4dd574bf9a5bf0f03881a4a36');
INSERT INTO `send_email` VALUES ('40', '9', null, '', '0', '0', '0', '2018-03-01 09:38:37', '', '79c6889614d348c4bcd532d490e6c895');
INSERT INTO `send_email` VALUES ('41', '9', '', '', '0', '0', '0', '2018-03-01 11:33:04', '18883993870@193.com;', 'aed99b9919074c7f90b35d40f8e755ac');
INSERT INTO `send_email` VALUES ('42', '9', null, '', '0', '0', '0', '2018-03-01 14:57:03', '18883993870@193.com;1879789797@193.com;', '3ebc30c0b8b4431e8719e254f6b41d3f');
INSERT INTO `send_email` VALUES ('43', '9', null, '', '0', '0', '0', '2018-03-01 14:58:09', '18883993870@193.com;18797819797@193.com;', 'f55bad943bea4fed9cea23bfc8bce968');
INSERT INTO `send_email` VALUES ('44', null, null, '<p>115665</p>', '0', '0', '1', null, '18883993870@193.com;18797819797@193.com;', null);
INSERT INTO `send_email` VALUES ('45', '9', null, '<p>你好</p>', '0', '0', '0', '2018-03-01 15:12:23', '18883993870@193.com;18883993540@193.com;', '11b2a7986d144f609e78d254d1b2444a');
INSERT INTO `send_email` VALUES ('46', '9', null, '<p>你好</p>', '0', '0', '1', '2018-03-01 15:12:36', '18883993870@193.com;18883993540@193.com;', '9b390c4729464c86a0ff26c8c26f3652');
INSERT INTO `send_email` VALUES ('47', '9', '111', '<p style=\"line-height: 16px;\"><img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519889250400091517/新建文本文档.txt\" title=\"新建文本文档.txt\">新建文本文档.txt</a></p><p>1111<br/></p>', '0', '0', '0', '2018-03-01 15:29:31', '18883993681@179.com;18883994546@179.com;', '00c5417cc3a5435088f24c4d0bea1163');
INSERT INTO `send_email` VALUES ('48', '9', '111', '<p style=\"line-height: 16px;\"><br/></p><p>1111<br/></p>', '0', '0', '0', '2018-03-01 15:29:42', '18883993681@179.com;18883994546@179.com;', '3f4881962844499087693d7845e3f136');
INSERT INTO `send_email` VALUES ('49', '9', '111', '<p style=\"line-height: 16px;\"><img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519889408002067496/复习.xlsx\" title=\"复习.xlsx\">复习.xlsx</a></p><p>1111<br/></p>', '0', '0', '0', '2018-03-01 15:30:11', '18883993681@179.com;18883994546@179.com;', '0dd4c5ebbb8643bea550f89b2d319645');
INSERT INTO `send_email` VALUES ('50', '9', '111', '<p>1111</p>', '0', '0', '0', '2018-03-01 15:38:10', '18883993681@179.com;18883994546@179.com;', '6a918112612343b2a85ca2c6c62b233b');
INSERT INTO `send_email` VALUES ('51', '9', '111', '<p>1111</p><p style=\"line-height: 16px;\"><img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519889900250046368/新建文本文档.txt\" title=\"新建文本文档.txt\">新建文本文档.txt</a></p><p><br/></p>', '0', '0', '0', '2018-03-01 15:38:45', '18883993681@179.com;18883994546@179.com;', 'e3a9214e27444722bb7e69f44781b64c');
INSERT INTO `send_email` VALUES ('52', '9', '111', '<p>\n    1111\n</p>\n<p style=\"line-height: 16px;\">\n    <img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519889900250046368/新建文本文档.txt\" title=\"新建文本文档.txt\">新建文本文档.txt</a>\n</p>\n<p>\n    <br/>\n</p>', '0', '0', '0', '2018-03-01 15:46:26', '18883993681@179.com;18883994546@179.com;', '4a6b25d52c354ee397d0ae145bd421fe');
INSERT INTO `send_email` VALUES ('53', '9', '111', '<p style=\"line-height: 16px;\"><img src=\"/utf8-jsp/dialogs/attachment/fileTypeImages/icon_txt.gif\"/><a style=\"font-size:12px; color:#0066cc;\" href=\"/ueditor/jsp/upload/file/20180301/1519890487624047310/新建文本文档.txt\" title=\"新建文本文档.txt\">新建文本文档.txt</a></p><p>11111<br/></p>', '0', '0', '0', '2018-03-01 15:48:12', '18883993681@179.com;18883994546@179.com;', '2980af467fd941d99d9dc2fcf5bea42e');
INSERT INTO `send_email` VALUES ('54', '9', '111', '<p>转发邮件</p><p>发件人: 18883993871@193.com;</p><p>邮件内容:</p><p>414141<img src=\"/ueditor/jsp/upload/image/20180131/1517386083933004478.jpg\" title=\"1517386083933004478.jpg\" alt=\"1517362624878099879.jpg\"/><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p><hr/><p>转发邮件</p><p>发件人: 18883993870@193.com;</p><p>邮件内容:</p><p>1111</p><hr/><p><br/></p>', '0', '0', '0', '2018-03-02 15:45:09', '18883993870@193.com;', 'e8a594ed829a45b88219401e95041cf1');
INSERT INTO `send_email` VALUES ('55', '9', '111', '<p>转发邮件</p><p>发件人: 18883993871@193.com;</p><p>邮件内容:</p><p>414141<img src=\"/ueditor/jsp/upload/image/20180131/1517386083933004478.jpg\" title=\"1517386083933004478.jpg\" alt=\"1517362624878099879.jpg\"/><img src=\"http://img.baidu.com/hi/jx2/j_0049.gif\"/></p><hr/><p>转发邮件</p><p>发件人: 18883993870@193.com;</p><p>邮件内容:</p><p>1111</p><hr/><p>188</p>', '0', '0', '1', '2018-03-02 15:46:52', '18883993871@193.com;', 'ff94fb7cbd984d70abed4597a51d4a2c');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userID` int(10) NOT NULL AUTO_INCREMENT COMMENT 'UUID',
  `name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `head_portrait` varchar(255) DEFAULT NULL COMMENT '头像',
  `password` varchar(60) DEFAULT NULL COMMENT '密码',
  `isvoid` int(2) DEFAULT '0' COMMENT '状态0可用,1被冻结',
  `phone` varchar(22) DEFAULT NULL COMMENT '电话',
  `question` varchar(86) DEFAULT NULL COMMENT '密保问题',
  `answer` varchar(86) DEFAULT NULL COMMENT '密保答案',
  `log` varchar(255) DEFAULT NULL COMMENT '日志',
  `complaint_count` int(15) DEFAULT '0' COMMENT '举报数',
  `login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '小小1', null, '\"123qaz\"', '0', '18883993872', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('2', '小小2', null, '\"123qaz\"', '0', '18883993681', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('3', '小小3', null, 'AE005CEB7E9A217CCED2F8AA354187C7', '0', '18883993781', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('4', '小4', null, 'AE005CEB7E9A217CCED2F8AA354187C7', '0', '18883444562', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('5', '小小5', null, '3F885B617AD0FB7102ABB4F0475436FF', '0', '18883544514', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('6', '小小6', null, '9808F5C522076B61CA4ECC861EADD584', '0', '25151515151', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('7', '小7', null, '30EBA06EFD19B1866019979E72842FF7', '0', '17773262255', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('8', '小小8', null, '30EBA06EFD19B1866019979E72842FF7', '0', '17512561511', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('9', '周咲', null, 'E10ADC3949BA59ABBE56E057F20F883E', '0', '18883993870', null, null, null, '0', null, null);
INSERT INTO `user` VALUES ('12', null, null, 'E10ADC3949BA59ABBE56E057F20F883E', '0', '18324128508', null, null, null, '0', null, null);

-- ----------------------------
-- Table structure for user_black
-- ----------------------------
DROP TABLE IF EXISTS `user_black`;
CREATE TABLE `user_black` (
  `userBlackID` int(10) NOT NULL,
  `user_id` int(10) DEFAULT NULL,
  `black_id` int(10) DEFAULT NULL COMMENT '黑名单ID',
  PRIMARY KEY (`userBlackID`),
  KEY `black_id` (`black_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_black
-- ----------------------------

-- ----------------------------
-- Table structure for user_friend
-- ----------------------------
DROP TABLE IF EXISTS `user_friend`;
CREATE TABLE `user_friend` (
  `userFriendID` int(12) NOT NULL AUTO_INCREMENT,
  `userID` int(12) DEFAULT NULL,
  `friendPhone` varchar(32) DEFAULT NULL,
  `friendName` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`userFriendID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_friend
-- ----------------------------
INSERT INTO `user_friend` VALUES ('1', '9', '18797897972', '咲咲');
INSERT INTO `user_friend` VALUES ('4', '9', '18883993870', '你好');
