CREATE
DATABASE `user-service`;

CREATE TABLE `user-service`.`new_table`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT,
    `username`   VARCHAR(45)  NOT NULL,
    `full_name`  VARCHAR(145) NOT NULL,
    `birth_day`  DATE         NOT NULL,
    `created_by` VARCHAR(45)  NOT NULL,
    `created_at` DATETIME     NOT NULL,
    `updated_by` VARCHAR(45) NULL,
    `updated_at` DATETIME NULL,
    `deleted_at` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);
