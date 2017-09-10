CREATE DATABASE IF NOT EXISTS `groupon` DEFAULT CHARACTER SET utf8mb4;
USE `groupon`;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `password` VARCHAR(45) NOT NULL ,
  `name` VARCHAR(45) NOT NULL ,
  `login_time` DATETIME NOT NULL ,
  `create_time` DATETIME NOT NULL ,
  `update_time` DATETIME NOT NULL ,
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`name`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4;

DROP TABLE IF EXISTS `order_basic`;

CREATE TABLE `order_basic` (
  `id` BIGINT(20)
)