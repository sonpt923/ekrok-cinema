CREATE SCHEMA `user`;

CREATE TABLE `user`.`ranks`
(
    `id`           BIGINT      NOT NULL AUTO_INCREMENT,
    `code`         VARCHAR(45) NOT NULL,
    `name`         VARCHAR(45) NOT NULL,
    `point`        BIGINT NOT NULL,
    `created_by`   VARCHAR(45) NOT NULL,
    `created_time` DATETIME    NOT NULL DEFAULT NOW(),
    `updated_by`   VARCHAR(45) NULL,
    `updated_time` DATETIME NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
    UNIQUE INDEX `code_UNIQUE` (`code` ASC) VISIBLE,
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
);

CREATE TABLE `user`.`user`
(
    `id`           BIGINT       NOT NULL AUTO_INCREMENT,
    `id_rank`      BIGINT       NOT NULL,
    `code`         VARCHAR(45)  NOT NULL,
    `name`         VARCHAR(145) NOT NULL,
    `username`     VARCHAR(45)  NOT NULL,
    `email`        VARCHAR(145) NOT NULL,
    `role`         BIGINT  NOT NULL,
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
    INDEX          `FK_USER_RANK_idx` (`id_rank` ASC) VISIBLE,
    CONSTRAINT `FK_USER_RANK`
        FOREIGN KEY (`id_rank`)
            REFERENCES `user`.`ranks` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);
