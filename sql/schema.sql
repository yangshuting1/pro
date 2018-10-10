create database `sugar` default character set utf8mb4 default collate utf8mb4_general_ci;
use sugar;

create table `category` (
  `id` bigint unsigned not null primary key auto_increment comment 'id',
  `name` varchar(100) not null default '' comment 'category name',
  `super_category_id` bigint unsigned not null default 0 comment 'super category id',
  `deleted` tinyint unsigned not null default 0 comment 'deleted status: 1 deleted',
  `create_time` timestamp not null default '2000-01-01 00:00:00' comment 'create time',
  `update_time` timestamp not null default current_timestamp on update current_timestamp comment 'update time',
  unique key uk_category(`name`,`super_category_id`)
)engine=innodb default charset=utf8mb4 collate=utf8mb4_general_ci comment 'category sheet';


insert into category(name,super_category_id) VALUE ('root',0);
insert into category(name,super_category_id) VALUE ('1-1',1);
insert into category(name,super_category_id) VALUE ('1-2',1);
insert into category(name,super_category_id) VALUE ('1-1-1',2);
insert into category(name,super_category_id) VALUE ('1-1-1-1',4);


