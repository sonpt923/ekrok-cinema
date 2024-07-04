CREATE SCHEMA `cinema-service`;

use
`cinema-service`;

CREATE TABLE `province`
(
    `id`         bigint       NOT NULL AUTO_INCREMENT,
    `code`       varchar(45)  NOT NULL,
    `name`       varchar(45)  NOT NULL,
    `image`      varchar(145) NOT NULL,
    `status`     INT          NOT NULL,
    `created_by` VARCHAR(45)  NOT NULL,
    `created_at` DATETIME     NOT NULL default NOW(),
    `updated_by` VARCHAR(45) NULL,
    `updated_at` DATETIME NULL,
    `deleted_at` DATETIME NULL,
    PRIMARY KEY (`id`)
);


CREATE TABLE `cinema-service`.`cinema`
(
    `id`          BIGINT       NOT NULL AUTO_INCREMENT,
    `code`        VARCHAR(45)  NOT NULL,
    `id_province` BIGINT       NOT NULL,
    `name`        VARCHAR(145) NOT NULL,
    `address`     VARCHAR(245) NOT NULL,
    `status`      INT          NOT NULL,
    `created_by`  VARCHAR(45)  NOT NULL,
    `created_at`  DATETIME     NOT NULL default NOW(),
    `updated_by`  VARCHAR(45) NULL,
    `updated_at`  DATETIME NULL,
    `deleted_at`  DATETIME NULL,
    PRIMARY KEY (`id`),
    INDEX         `FK_CINEMA_PROVINCE_idx` (`id_province` ASC) VISIBLE,
    CONSTRAINT `FK_CINEMA_PROVINCE`
        FOREIGN KEY (`id_province`)
            REFERENCES `cinema-service`.`province` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);



CREATE TABLE `cinema-service`.`room`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT,
    `id_cinema`  BIGINT       NOT NULL,
    `code`       VARCHAR(45)  NOT NULL,
    `name`       VARCHAR(145) NOT NULL,
    `price`      DECIMAL      NOT NULL,
    `status`     INT          NOT NULL,
    `created_by` VARCHAR(45)  NOT NULL,
    `created_at` DATETIME     NOT NULL default NOW(),
    `updated_by` VARCHAR(45) NULL,
    `updated_at` DATETIME NULL,
    `deleted_at` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    INDEX        `FK_ROOM_CINEMA_idx` (`id_cinema` ASC) VISIBLE,
    CONSTRAINT `FK_ROOM_CINEMA`
        FOREIGN KEY (`id_cinema`)
            REFERENCES `cinema-service`.`cinema` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION

);

CREATE TABLE `cinema-service`.`chair_type`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT,
    `code`       VARCHAR(45)  NOT NULL,
    `name`       VARCHAR(145) NOT NULL,
    `status`     INT          NOT NULL,
    `price`      DECIMAL      NOT NULL,
    `created_by` VARCHAR(45)  NOT NULL,
    `created_at` DATETIME     NOT NULL default NOW(),
    `updated_by` VARCHAR(45) NULL,
    `updated_at` DATETIME NULL,
    `deleted_at` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE,
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);

CREATE TABLE `cinema-service`.`chair`
(
    `id`            BIGINT      NOT NULL AUTO_INCREMENT,
    `id_room`       BIGINT      NOT NULL,
    `id_chair_type` BIGINT      NOT NULL,
    `code`          VARCHAR(45) NOT NULL,
    `position`      VARCHAR(45) NOT NULL,
    `status`        INT         NOT NULL,
    `created_by`    VARCHAR(45) NOT NULL,
    `created_at`    DATETIME    NOT NULL default NOW(),
    `updated_by`    VARCHAR(45) NULL,
    `updated_at`    DATETIME NULL,
    `deleted_at`    DATETIME NULL,
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
