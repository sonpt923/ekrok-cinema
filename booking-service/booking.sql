CREATE SCHEMA `booking`;

CREATE TABLE `booking`.`type_ticket`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `code`         VARCHAR(45)  NOT NULL,
    `name`         VARCHAR(145) NOT NULL,
    `status`       BIGINT       NOT NULL,
    `note`         VARCHAR(145) NOT NULL,
    `price`        DECIMAL      NOT NULL,
    `created_by`   VARCHAR(45) NULL,
    `created_time` DATETIME     NOT NULL,
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME     NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
);
