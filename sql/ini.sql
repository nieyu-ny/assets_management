DROP DATABASE IF EXISTS judge_system;
--
-- Database: `judge_system`
--

-- --------------------------------------------------------
CREATE DATABASE assets_management
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;
-- GRANT ALL ON judge_system.* TO 'coolwenjs'@'localhost'
-- IDENTIFIED BY 'judge@system';
 GRANT ALL ON assets_management.* TO 'root'@'localhost'
 IDENTIFIED BY 'nieyu123456';

USE assets_management;

-- username:用户名
-- password:密码
-- enabled：权限
CREATE TABLE t_user (
  id       INT(11) PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(100),
  password VARCHAR(100),
  enabled INT(11)
);


INSERT INTO `t_user` (`id`, `username`, `enabled`, `password`) VALUES
  (1, 'abner', '1', '1233');
INSERT INTO `t_user` (`id`, `username`, `enabled`, `password`) VALUES
  (2, 'admin', '2', '1233');

-- role表
-- id
-- username:用户名
-- authority:权限
CREATE TABLE t_role (
  id       INT(11) PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(100),
  authority VARCHAR(100)
);
-- AssetCategory表
-- id
-- code_number:代码
-- type_name：类型

CREATE TABLE t_assetCategory (
  id       INT(11) PRIMARY KEY AUTO_INCREMENT,
  code_number VARCHAR(100),
  type_name VARCHAR(100)
);
-- Asset表
-- id
-- asset_name 资产名称
-- model 资产品牌型号
-- type_name 类型
-- code 编码
-- company 单位
-- number 数量
-- original_value 固定资产原值
-- acquisition_time 购置时间
-- operation 操作
-- storage_time 入库时间
-- actual_quantity 实盘数量
-- use_department 使用部门
-- person 负责人
-- region 地区
-- use_place 使用地点
-- responsible_department 负责部门
-- note 备注
-- damage_condition 损坏情况
CREATE TABLE t_asset (
  id       INT(11) PRIMARY KEY AUTO_INCREMENT,
  asset_name VARCHAR(100),
  model VARCHAR(100),
  type_name VARCHAR(100),
  code FLOAT,
  company VARCHAR(100),
  number INT(100),
  original_value INT(11),
  acquisition_time VARCHAR(100),
  operation VARCHAR(100),
  storage_time VARCHAR(100),
  actual_quantity INT(11),
  use_department VARCHAR(100),
  person VARCHAR(100),
  region VARCHAR(100),
  use_place VARCHAR(100),
  responsible_department VARCHAR(100),
  note VARCHAR(100),
  damage_condition VARCHAR(100)
);
