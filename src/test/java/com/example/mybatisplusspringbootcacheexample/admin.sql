CREATE TABLE `admin` (
                         `admin_id` int(11) NOT NULL AUTO_INCREMENT,
                         `admin_name` varchar(255) CHARACTER SET utf8 NOT NULL,
                         `status` int(11) NOT NULL,
                         `admin_pwd` varchar(255) CHARACTER SET utf8 NOT NULL COMMENT '管理员密码',
                         `real_name` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
                         `telephone` varchar(11) COLLATE utf8mb4_bin DEFAULT NULL,
                         `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
                         `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                         `center_id` int(11) DEFAULT NULL,
                         `admin_type` int(11) DEFAULT NULL,
                         `myDate` date DEFAULT NULL,
                         `adminlongcolumnismyxxxxxxxxxxxxx` int(11) DEFAULT NULL,
                         `cccccccc` int(11) DEFAULT NULL,
                         PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='管理员表'
