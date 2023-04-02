SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `blog_article`
-- ----------------------------
DROP TABLE IF EXISTS `blog_article`;
CREATE TABLE `blog_article` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `title` varchar(64) NOT NULL UNIQUE COMMENT '文章标题',
  `body_id` bigint(20) NOT NULL COMMENT '文章体', 
  `description` varchar(255) DEFAULT NULL COMMENT '文章摘要',
  `author_id` bigint(20) NOT NULL COMMENT '作者', 
  `category_id` bigint(20) NOT NULL COMMENT '专栏ID',
  `image` varchar(200) DEFAULT NULL COMMENT '文章封面',
  
  `view_counts` int(11) DEFAULT NULL COMMENT '浏览数', 
  `comment_counts` int(11) DEFAULT NULL COMMENT '评论数',
  `article_weight` int(11) DEFAULT NULL COMMENT '文章权重,比如置顶',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `is_deleted` int(1) NOT NULL DEFAULT 0 COMMENT '是否删除,0表示不删除',
   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文章管理';

-- ----------------------------
--  Table structure for `blog_article_body`
-- ----------------------------
DROP TABLE IF EXISTS `blog_article_body`;
CREATE TABLE `blog_article_body` (
  `id` bigint(20) NOT NULL COMMENT '文章体ID',
  `content` longtext COMMENT '文章内容',
  `content_html` longtext COMMENT '文章内容的HTML',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='文章体';

-- ----------------------------
--  Table structure for `blog_tag`
-- ----------------------------
DROP TABLE IF EXISTS `blog_tag`;
CREATE TABLE `blog_tag` (
  `id` bigint(20) NOT NULL COMMENT '标签ID',
  `image` varchar(200) DEFAULT NULL COMMENT '标签图片',
  `tag_name` varchar(64) NOT NULL UNIQUE COMMENT '标签名', 
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='标签管理';

-- ----------------------------
--  Table structure for `blog_article_tag`
-- ----------------------------
DROP TABLE IF EXISTS `blog_article_tag`;
CREATE TABLE `blog_article_tag` (
  `id` bigint(20) NOT NULL COMMENT '标签-文章',
  `article_id` bigint(20) NOT NULL COMMENT '文章ID', 
  `tag_id` bigint(20) NOT NULL COMMENT '标签ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='标签-文章对管理';
 
-- ----------------------------
--  Table structure for `blog_category`
-- ----------------------------
DROP TABLE IF EXISTS `blog_category`;
CREATE TABLE `blog_category` (
  `id` bigint(20) NOT NULL COMMENT '专栏分类ID', 
  `category_name` varchar(64) NOT NULL UNIQUE COMMENT '专栏名称',
  `description` varchar(255) DEFAULT NULL COMMENT '专栏描述',
  `image` varchar(200) DEFAULT NULL COMMENT '专栏图片',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父专栏ID',
  `level` varchar(1) DEFAULT NULL COMMENT '专栏层级',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='专栏管理';

-- ----------------------------
--  Table structure for `blog_comment`
-- ----------------------------
DROP TABLE IF EXISTS `blog_comment`;
CREATE TABLE `blog_comment` (
  `id` bigint(20) NOT NULL COMMENT '评论ID', 
  `content` varchar(255) NOT NULL COMMENT '评论内容',  
  `create_time` datetime NOT NULL COMMENT '评论创建时间',
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `level` varchar(1) DEFAULT NULL COMMENT '评论层级',
  `parent_id` bigint(20) DEFAULT NULL COMMENT '父评论ID',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `to_uid` bigint(20) DEFAULT NULL COMMENT '被评论者ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='评论管理';

-- ----------------------------
--  Table structure for `sys_user`
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `account` varchar(64) DEFAULT NULL UNIQUE COMMENT '账号名称',
  `admin` bit(1) NOT NULL DEFAULT 0 COMMENT '是否管理员,默认不是管理员',
  `avatar` varchar(255) DEFAULT NULL COMMENT '账号图像',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `is_deleted` bit(1) NOT NULL DEFAULT 0 COMMENT '是否删除',
  
  `email` varchar(128) DEFAULT NULL UNIQUE COMMENT '邮件地址',
  `last_login` datetime DEFAULT NULL COMMENT '上次登录',
  `mobile_phone_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `salt` varchar(255) DEFAULT NULL COMMENT '盐',
  `status` varchar(255) DEFAULT NULL COMMENT '账号状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='账号管理';

-- ----------------------------
--  Table structure for `sys_log`
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` bigint(20) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `ip` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `method` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `module` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `nickname` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `operation` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `params` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `time` bigint(20) DEFAULT NULL,
  `userid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='日志管理';