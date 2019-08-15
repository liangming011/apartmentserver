create table apartment
(
  id         bigint      not null
    primary key,
  userid     varchar(45) null comment '租户id',
  house_type varchar(45) null comment '户型',
  room_area  varchar(45) null comment '房间面积',
  face       varchar(45) null comment '朝向',
  price      varchar(45) null comment '对外标价',
  pattern    varchar(45) null comment '支付模式（如押一付一）',
  address    varchar(45) null comment '公寓地址',
  status     varchar(45) null comment '状态'
)
  comment '公寓信息' charset = utf8;


create table apartment_user
(
  id        bigint      not null
    primary key,
  name      varchar(45) null comment '姓名',
  sex       varchar(45) null comment '性别',
  phone     varchar(45) null comment '电话
',
  id_number varchar(45) null comment '证件号',
  id_type   varchar(45) null comment '证件类型',
  is_live   varchar(45) null comment '居住状态'
)
  comment '租户信息' charset = utf8;


create table file
(
  id        bigint      not null
    primary key,
  file_name varchar(45) null comment '文件名字',
  resource  varchar(45) null comment '文件地址',
  file_type varchar(45) null comment '文件类型',
  belong_to varchar(45) null comment '所属表id'
)
  comment '文件表' charset = utf8;


create table repairs
(
  id           bigint      not null
    primary key,
  userid       varchar(45) null comment '租户id',
  status       varchar(45) null comment '报修状态',
  content      varchar(45) null comment '文本描述内容',
  create_time  date        null comment '创建时间',
  conduct_time date        null comment '处理时间',
  has_file     int         null comment '是否有文件'
)
  comment '报修表' charset = utf8;


create table ums_admin
(
  id          bigint auto_increment
    primary key,
  username    varchar(64)      null,
  password    varchar(64)      null,
  email       varchar(100)     null comment '邮箱',
  note        varchar(500)     null comment '备注信息',
  create_time datetime         null comment '创建时间',
  login_time  datetime         null comment '最后登录时间',
  status      int(1) default 1 null comment '帐号启用状态：0->禁用；1->启用'
)
  comment '后台用户表' charset = utf8;

INSERT INTO apartment.ums_admin (username, password, email, note, create_time, login_time, status) VALUES ('admin', '123456', 'liangming@qq.com', '系统管理员', '2019-10-08 13:32:47', '2019-03-20 15:38:50', 1);
create table ums_role
(
  id          bigint auto_increment
    primary key,
  name        varchar(100)     null comment '名称',
  value       varchar(500)     not null comment '权限',
  admin_count int              null comment '后台用户数量',
  create_time datetime         null comment '创建时间',
  status      int(1) default 1 null comment '启用状态：0->禁用；1->启用',
  sort        int    default 0 null,
  description varchar(500)     null comment '描述',
  admin_id    bigint           null comment '外键：管理员表 id'
)
  comment '后台用户角色表' charset = utf8;

INSERT INTO apartment.ums_role (name, value, admin_count, create_time, status, sort, description, admin_id) VALUES ('系统管理员', '/**', 0, '2019-09-30 15:46:11', 1, 0, '系统管理员', 1);