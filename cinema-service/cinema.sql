CREATE SCHEMA `cinema-service`;

CREATE TABLE `cinema-service`.`room`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(145) NOT NULL,
    `price`        DECIMAL      NOT NULL,
    `status`       BIGINT       NOT NULL,
    `created_time` DATETIME     NOT NULL default NOW(),
    `created_by`   VARCHAR(45)  NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);

CREATE TABLE `cinema-service`.`chair_type`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(145) NOT NULL,
    `status`       BIGINT       NOT NULL,
    `price`        DECIMAL      NOT NULL,
    `created_time` DATETIME     NOT NULL default NOW(),
    `created_by`   VARCHAR(45)  NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);

CREATE TABLE `cinema-service`.`chair`
(
    `id`            BIGINT      NOT NULL AUTO_INCREMENT,
    `id_room`       BIGINT      NOT NULL,
    `id_chair_type` BIGINT      NOT NULL,
    `name`          VARCHAR(45) NOT NULL,
    `status`        BIGINT      NOT NULL,
    `created_by`    VARCHAR(45) NOT NULL,
    `created_time`  DATETIME    NOT NULL,
    `updated_by`    VARCHAR(45) NULL,
    `updated_time`  DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    INDEX           `FK_CHAIR_CHAIRTYPE_idx` (`id_chair_type` ASC) VISIBLE,
    CONSTRAINT `FK_CHAIR_ROOM`
        FOREIGN KEY (`id_room`)
            REFERENCES `cinema-service`.`room` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_CHAIR_CHAIRTYPE`
        FOREIGN KEY (`id_chair_type`)
            REFERENCES `cinema-service`.`chair_type` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
