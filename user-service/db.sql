CREATE SCHEMA `user`;

CREATE TABLE `user`.`user`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `code`         VARCHAR(45)  NOT NULL,
    `name`         VARCHAR(145) NOT NULL,
    `username`     VARCHAR(45)  NOT NULL,
    `email`        VARCHAR(145) NOT NULL,
    `role`         BIGINT       NOT NULL,
    `password`     VARCHAR(145) NOT NULL,
    `created_by`   VARCHAR(45)  NOT NULL,
    `created_time` DATETIME     NOT NULL DEFAULT NOW(),
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `username_UNIQUE` (`username` ASC) VISIBLE,
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
    UNIQUE INDEX `password_UNIQUE` (`password` ASC) VISIBLE,
);
