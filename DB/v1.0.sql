CREATE TABLE `oss_upload` (
  `id` bigint(20) unsigned NOT NULL COMMENT '主键',
  `name` varchar(128) DEFAULT '' COMMENT '名称',
  `md5` varchar(256) DEFAULT '' COMMENT 'md5值',
  `download_url` varchar(256) DEFAULT '' COMMENT '下载url',
  `user_id` bigint(20) unsigned not null COMMENT '用户id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime not null COMMENT '更新时间',
  `updated_by` varchar(128) DEFAULT NULL COMMENT '操作人',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '文件上传列表';



CREATE TABLE `user` (
  `id` bigint(20) unsigned not null COMMENT '主键',
  `nick_name` varchar(128) DEFAULT '' COMMENT '用户昵称',
  `user_name` varchar(128) NOT NULL COMMENT '用户名',
  `password` varchar(256) DEFAULT NULL COMMENT '用户密码',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `updated_by` varchar(128) DEFAULT NULL COMMENT '操作人',
  primary key (`id`),
  KEY `idx_user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '用户表';
