CREATE SCHEMA `booking`;

CREATE TABLE `booking`.`type_ticket`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(145) NOT NULL,
    `status`       BIGINT       NOT NULL,
    `note`         VARCHAR(145) NOT NULL,
    `price`        DECIMAL      NOT NULL,
    `created_by`   VARCHAR(45)  NOT NULL,
    `created_time` DATETIME     NOT NULL default NOW(),
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
);


CREATE TABLE `booking`.`show_time`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `id_room`      BIGINT      NOT NULL,
    `price`        DECIMAL     NOT NULL,
    `id_movie`     BIGINT      NOT NULL,
    `start_time`   DATETIME    NOT NULL,
    `end_time`     DATETIME    NOT NULL,
    `status`       BIGINT      NOT NULL,
    `created_time` DATETIME    NOT NULL default NOW(),
    `created_by`   VARCHAR(45) NOT NULL,
    `updated_time` DATETIME NULL,
    `updated_by`   VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE
);



CREATE TABLE `booking`.`order`
(
    `id`              BIGINT      NOT NULL AUTO_INCREMENT,
    `id_customer`     BIGINT NULL,
    `id_employee`     BIGINT NULL,
    `code`            VARCHAR(45) NOT NULL,
    `total_amount`    DECIMAL     NOT NULL,
    `discount_amount` DECIMAL     NOT NULL,
    `created_time`    DATETIME    NOT NULL default NOW(),
    `created_by`      VARCHAR(45) NOT NULL,
    `status`          BIGINT      NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE
);



CREATE TABLE `booking`.`ticket`
(
    `id`             BIGINT      NOT NULL AUTO_INCREMENT,
    `id_chair`       BIGINT      NOT NULL,
    `id_type_ticket` BIGINT      NOT NULL,
    `id_show_time`   BIGINT      NOT NULL,
    `id_order`       BIGINT      NOT NULL,
    `code`           VARCHAR(45) NOT NULL,
    `status`         BIGINT      NOT NULL,
    `created_by`     VARCHAR(45) NOT NULL,
    `created_time`   DATETIME    NOT NULL default NOW(),
    `updated_by`     VARCHAR(45) NULL,
    `updated_time`   DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
    INDEX            `FK_TICKET_TYPE_TICKET_idx` (`id_type_ticket` ASC) VISIBLE,
    INDEX            `FK_TICKET_SHOW_TIME_idx` (`id_show_time` ASC) VISIBLE,
    INDEX            `FK_TICKET_ORDER_idx` (`id_order` ASC) VISIBLE,
    CONSTRAINT `FK_TICKET_TYPE_TICKET`
        FOREIGN KEY (`id_type_ticket`)
            REFERENCES `booking`.`type_ticket` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_TICKET_SHOW_TIME`
        FOREIGN KEY (`id_show_time`)
            REFERENCES `booking`.`show_time` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `FK_TICKET_ORDER`
        FOREIGN KEY (`id_order`)
            REFERENCES `booking`.`order` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION

);

