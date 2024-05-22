CREATE SCHEMA `user`;

CREATE TABLE `user`.`user`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(145) NOT NULL,
    `code`         VARCHAR(45)  NOT NULL,
    `birth_day`    DATETIME     NOT NULL,
    `phone`        VARCHAR(45)  NOT NULL,
    `status`       BIGINT       NOT NULL,
    `email`        VARCHAR(145) NOT NULL,
    `role`         BIGINT       NOT NULL,
    `password`     VARCHAR(145) NOT NULL,
    `created_by`   VARCHAR(45)  NOT NULL,
    `created_time` DATETIME     NOT NULL DEFAULT NOW(),
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `phone_UNIQUE` (`phone` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
    UNIQUE INDEX `password_UNIQUE` (`password` ASC) VISIBLE,
);
