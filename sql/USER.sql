create table USER
(
	PK_USER_ID int auto_increment comment '主键ID',
	USER_NAME VARCHAR(256) not null comment '用户名',
	PASSWORD VARCHAR(256) not null comment '密码',
	REMARK VARCHAR(512) null comment '备注',
	constraint USER_pk
		primary key (PK_USER_ID)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1
comment '用户表';

